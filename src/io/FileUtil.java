package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class FileUtil {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println(FileUtil.search(new File("src/io/newDir"), "test.txt"));
        printPhoneNumbers("077", "src/io/phoneNumbers.txt");
        Address address = new Address("Armenia", "Gyumri", "111", "Shirakaci", "11");
        User user = new User(1, "AAA", "123232", "18453124", "077000000", address);
        serialize(user, "src/io/newDir/test.txt");
        User user1 = deserialize("src/io/newDir/test.txt");
        System.out.println(user1.getAddress().getCity());
        System.out.println(user1.getBankCardNumber());
        System.out.println(user1.getPhoneNumber());
        System.out.println(user1.getId());
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
        if (!dirToSearchIn.isDirectory()) {
            throw new IllegalArgumentException(dirToSearchIn + " is not directory");
        }
        List<File> searchedFiles = new ArrayList<>();
        File[] list = dirToSearchIn.listFiles();
        if (list != null) {
            for (File file : list) {
                if (file.getName().equals(fileNameMask)) {
                    searchedFiles.add(file);
                }
                if (file.isDirectory()) {
                    searchedFiles.addAll(search(file, fileNameMask));
                }
            }
        }
        return searchedFiles;
    }


    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    public static void printPhoneNumbers(String phoneCode, String filePath) throws IOException {
        StringBuilder phoneNumbers = new StringBuilder();
        int count = 1;
        for (int i = 0; i <= 999999; i++, count++) {
            String phoneNumber = phoneCode + "0".repeat(Math.max(0, 6 - Integer.valueOf(i).toString().length())) + i;
            phoneNumbers.append(phoneNumber).append(", ");
            if (count == 10) {
                phoneNumbers.append("\n");
                count = 0;
            }
        }
        String content = phoneNumbers.toString();
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }


    /**
     * Serialize the object to a file, excluding the phone field and encrypt the bank card number
     * (you can use Base64 https://www.baeldung.com/java-base64-encode-and-decode)
     *
     * @param user
     * @param filePath
     */
    public static void serialize(User user, String filePath) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(outputStream)) {
             out.writeObject(user);
        }
    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     *
     * @param filePath
     * @return
     */
    public static User deserialize(String filePath) throws IOException, ClassNotFoundException {
        User user;
        try (FileInputStream inputStream = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(inputStream)) {
            user = (User) in.readObject();
        }
        return user;
    }

}
