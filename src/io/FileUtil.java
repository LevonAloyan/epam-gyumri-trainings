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

        File returntype = null;
        if (dirToSearchIn.exists() && dirToSearchIn.isDirectory()) {
            File[] directories = dirToSearchIn.listFiles();
            if (directories != null) {
                for (File file : directories) {
                    if (file.isDirectory()) {
                        search(file, fileNameMask);
                    } else if (file.toString().contains(fileNameMask)) {
                        returntype = file;
                        System.out.println(returntype);
                    }
                }
            }
        }
        return returntype;
    }

    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    public static void printPhoneNumbers() {
        File filePhoneNumbers = new File("src/io/PhoneNumber.txt");
        try {
            OutputStream outputStream = new FileOutputStream(filePhoneNumbers);
            for (int i = 98000000; i <= 98999999; i++) {
                byte[] bytes = ("0" + i + ",  ").getBytes();
                outputStream.write(bytes);
                if (i + 1 > 98999999) {
                    outputStream.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", filePhoneNumbers);
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

        try {
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(filePath));
            objectOut.writeObject(user.toString());
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     *
     * @param filePath
     * @return
     */
    public static Object deserialize(String filePath) {
        Object o = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            o = objectInputStream.readObject();
            objectInputStream.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o ;
    }
}