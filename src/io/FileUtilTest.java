package io;

import java.io.File;

public class FileUtilTest {
    public static void main(String[] args){
        String pathSerialized="src/io/User.txt";
        String fileNameMask="src/io/";
        File dirToSearchIn=new File(fileNameMask);
        FileUtil.printPhoneNumbers(); User user=new User();
        user.setId(1);
        user.setUsername("abs");
        user.setAddress(new Address());
        user.setPassword("ads");
        user.setBankCardNumber("77");
        user.setPhoneNumber("093");
        
    }
}
