package validation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import validation.anotation.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    @Length(min = 2,max = 30)
    private  String name;
    @Email
    private  String email;
    @Adulthood
    private  LocalDate birthday;
    @Min(0)
    @Max(100)
    private  int discountRate;

}