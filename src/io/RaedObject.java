package io;

import java.io.*;

public class RaedObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("people.bin");
            ObjectInputStream obj = new ObjectInputStream(fileInputStream);

            Person person1 = (Person) obj.readObject();
            Person person2 = (Person) obj.readObject();
            System.out.println(person1);
            System.out.println(person2);

            obj.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
