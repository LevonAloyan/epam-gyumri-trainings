package io;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person("Vanik", 2);
        Person person2 = new Person("Ashot", 3);
        try {
            FileOutputStream file = new FileOutputStream("people.bin");
            ObjectOutputStream outputStream = new ObjectOutputStream(file);

            outputStream.writeObject(person1);
            outputStream.writeObject(person2);

            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }