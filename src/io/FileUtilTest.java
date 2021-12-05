package io;

import java.io.File;

public class FileUtilTest {
    public static void main(String[] args) {
        String pathSerialized="src/io/User.txt";
        String filePath="src/io/";
        File dirToSearchIn=new File(filePath);
        String fileNameMask="address";
        FileUtil.printPhoneNumbers();
        FileUtil.search(dirToSearchIn,fileNameMask);
        User user=new User();
        user.setId(3);
        user.setUsername("asd");
        user.setAddress(new Address());
        user.setPassword("asd");
        user.setBankCardNumber("89");
        user.setPhoneNumber("098");
        FileUtil.serialize(user,pathSerialized);
        FileUtil.deserialize(pathSerialized);
    }
}
