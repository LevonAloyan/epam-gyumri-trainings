package io;

import java.io.*;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;

public class FileUtil {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = "C:\\epamGyumri\\epam-gyumri-trainings\\src\\io\\newDir";
        File fileDirectory = new File(path);
        List<File> fileList = FileUtil.search(fileDirectory, "test.txt");
        System.out.println(fileList);
        FileUtil.printPhoneNumbers();

        Address address = new Address("Armenia", "Gyumri", "03125555", "Shirakatsi", "1");
        User user = new User(1, "Adam", "Smith", "0000", "077777777", address);

        FileUtil.serialize(user, "C:\\epamGyumri\\epam-gyumri-trainings\\src\\io\\newDir\\serialize.txt");
        User userDeserialize = FileUtil.deserialize("C:\\epamGyumri\\epam-gyumri-trainings\\src\\io\\newDir\\serialize.txt");
        System.out.println(userDeserialize);

    }

    private static final List<File> FILE_LIST = new LinkedList<>();

    public static List<File> search(File dirToSearchIn, String fileNameMask) {

        File[] list = dirToSearchIn.listFiles();
        if (list != null)
            for (File fil : list) {
                if (fil.isDirectory()) {
                    search(fil, fileNameMask);
                } else if (fileNameMask.equalsIgnoreCase(fil.getName())) {
                    FILE_LIST.add(fil);
                }
            }

        return FILE_LIST;
    }


    public static void printPhoneNumbers() throws FileNotFoundException {
        int x = 93000000;

        FileOutputStream fOStream = new FileOutputStream("C:\\epamGyumri\\epam-gyumri-trainings\\src\\io\\phoneNumbers.txt");
        try (DataOutputStream dOS = new DataOutputStream(fOStream)) {
            while (x <= 93000050) {
                dOS.writeBytes("0" + x);
                dOS.write(10);
                x++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void serialize(User user, String filePath) {
        String encodedBankCardNumber = Base64.getEncoder().encodeToString(user.getBankCardNumber().getBytes());

        user.setBankCardNumber(encodedBankCardNumber);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(user);
            outputStream.close();
            System.out.println("User was successfully saved");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static User deserialize(String filePath) {
        User user = null;
        try (FileInputStream fIStream = new FileInputStream(filePath);
             ObjectInputStream oIStream = new ObjectInputStream(fIStream)) {
            user = (User) oIStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }
}
