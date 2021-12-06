package io;

import java.io.*;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;

public class FileUtil {

    public static void main(String[] args) {

        printPhoneNumbers();


        Address address = new Address("Armenia", "Gyumri", "Sovxoz", "237/508", "29007");
        User user = new User(123, "gugo.atanesyan", "gugo", "123456789", "077189189", address);
        serialize(user, "user_data.txt");
        deserialize("user_data.txt");
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

        return null;
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

        String encodedString = Base64.getEncoder().encodeToString(user.getBankCardNumber().getBytes());
        System.out.println(encodedString);
        user.setBankCardNumber(encodedString);
        try (FileOutputStream outputStream = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(outputStream)) {
            out.writeObject(user);


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


        try (FileInputStream inputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            User user = (User) objectInputStream.readObject();
            byte[] decodedBytes = Base64.getDecoder().decode(user.getBankCardNumber());
            String decodedString = new String(decodedBytes);
            user.setBankCardNumber(decodedString);

            System.out.println(user);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
