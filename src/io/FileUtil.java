package io;

import java.io.*;
import java.util.*;

public class FileUtil {

    public static void main(String[] args) {

        printPhoneNumbers();

        List<File> search = search(
                new File("C:\\Users\\Nune\\epam-gyumri-trainings\\src\\io\\newDir"),
                "*");

        for (File file : search) {
            System.out.println(file.getName());
        }

        Address address = new Address("Armenia", "Gyumri", "3000", "Qrqrqoryan", "242");
        User user = new User(888882, "Samvel", "AAA2211", "4020131782345687", "098213399", address);
        serialize(user,"src/io/File.txt");
        deserialize("src/io/File.txt");


    }


    /**
     * Implement a method that will find files matching the specified filename mask.
     * Note that in the specified directory, in addition to the files themselves, there may also be other directories,
     * you need to search for files in subdirectories as well. (sounds like a recursion).
     *
     * @param dirToSearchIn directory to search files
     * @param fileNameMask  file name mask to match files name
     * @return list of files
     */
    public static List<File> search(File dirToSearchIn, String fileNameMask) {
        if (dirToSearchIn == null || dirToSearchIn.isFile()) {
            System.err.println("Error while processing");
            return Collections.EMPTY_LIST;
        }
        if (fileNameMask == null || fileNameMask.isEmpty()) {
            System.err.println("File mask is blank");
            return Collections.EMPTY_LIST;
        }

        List<File> resultList = new ArrayList<>();
        search0(resultList, dirToSearchIn, fileNameMask);

        return resultList;
    }

    private static void search0(List<File> resultList, File currentDir, String fileNameMask) {
        File[] filesInCurrentDirectory = searchFilesInCurrentDirectory(currentDir);
        addMatchedFiles(filesInCurrentDirectory,fileNameMask,resultList);

        File[] subDirs = findSubDirs(currentDir);
        for (File subDir : subDirs) {
            search0(resultList, subDir,fileNameMask);
        }

    }

    private static File[] findSubDirs(File currentDir) {
        return currentDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
    }

    private static File[] searchFilesInCurrentDirectory(File currentDir) {
        return currentDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isFile();
            }
        });
    }

    /**
     * test* //fsdtest-1, 3test
     * *test //3test
     * *test* // 3test-1
     *  *
     *
     *
     * @param files
     * @param fileNameMask
     * @param resultList
     */
    private static void addMatchedFiles(File[] files, String fileNameMask, List<File> resultList){
        if (fileNameMask.equals("*")){
            resultList.addAll(Arrays.asList(files));
            return;
        }
        for (File file : files) {
            if (fileNameMask.endsWith("*") && fileNameMask.startsWith("*")){
                String fileNameToSearch = fileNameMask.substring(1, fileNameMask.length() - 1);
                if (file.getName().contains(fileNameToSearch)){
                    resultList.add(file);
                }
            }else if (fileNameMask.endsWith("*")){
                String prefix = fileNameMask.substring(0, fileNameMask.indexOf("*"));
                if (file.getName().startsWith(prefix)){
                    resultList.add(file);
                }
            } else if (fileNameMask.startsWith("*")){
                String suffix = fileNameMask.substring(fileNameMask.indexOf("*")+ 1);
                if (file.getName().endsWith(suffix)){
                    resultList.add(file);
                }
            }
        }
    }


    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    public static void printPhoneNumbers() {
        String fileName = "src/io/phoneNumbers.txt";
        String message;
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            for (int i = 98000000; i <= 98999999; i++) {
                message = "0" + i + "\n";
                byte[] bytes = message.getBytes();
                outputStream.write(bytes);
                if (i > 98999999) {
                    outputStream.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", fileName);
        } catch (IOException e) {
            System.out.println("Error during write");
        }
    }


    /**
     * Serialize the object to a file, excluding the phone field and encrypt the bank card number
     * (you can use Base64 https://www.baeldung.com/java-base64-encode-and-decode)
     *
     * @param user
     * @param filePath
     */
    public static void serialize(User user, String filePath) {
        String encodedString = Base64.getEncoder().encodeToString(user.getBankCardNumber().getBytes());
        user.setBankCardNumber(encodedString);

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     *
     * @param filePath
     * @return
     */
    public static User deserialize(String filePath) {

        User user = null;
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
            user = (User) objectInputStream.readObject();
            byte[] decodedBytes = Base64.getDecoder().decode(user.getBankCardNumber());
            String decodedString = new String(decodedBytes);
            user.setBankCardNumber(decodedString);
            System.out.println(user);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return user;
    }

}
