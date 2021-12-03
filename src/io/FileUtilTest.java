package io;

import java.io.File;

public class FileUtilTest {

    public static void main(String[] args) {
         File DTO_validation = new File("C:\\Users\\Admin\\trainings\\epam-gyumri-trainings\\src\\io");
        FileUtil.search( DTO_validation, "File.txt");

        FileUtil.printPhoneNumbers();

        User user = new User();
        Address address = new Address();

        user.setUsername("Lanna \n");
        user.setPassword("ln1548n \n");
        user.setBankCardNumber("2548 7963 2114 \n");
        user.setId(125456);

        address.setCountry("Armenia");
        address.setCity("Gyumri");
        address.setStreet("16 street");
        address.setZipCode("3101");
        address.setLine1("12/3");
        user.setAddress(address);

        FileUtil.serialize(user, "C:\\Users\\Admin\\trainings\\epam-gyumri-trainings\\src\\io\\dir\\InfoAboutUser.txt");

        System.out.println(FileUtil.deserialize("C:\\Users\\Admin\\trainings\\epam-gyumri-trainings\\src\\io\\dir\\InfoAboutUser.txt"));
    }
}
