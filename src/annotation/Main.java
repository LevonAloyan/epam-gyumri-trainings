package annotation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        Validator validator = new Validator();
        LocalDate birthDay = LocalDate.of(2005, 7, 11);
        List<List<String>> list = new ArrayList<>();
        list.add(validator.validate(new Customer("ALI", "alinamkh:)@gmail.com", birthDay, 6)));
        for (List<String> strings : list) {
            System.out.println(strings);
        }
    }
}