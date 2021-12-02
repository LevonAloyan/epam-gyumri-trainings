package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileFactory {

    public static void main(String[] args) {
        copy("src/io/newDir/new_crab_1.jpeg");
    }


    public static void copy(String filePath){
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(filePath));
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("src/io/newDir/crab_clone.jpeg"));
        ) {
            int byteToRead;
            while ((byteToRead = inputStream.read()) !=-1){
               outputStream.write(byteToRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
