package dtoannotations;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Validator validator = new Validator();
        LocalDate birthDay = LocalDate.of(2019, 7, 9);
        List<String> list = validator.validate(new CustomerDTO("Hex", "Hհegh@mail.ru", birthDay, 6));
        for (String listItem : list) {
            System.out.println(listItem);
        }

    }
}
