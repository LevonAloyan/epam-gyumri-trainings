package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Base64;
import java.util.List;

public class FileUtilTest {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "src/io/newDir";
        File directory = new File(path);
        List<File> fileList = FileUtil.search(directory, "test.txt");
        System.out.println(fileList);

        FileUtil.printPhoneNumbers();

        Address address = new Address("Armenia", "Gyumri", "0312", "sayan-nova", "5/5");
        User user = new User(1, "poxos", "poxos", "1111", "093",address);

        FileUtil.serialize(user, "src/io/newDir/level2/serialize.txt");
        User userDeserialize = FileUtil.deserialize("src/io/newDir/level2/serialize.txt");
        System.out.println(userDeserialize);
        System.out.println(userDeserialize.getBankCardNumber());

    }
}
