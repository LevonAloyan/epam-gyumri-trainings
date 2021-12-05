package io;

import java.io.File;

public class FileUtilTest {

    public static void main(String[] args) {
        File IO = new File("C:\\Users\\Admin\\trainings\\epam-gyumri-trainings\\src\\io");
        FileUtil.search(IO, "InfoAboutUser.txt");

        FileUtil.printPhoneNumbers();

        User user = new User();
        Address address = new Address();

        user.setUsername("Lanna \n");
        user.setPassword("ln1548n \n");
        user.setBankCardNumber("3548 7963 2114 \n");
        user.setId(125456);

        address.setCountry("Armenia");
        address.setCity("Gyumri");
        address.setStreet("16 street");
        address.setZipCode("3101");
        address.setLine1("12/3");
        user.setAddress(address);

        final String pathname = "C:\\Users\\Admin\\trainings\\epam-gyumri-trainings\\src\\io\\dir\\InfoAboutUser.txt";

        FileUtil.serialize(user, pathname);

        System.out.println(FileUtil.deserialize(pathname));
    }
}
