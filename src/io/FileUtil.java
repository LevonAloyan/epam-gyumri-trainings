package io;

import java.io.*;
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
        List<File> destList = new ArrayList<>();
        if (dirToSearchIn != null && fileNameMask != null) {
            File[] listFiles = dirToSearchIn.listFiles();
            if (listFiles != null) {
                for (File neededFile : listFiles) {
                    // we also can use contains method if we want to search file using some letters
                    if (neededFile.isFile() && neededFile.getName().equals(fileNameMask)) {
                        System.out.print(neededFile.getName() + " file was found. ");
                        System.out.println("Path of the file is: " + neededFile.getPath());
                        destList.add(neededFile);
                    } else if (neededFile.isDirectory()) {
                        search(neededFile, fileNameMask);
                        destList.add(neededFile);
                    }
                }
            }
        }
        return destList;
    }


    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    public static void printPhoneNumbers(String filePath) {
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath))) {
            int i = 98000000;
            while (i <= 98999999) {
                String phoneNumber = "0" + (i++) + "\n";
                bufferedOutputStream.write(phoneNumber.getBytes());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Error occurred during file writing");
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
        if (user != null && filePath != null) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
                if (user.getBankCardNumber() != null) {
                    String bankCardNumber = user.getBankCardNumber();
                    String encryptedCardNumber = Base64.getEncoder().encodeToString(bankCardNumber.getBytes());
                    user.setBankCardNumber(encryptedCardNumber);
                }
                objectOutputStream.writeObject(user);
            } catch (FileNotFoundException e) {
                System.out.println("File was not found");
            } catch (IOException e) {
                System.out.println("Error occurred during file writing");
            }
        }
    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     *
     * @param filePath
     * @return
     */
    public static User deserialize(String filePath) {
        User newUser = null;
        if (filePath != null) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
                newUser = (User) objectInputStream.readObject();
                if (newUser.getBankCardNumber() != null) {
                    String bankCardNumber = newUser.getBankCardNumber();
                    byte[] decryptedCardNumber = Base64.getDecoder().decode(bankCardNumber.getBytes());
                    newUser.setBankCardNumber(new String(decryptedCardNumber));
                }
            } catch (FileNotFoundException e) {
                System.out.println("File was not found");
            } catch (IOException e) {
                System.out.println("Error occurred during file writing");
            } catch (ClassNotFoundException e) {
                System.out.println("Class was not found");
            }
        }
        return newUser;
    }
}

