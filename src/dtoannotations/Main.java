package dtoannotations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        LocalDate birthDay = LocalDate.of(2019, 7, 9);
        CustomerDTO customerDTO = new CustomerDTO("Hex", "Heghinգ@mail.ru", birthDay, 6);

        ValidationProcessor<CustomerDTO> chainOfProcessors = ChainOfProcessors.chainOfProcessors();
        chainOfProcessors.process(customerDTO);

    }
}
