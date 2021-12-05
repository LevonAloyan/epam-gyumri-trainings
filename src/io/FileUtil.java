package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class FileUtil {

    public static void main(String[] args) {
//        File file = new File("C:\\Users\\VG\\epam-gyumri-trainings\\src");
//        System.out.println(search(file, "user.bin"));
//        Address address = new Address("RA", "Gyumri", "3125", "105ave", "123");
//        User user = new User(1, "AAA", "1", "0123456789123456", "099", address);
//        serialize(user, "src\\io\\user.bin");
//        deserialize("src\\io\\user.bin");
        File file = new File("src\\io\\phoneNumbers.txt");
        printPhoneNumbers("092", file);
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
        List<File> files = new ArrayList<>();
        if (dirToSearchIn.isDirectory() && dirToSearchIn != null) {
            File[] arr = dirToSearchIn.listFiles();
            for (File file : arr) {
                if (file.isFile() && file.getName().equals(fileNameMask)) {
                    System.out.println(file.getName());
                    files.add(file);
                    return files;
                }
                search(file, fileNameMask);
            }
        }
        return files;
    }

    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    public static void printPhoneNumbers(String phoneCode, File file) {

        String message;
        try {
            OutputStream outputStream = new FileOutputStream(file);
            for (int i = 1000000; i <= 1999999; i++) {
                message = phoneCode + Integer.valueOf(i).toString().substring(1,7) + "\n";
                byte[] bytes = message.getBytes();
                outputStream.write(bytes);
                if (i > 1999999) {
                    outputStream.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", file);
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
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\io\\user.bin"))) {
            oos.writeObject(user);
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
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\io\\user.bin"))) {
            user = (User) ois.readObject();
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }

}
