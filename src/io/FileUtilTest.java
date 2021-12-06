package io;

import java.io.File;
import java.util.List;

public class FileUtilTest {
    public static void main(String[] args) {

        List<File> filesToSearch = FileUtil.search(new File("src/io"), "new_crab_1.jpeg");
        for (File file : filesToSearch) {
            System.out.println(file);
        }

        FileUtil.printPhoneNumbers("src/io/phoneNumbers.txt");

        Address address = new Address("Armenia", "Gyumri", "3101", "Matnishyan", "46");
        User user = new User(12233L, "Alina", "pass",
                "1234567", "098888888", address);

        FileUtil.serialize(user, "src/io/UserInfo.txt");
        System.out.println(FileUtil.deserialize("src/io/UserInfo.txt"));
    }
}