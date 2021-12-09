package io;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


public class FileUtil {

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
        File[] files = dirToSearchIn.listFiles();
        List<File> list = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                String name = file.getName();
                String fileName = name.replaceFirst("[.^][^.]+$", "");

                if (file.isDirectory() && !file.getName().equalsIgnoreCase("out")) {
                    list.addAll(search(file, fileNameMask));
                } else if (fileNameMask.endsWith("*") && fileNameMask.startsWith("*")) {
                    String fileNameToSearch = fileNameMask.substring(1, fileNameMask.length() - 1);
                    if (fileName.matches(".*\\w" + fileNameToSearch + "\\w.*")) {
                        list.add(file);
                    }
                } else if (fileNameMask.endsWith("*")) {
                    String prefix = fileNameMask.substring(0, fileNameMask.indexOf("*"));
                    if (fileName.startsWith(prefix)) {
                        list.add(file);
                    }
                } else if (fileNameMask.startsWith("*")) {
                    String suffix = fileNameMask.substring(fileNameMask.indexOf("*") + 1);
                    if (fileName.endsWith(suffix)) {
                        list.add(file);
                    }
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
        String fileName = "src/io/newDir/phoneNumbers.txt";
        String message;
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            for (int i = 93000000; i <= 93000010; i++) {//93999999
                message = "0" + i + "\n";
                byte[] bytes = message.getBytes();
                outputStream.write(bytes);
            }
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.err.printf("File %s not found", fileName);
        } catch (IOException e) {
            System.err.println("Error during write");
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

        String encodeBankCardNumber = Base64.getEncoder().encodeToString(user.getBankCardNumber().getBytes());
        String encodePhoneNumber = Base64.getEncoder().encodeToString(user.getPhoneNumber().getBytes());
        user.setBankCardNumber(encodeBankCardNumber);
        user.setPhoneNumber(encodePhoneNumber);

        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            ObjectOutputStream ous = new ObjectOutputStream(outputStream);
            ous.writeObject(user);
            ous.close();
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
    public static User deserialize(User user, String filePath) {

        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            user = (User) ois.readObject();
            byte[] decodeBankCardNumber = (Base64.getDecoder().decode(user.getBankCardNumber().getBytes()));
            String decodedStringBankCardNumber = new String(decodeBankCardNumber);
            user.setBankCardNumber(decodedStringBankCardNumber);
            byte[] decodePhoneNumber = Base64.getDecoder().decode(user.getPhoneNumber().getBytes());
            String decodedStringPhoneNumber = new String(decodePhoneNumber);
            user.setPhoneNumber(decodedStringPhoneNumber);
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found");
        } catch (IOException e) {
            System.out.printf("Error during read");
        } catch (ClassNotFoundException e) {
            System.out.printf("Class not found");
        }
        return user;
    }
}

