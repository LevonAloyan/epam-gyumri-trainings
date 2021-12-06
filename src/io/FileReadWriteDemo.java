package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReadWriteDemo {


    public static void main(String[] args) {
        String fileName = "C:\\epamGyumri\\epam-gyumri-trainings\\src\\io\\newDir\\test.txt";
        writeIntoFile(fileName);
        readFromFile(fileName);
    }

    private static void readFromFile(String fileName){
        try {
            InputStream inputStream = new FileInputStream(fileName);
            int byteToRead;
            while ((byteToRead = inputStream.read())!= -1){
                System.out.print((char) byteToRead);
            }


        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", fileName);
        } catch (IOException e) {
            System.out.println("Error during write");
        }
    }

    private static void writeIntoFile(String fileName) {
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            byte[] bytes = "Bye World".getBytes();
            outputStream.write(bytes);

        } catch (FileNotFoundException e) {
            System.out.printf("File %s not found", fileName);
        } catch (IOException e) {
            System.out.println("Error during write");
        }
    }

}
