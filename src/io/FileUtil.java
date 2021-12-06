package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class FileUtil {
    public static void main(String[] args) {
        //todo Method 1 Write into txt file
        printPhoneNumbers();
        //todo Method 2 Write into txt fi]le
        //writeIntoFile();

        //todo get files directory
        File directory = new File("C:\\Users\\REDstore\\IdeaProjects\\epam-gyumri-trainings");
        //todo find .txt execute files in directory
        //todo Prints twice because of the OUT folder
        for (File dir : search(directory, ".txt")) {
            if (directory.isDirectory()){
            search(directory,".txt");
                System.out.println(dir.getName());
            }
        }
        //todo serializable
        Address address = new Address("Armenia", "Gyumri", "3026", "P. Sevak", "13");
        User user = new User(23000000000L, "garikLogIn", "drowssap1092387456", "0129834765", "098232577", address);
        user.setPhoneNumber("*******");
        String userFile = "C:\\Users\\REDstore\\IdeaProjects\\epam-gyumri-trainings\\src\\io\\newDir\\tst.txt";
        serialize(user,userFile);
        User desUs = deserialize(userFile);
        System.out.println(desUs);
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
    //todo Find .txt execute files
    public static List<File> search(File dirToSearchIn, String fileNameMask) {
        File[] filesArray = dirToSearchIn.listFiles();
        List<File> fileList = new ArrayList<>();
            for (File fileLoop : filesArray) {
                if (fileLoop.isDirectory() && !fileLoop.getName().equalsIgnoreCase("out")) {
                    fileList.addAll(search(fileLoop, fileNameMask));
                } else if (fileLoop.getName().endsWith(fileNameMask)) {
                    fileList.add(fileLoop);
                }
            }
        return fileList;
    }
    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    //todo Method 1 Write into txt file
    private static void printPhoneNumbers() {
        File fileName = new File("io/newDir/filename.txt");
        String message;
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            for (int i = 98000000; i <= 98999999; i++) {
                message = ("0" + i + "\n");
                byte[] bytes = message.getBytes();
                outputStream.write(bytes);
                if (i + 1 > 98999999) {
                    outputStream.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", fileName);
        } catch (IOException e) {
            System.out.println("Error during write");
        }
    }
    //todo Method 2 Write into txt file
/*
    public static void writeIntoFile() {
        String fileName = "io/newDir/phoneNumbers.txt";
        FileOutputStream fileOutputStream =null;
        OutputStream outputStream = createFileOutputStream(fileOutputStream, fileName);
        for (int i = 98000000; i <= 98999999; i++) {
            writeInto("0" + i + "\n", outputStream);
            if (i+1 > 98999999) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void writeInto(String phoneNumber, OutputStream outputStream) {
        byte[] bytes = phoneNumber.getBytes();
        try {
            outputStream.write(bytes);
        } catch (IOException e) {
            System.out.println("Error during write");
        }
    }
    public static OutputStream createFileOutputStream(FileOutputStream outputStream,String fileName){
        if (outputStream==null){
            try {
                return new FileOutputStream(fileName);
            } catch (FileNotFoundException e) {
                System.out.printf("File %s not found", fileName);
            }
        }
        return outputStream;
    }
*/

    /**
     * Serialize the object to a file, excluding the phone field and encrypt the bank card number
     * (you can use Base64 https://www.baeldung.com/java-base64-encode-and-decode)
     *
     * @param user
     * @param filePath
     */
    public static void serialize(User user, String filePath) {
        String codedBankNumber = Base64.getEncoder().encodeToString(user.getBankCardNumber().getBytes());
        user.setBankCardNumber(codedBankNumber);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             user  =  (User) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }

}
