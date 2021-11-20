package dtoannotations;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Validator validator = new Validator();
        LocalDate localDate = LocalDate.of(2019, 7, 9);
        List<String> list = validator.validate(new CustomerDTO("Hex", "մ", localDate, 6));
        for (String l : list) {
            System.out.println(l);
        }

    }
}
