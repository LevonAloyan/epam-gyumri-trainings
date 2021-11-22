package anotation;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestAdulthood {

   private LocalDate birthday;
   private int age;

    public int testAdulthood(LocalDate birthday) {
        this.birthday = LocalDate.from(birthday);
        this.age = (int) this.birthday.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public String getAdulthfood (int age) {
        if (this.age < 18) {
            System.out.println("False");
        }
        return "true";

    }
}
