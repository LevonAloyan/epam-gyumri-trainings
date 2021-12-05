package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static void main(String[] args) {

        printPhoneNumbers();

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
        List<File> result = new ArrayList<>();

        File[] listContent = dirToSearchIn.listFiles();
        if (listContent != null) {
            for (final File file : listContent) {
                if (file.isDirectory()) {
                    search(file, fileNameMask);
                }
                else if (file.getName().equals(fileNameMask)) {
                    result.add(file);
                }
            }
        }
        return result;
    }


    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    public static void printPhoneNumbers() {
        String fileOfphone = "phoneList.txt";
        String message;
        try {
            OutputStream outputStream = new FileOutputStream(fileOfphone);
            for (int i = 93000000; i <= 93999999; i++) {
                message = "0" + i + "\n";
                byte[] bytes = message.getBytes();
                outputStream.write(bytes);
                if (i > 93999999) {
                    outputStream.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", fileOfphone);
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
    public static void serialize(User user, String filePath) throws IOException {
          ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
          objectOutputStream.writeObject(user);
          objectOutputStream.close();
    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     *
     * @param filePath
     * @return
     */
    public static User deserialize(String filePath) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        Object object = objectInputStream.readObject();
        User user = (User) object;
        return user;
    }

}
