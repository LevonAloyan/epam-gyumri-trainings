package io;

import java.io.*;
import java.util.*;

public class FileUtil {

    private static ArrayList<File> list = new ArrayList<File>();

    public static void main(String[] args) {

//        printPhoneNumbers();

//        File dir = new File("src/io");
//        System.out.println(search(dir, ".txt"));

        Address address = new Address("Armenia", "Gyumri", "3112", "Jdanov", "10");
        User user = new User(85967, "Ani", "vfdc5544", "89457231", "98541234",address);

        serialize(user, "src/io/newDir/serial.txt");
        System.out.println(deserialize("src/io/newDir/serial.txt"));
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
        File[]  files = dirToSearchIn.listFiles();
        for(File file : files){
            if(file.isDirectory()){
                search(file, fileNameMask);
            }else{
                if(file.getName().endsWith(fileNameMask)){
                    list.add(file);
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
        String fileName = "src/io/phoneNumbers.txt";
        String message;
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            for (int i = 98000000; i <= 98999999; i++) {
                message = "0" + i + "\n";
                byte[] bytes = message.getBytes();
                outputStream.write(bytes);
                if (i > 98999999) {
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
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            objectOutputStream.writeObject(user);
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
    public static User deserialize(String filePath) {
        User user = null;
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
            user = (User) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }

}
