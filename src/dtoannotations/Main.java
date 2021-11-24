package dtoannotations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Validator validator = new Validator();
        LocalDate birthDay = LocalDate.of(2019, 7, 9);
        List<List<String>> list = new ArrayList<>();
        list.add(validator.validate(new CustomerDTO("Hex", "Heghinգ@mail.ru", birthDay, 6)));
        for (List<String> strings : list) {
            System.out.println(strings);
        }
    }
}
