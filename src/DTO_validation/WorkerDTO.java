package DTO_validation;

import DTO_validation.Annotation.*;

import java.time.LocalDate;

public class WorkerDTO {

    @Length(minvalue = 5, maxvalue = 15, nameErrorMessage = "Name field length is not valid " )
    private String namePerson;
    private String nameErrorMessage;

    @Email(emailErrorMassage = "This fields does not contain an email address ")
    private String emailPerson;
    private String emailErrorMessage;

    @Min(valueMin = 0, minErrorMessage = "The number is  less than the limit specified in the parameter ")
    @Max(valueMax = 100, maxErrorMessage = "The number exceed the limit specified in the parameter ")
    private Integer discountRatePerson;
    private String minErrorMessage;
    private String maxErrorMessage;

    public WorkerDTO(String name, String email, int discountRate) {
        this.namePerson = name;
        this.emailPerson = email;
        this.discountRatePerson = discountRate;
    }

    public String getName() {
        return namePerson;
    }

    public void setName(String name) {
        this.namePerson = name;
    }

    public String getEmail() {
        return emailPerson;
    }

    public void setEmail(String email) {
        this.emailPerson = email;
    }

    public int getDiscountRate() {
        return discountRatePerson;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRatePerson = discountRate;
    }

}
