package io;

import java.io.File;

public class FileUtilTest {

    public static void main(String[] args) {
        File algorithms = new File("src/algorithms");
        FileUtil.search( algorithms, "File.txt");

        FileUtil.printPhoneNumbers();

        User user = new User();
        Address address = new Address();

        user.setUsername("AliԱլինաna \n");
        user.setPassword("ali21 \n");
        user.setBankCardNumber("2548 7963 6666 \n");
        user.setId(16263646);
        user.setPhoneNumber("093370401");

        address.setCountry("Armenia");
        address.setCity("Gyumri");
        address.setStreet("27/10");
        address.setZipCode("3601");
        address.setLine1("12/3");
        user.setAddress(address);


        FileUtil.serialize(user, "src/io/InfoAboutUser.txt");

        System.out.println(FileUtil.deserialize("src/io/InfoAboutUser.txt"));
    }
}