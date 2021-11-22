package dto;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Validator validator = new Validator();
        LocalDate birthDay = LocalDate.of(2011, 11, 21);

        List<String> list = validator.validate(new CustomerDto("Ann", "Armine@gmail", birthDay, 9));
        for (String listItem : list) {
            System.out.println(listItem);
        }

    }
}