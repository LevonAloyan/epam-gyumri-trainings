package dto;
import java.time.LocalDate;

public class CustomerDto {

        @Length(min = 4, max = 30)
        private String name;
        @Email
        private String email;
        @Adulthood
        private LocalDate birthday;
        @Min(minValue = 0)
        @Max(maxValue = 100)
        private int discountRate;

        public CustomerDto(String name, String email, LocalDate birthday, int discountRate) {
            this.name = name;
            this.email = email;
            this.birthday = birthday;
            this.discountRate = discountRate;
        }

}
