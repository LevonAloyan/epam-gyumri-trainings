package DTO_validation;

import DTO_validation.processor.AnnotationProcessor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        CustomerDTO customerDto = new CustomerDTO("J", "juliangmail.com", LocalDate.of(2018, 05, 14), -15);
        AnnotationProcessor<CustomerDTO> chainOfProcessorForCustomerDTO = ChainOfProcessors.getChainOfProcessors();
        chainOfProcessorForCustomerDTO.validate(customerDto);
        System.out.println();

        WorkerDTO workerDTO = new WorkerDTO("M", "Mmm.com", 252);
        AnnotationProcessor<WorkerDTO> chainOfProcessorForWorkerDTO = ChainOfProcessors.getChainOfProcessors();
        chainOfProcessorForWorkerDTO.validate(workerDTO);
    }
}
