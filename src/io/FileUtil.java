package io;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileUtil {

    private static List<File> resultFromSearch = new LinkedList<>();


    /**
     * Implement a method that will find files matching the specified filename mask.
     * Note that in the specified directory, in addition to the files themselves, there may also be other directories,
     * you need to search for files in subdirectories as well. (sounds like a recursion).
     *
     * @param dirToSearchIn directory to search files
     * @param fileNameMask  file name mask to match files name
     */

    public static List<File> search(File dirToSearchIn, String fileNameMask) {

        File[] list = dirToSearchIn.listFiles();
        if (list != null)
            for (File fil : list) {
                if (fil.isDirectory()) {
                    search(fil, fileNameMask);
                } else if (fileNameMask.equalsIgnoreCase(fil.getName())) {
                    resultFromSearch.add(fil);
//                    System.out.println(resultFromSearch);
                }
            }

        return resultFromSearch;
    }


    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     * <p>
     */
    public static void printPhoneNumbers() throws FileNotFoundException {

        int x = 93000000;

        FileOutputStream fOStream = new FileOutputStream("src/io/newDir/level2/phoneNumberDoc.txt");
        try (DataOutputStream dOS = new DataOutputStream(fOStream)) {
            while (x <= 93000050) { // x<=93999999
                dOS.writeBytes("0" + x);
                dOS.write(10);
                x++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Serialize the object to a file, excluding the phone field and encrypt the bank card number
     * (you can use Base64 https://www.baeldung.com/java-base64-encode-and-decode)
     * <p>
     * @param user
     * @param filePath
     */
    public static void serialize(User user, String filePath) {

        try (FileOutputStream foStream = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(foStream)) {
            oos.writeObject(user);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     * <p>
     * @param filePath
     * @return
     */
    public static User deserialize(String filePath) {

        User user = null;

        try (FileInputStream fIStream = new FileInputStream(filePath);
             ObjectInputStream oIStream = new ObjectInputStream(fIStream)) {
            user = (User) oIStream.readObject();
//            System.out.println(user);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return user;
    }

}
