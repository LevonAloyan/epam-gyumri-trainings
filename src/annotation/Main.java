package annotation;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Validator validator = new Validator();
        LocalDate birthDay = LocalDate.of(2055, 7, 11);
        List<String> list = validator.validate(new Customer("Alina", "alinamkh:).com", birthDay, 7));
        for (String listItem : list) {
            System.out.println(listItem);
        }


    }
}