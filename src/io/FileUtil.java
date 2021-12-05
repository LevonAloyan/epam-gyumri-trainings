package io;

import java.io.*;

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
    public static File search(File dirToSearchIn, String fileNameMask) {
        File returnFile = null;
        if (dirToSearchIn.exists() && dirToSearchIn.isDirectory()) {
            File[] directories = dirToSearchIn.listFiles();
            if (directories != null) {
                for (File file : directories) {
                    if (file.isDirectory()) {
                        search(file, fileNameMask);
                    } else if (file.toString().contains(fileNameMask)) {
                        returnFile = file;
                        System.out.println(returnFile);
                    }
                }
            }
        }
        return returnFile;
    }

    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    public static void printPhoneNumbers() {
        File phoneNumbersFile = new File("C:\\Users\\Admin\\trainings\\epam-gyumri-trainings\\src\\io\\dir\\PhoneNumber.txt");
        try (OutputStream outputStream = new FileOutputStream(phoneNumbersFile)) {
            for (int i = 98000000; i <= 98999999; i++) {
                byte[] bytes = ("0" + i + ",  ").getBytes();
                outputStream.write(bytes);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", phoneNumbersFile);
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
        try (ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOut.writeObject(user.toString());
        } catch (Exception ex) {
            System.out.println("Exception during serialization: " + ex);
        }
    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     *
     * @param filePath
     * @return
     */
    public static Object deserialize(String filePath) {
        Object object = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            object = objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception during deserialization: " + e);
        }
        return object;
    }
}