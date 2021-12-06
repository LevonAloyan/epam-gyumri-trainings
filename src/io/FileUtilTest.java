package io;

import java.io.File;

public class FileUtilTest {

    public static void main(String[] args) {

        File dirToSearchIn = new File("/Users/davit/IdeaProjects/epam-gyumri-trainings");
        for (File dir : FileUtil.search(dirToSearchIn, ".txt")) {
            System.out.println(dir.getName());
        }

        FileUtil.printPhoneNumbers();

        String filePath = "src/io/newDir/user.txt";
        Address address = new Address("Armenia", "Gyumri", "0213",
                "Kazachi-Post", "29/24");
        User user = new User(22, "DavBalabekyan", "****", "3676",
                "093907107", address);

        FileUtil.serialize(user, filePath);
        System.out.println(FileUtil.deserialize(filePath));
    }
}
