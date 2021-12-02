package DTO_validation;

import DTO_validation.annotation.*;

public class WorkerDTO {

    @Length(minValue = 5, maxValue = 15, nameErrorMessage = "Name field length is not valid ")
    private String nameWorker;
    private String nameErrorMessage;

    @Email(emailErrorMassage = "This fields does not contain an email address ")
    private String emailWorker;
    private String emailErrorMessage;

    @Min(minValue = 0, minErrorMessage = "The number is  less than the limit specified in the parameter ")
    @Max(maxValue = 100, maxErrorMessage = "The number exceed the limit specified in the parameter ")
    private Integer discountRateWorker;
    private String minErrorMessage;
    private String maxErrorMessage;

    public WorkerDTO(String name, String email, int discountRate) {
        this.nameWorker = name;
        this.emailWorker = email;
        this.discountRateWorker = discountRate;
    }

    public String getName() {
        return nameWorker;
    }

    public void setName(String name) {
        this.nameWorker = name;
    }

    public String getEmail() {
        return emailWorker;
    }

    public void setEmail(String email) {
        this.emailWorker = email;
    }

    public int getDiscountRate() {
        return discountRateWorker;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRateWorker = discountRate;
    }

}
