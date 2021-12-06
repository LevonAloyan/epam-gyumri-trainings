package io;

import java.io.File;

public class FileUtilTest {
    public static void main(String[] args){
        String pathSerialized="src/io/User.txt";
        String fileNameMask="src/io/";
        File dirToSearchIn=new File(fileNameMask);
        FileUtil.printPhoneNumbers();
        FileUtil.search(dirToSearchIn,fileNameMask);
        User user=new User();
        user.setId(5);
        user.setUsername("abc");
        user.setAddress(new Address());
        user.setPassword("adf");
        user.setBankCardNumber("92");
        user.setPhoneNumber("093");
        FileUtil.serialize(user,pathSerialized);
    }

}


