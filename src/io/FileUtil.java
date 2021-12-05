package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static void main(String[] args) {

        printPhoneNumbers();
        System.out.println(search("src/io/)", "phoneNumber.txt"));

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
    public static List<File> search(String dirToSearchIn, String fileNameMask) {
        List<File> list = new ArrayList<>();
        File[] f = new File(dirToSearchIn).listFiles();
        if (f != null) {
            for (File child : f) {
                if (fileNameMask.equalsIgnoreCase(child.getName())) {
                    list.add(child);
                } else if (child.isDirectory()) {
                    search(String.valueOf(child), fileNameMask);
                }
            }
        }
        return list;
    }


    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    public static void printPhoneNumbers() {
        String fileName = "phoneNumbers.txt";
        String message;
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            for (int i = 93000000; i <= 93999999; i++) {
                message = "0" + i + "\n";
                byte[] bytes = message.getBytes();
                outputStream.write(bytes);
                if (i > 93999999) {
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

        User us = new User();
        try {
            FileOutputStream fStream = new FileOutputStream(filePath);
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(us);
            oStream.close();
            fStream.close();

            System.out.println("Object has been serialized");

        } catch (IOException e) {
            System.out.println("IOException is caught");
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
            FileInputStream fStream = new FileInputStream(filePath);
            ObjectInputStream oStream = new ObjectInputStream(fStream);

           user = (User) oStream.readObject();
            oStream.close();
            fStream.close();

            System.out.println("Object has been deserialized ");

        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        }
        return user;

    }
}


