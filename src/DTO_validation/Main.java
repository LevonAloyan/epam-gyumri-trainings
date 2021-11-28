package DTO_validation;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Validator validator = new Validator();
        CastomerDto castomerDto = new CastomerDto("J", "juliangmailcom", LocalDate.of(2016, 05, 14),-15);
        String[] errorsCastomerDTO = validator.validateMeth(castomerDto);
        System.out.println("CastomerDTO errors - " + Arrays.toString(errorsCastomerDTO));


        WorkerDTO workerDTO = new WorkerDTO("M", "Mmm.com", 252);
        String[] errorsPersonDTO = validator.validateMeth(workerDTO);
        System.out.println("WorkerDTO errors - " + Arrays.toString(errorsPersonDTO));
    }
}
