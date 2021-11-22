package algorithms;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)
        throws InvocationTargetException, IllegalAccessException {
        //SortingAlgorithms sortingAlgorithms =
        //    new SortingAlgorithms();
        //ProfilingAnnotationProcessor processor=
        //    new ProfilingAnnotationProcessor();

      //  int [] array = {123,34,34,34,345,67,78,67456,45,0};
      //  processor.profiling(sortingAlgorithms,array);

        CustomerDto customerDto = new CustomerDto();
        customerDto.setBirthday(LocalDate.of(2007,11,25));
        customerDto.setEmail("gtepanosyan@gmail.com");
        customerDto.setName("G");
       customerDto.setDiscountRate(-5);


        AdulthoodAnnotationProcess process = new AdulthoodAnnotationProcess();
        process.checkMajority(customerDto);

        LengthAnnotationProcess lengthProcess = new LengthAnnotationProcess();
        lengthProcess.checkName(customerDto);

        EmailAnnotationProcess emailAnnotationProcess = new EmailAnnotationProcess();
        emailAnnotationProcess.checkEmail(customerDto);

        MaxAnnotationProcess maxAnnotationProcess = new MaxAnnotationProcess();
        maxAnnotationProcess.checkMax(customerDto);

        MinAnnotationProcess minAnnotationProcess = new MinAnnotationProcess();
        minAnnotationProcess.checkMin(customerDto);
    }
}
