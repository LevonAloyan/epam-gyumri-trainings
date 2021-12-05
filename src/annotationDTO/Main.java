package annotationDTO;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args)  {
        LocalDate birthDay = LocalDate.of(2021, 12, 5);
        Customer customerDTO = new Customer("Al", "Alimkh@gmail.com", birthDay, 7);

        ValidationProcessor<Customer> chainOfProcessors = ChainOfProcessors.chainOfProcessors();
        chainOfProcessors.process(customerDTO);

    }
}