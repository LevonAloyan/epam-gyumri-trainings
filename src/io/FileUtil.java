package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {


    /**
     * Implement a method that will find files matching the specified filename mask.
     * Note that in the specified directory, in addition to the files themselves, there may also be other directories,
     * you need to search for files in subdirectories as well. (sounds like a recursion).
     *
     * @param dirToSearchIn directory to search files
     * @param fileNameMask file name mask to match files name
     * @return list of files
     */
    public static List<File> search(File dirToSearchIn, String fileNameMask) {
        List<File> fileList = new ArrayList<>();
        File[] files = dirToSearchIn.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                fileList.add(files[i]);
            return null;
            }else if(files[i].isDirectory()) {

            search(files[i], fileNameMask);
            }
        }
        return fileList;
    }




    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    public static void printPhoneNumbers(){
        try {
            PrintWriter fileout = new PrintWriter(new FileWriter("src/io/phoneNumber.txt"));
            for (int i =93000000; i <=93999999; i++) {
                fileout.println(i);
            }
            fileout.close();
            System.out.println("successful");
        } catch (Exception e)
        {
            System.out.println(e);
        }



    }

    /**
     * Serialize the object to a file, excluding the phone field and encrypt the bank card number
     * (you can use Base64 https://www.baeldung.com/java-base64-encode-and-decode)
     * @param user
     * @param filePath
     */
    public static void serialize(User user, String filePath){
        try { FileOutputStream fileOut = new FileOutputStream(filePath);
            DataOutputStream out = new DataOutputStream(fileOut);
            out.writeChars(String.valueOf(user));
            out.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     * @param filePath
     * @return
     */
    public static User deserialize(String filePath){
        return null;
    }

}
