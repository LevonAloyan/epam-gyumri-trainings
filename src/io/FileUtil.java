package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class FileUtil {
    private final static String USERDATA = "/Users/narekmuradyan/IdeaProjects/epam-gyumri-trainings/src/io/userData.txt";

    public static void main(String[] args) {

//        printPhoneNumbers();


        User user = new User(20L, "poxos", "poxosyan", "1111", "093234814",
                new Address("Armenia", "Gyumri", "2323", "Tumanyan", "23"));



        serialize(user, USERDATA);
        System.out.println(deserialize(USERDATA));


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
        List<File> fileArrayList = new ArrayList<>();
        File[] files = dirToSearchIn.listFiles();
        try {
            for (File file : files) {
                if (file.isDirectory()) {
                    search(file, fileNameMask);
                } else if (file.getName().equalsIgnoreCase(fileNameMask)) {
                    System.out.println(file.getName());
                    fileArrayList.add(file);


                }

            }
        } catch (NullPointerException e) {
            System.out.println("There are no files in this directory");
        }


        return fileArrayList;


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
        String encodedBankCardNumber = Base64.getEncoder().encodeToString(user.getBankCardNumber().getBytes());

        user.setBankCardNumber(encodedBankCardNumber);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(user);
            outputStream.close();
            System.out.println("User was successfully saved");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     *
     * @param filePath
     * @return
     */
    public static User deserialize(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            User user = (User) objectInputStream.readObject();
            byte[] decodedBytes = Base64.getDecoder().decode(user.getBankCardNumber());
            user.setBankCardNumber(new String(decodedBytes));
            return user;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }

        return null;

    }

}
