package io;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileUtil {
    User user = new User();
    public static void main(String[] args) {
        //todo Method 1 Write into txt file
        printPhoneNumbers();
        //todo Method 2 Write into txt file
        //writeIntoFile();

        //todo get files directory
        File directory = new File("C:\\Users\\REDstore\\IdeaProjects\\epam-gyumri-trainings\\src\\io");
            //todo find .txt execute files in directory
        for (File dir :search(directory,".txt")) {
           System.out.println(dir.getName());
        }
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
    //todo Find .txt execute files
    public static  List<File> search(File dirToSearchIn,String fileNameMask) {
        File[] filesArray = dirToSearchIn.listFiles();
        List<File> fileList = new ArrayList<>();
        if (filesArray != null) {
            for (File fileLoop : filesArray) {
                if (fileLoop.isDirectory()) {
                    return search(fileLoop, fileNameMask);
                } else if (fileLoop.getName().endsWith(fileNameMask)) {
                    fileList.add(fileLoop);
                } else if (fileNameMask.equalsIgnoreCase(fileLoop.getName())) {
                    System.out.println(fileLoop.getParentFile());
                }
            }
        }
            return fileList;
        }

//    public static List<File> Run(File dirToSearchIn, String fileNameMask) {
//        File[] lists = dirToSearchIn.listFiles();
//        List<File> files = new ArrayList<>();
//        if (lists != null)
//            for (File file : lists) {
//
//                if (file.getName().endsWith(fileNameMask)) {
//                    files.add(file);
//                } else if (fileNameMask.equals(file.getName())) {
//                    System.out.println("This file is used");
//                }
//            }
//        return files;
//    }




    /**
     * Write into .txt file all possible combinations of phone numbers that start with your phone code
     * for example, my phone code is 098. In the output file must be phone numbers starting from 098000000 to 098999999
     */
    //todo Method 1 Write into txt file
    private static void printPhoneNumbers() {
        File fileName = new File("io/newDir/filename.txt");
        String message;
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            for (int i = 98000000; i <= 98999999; i++) {
                message = ("0" + i + "\n");
                byte[] bytes = message.getBytes();
                outputStream.write(bytes);
                if (i + 1 > 98999999) {
                    outputStream.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", fileName);
        } catch (IOException e) {
            System.out.println("Error during write");
        }
    }
    //todo Method 2 Write into txt file
/*
    public static void writeIntoFile() {
        String fileName = "io/newDir/phoneNumbers.txt";
        FileOutputStream fileOutputStream =null;
        OutputStream outputStream = createFileOutputStream(fileOutputStream, fileName);
        for (int i = 98000000; i <= 98999999; i++) {
            writeInto("0" + i + "\n", outputStream);
            if (i+1 > 98999999) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void writeInto(String phoneNumber, OutputStream outputStream) {
        byte[] bytes = phoneNumber.getBytes();
        try {
            outputStream.write(bytes);
        } catch (IOException e) {
            System.out.println("Error during write");
        }
    }
    public static OutputStream createFileOutputStream(FileOutputStream outputStream,String fileName){
        if (outputStream==null){
            try {
                return new FileOutputStream(fileName);
            } catch (FileNotFoundException e) {
                System.out.printf("File %s not found", fileName);
            }
        }
        return outputStream;
    }
*/
    /**
     * Serialize the object to a file, excluding the phone field and encrypt the bank card number
     * (you can use Base64 https://www.baeldung.com/java-base64-encode-and-decode)
     *
     * @param user
     * @param filePath
     */
    public static void serialize(User user, String filePath) {

    }

    /**
     * Deserialize the object from the file by decrypting the card number.
     *
     * @param filePath
     * @return
     */
    public static User deserialize(String filePath) {

        return null;
    }

}
