package annotations;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
        throws InvocationTargetException, IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("G","gtepanosyan@gmail.com",LocalDate.of(2007,01,06),-5);

       AnnotationInterface processors = new AdulthoodAnnotationProcess();
        processors.process(customerDto);

        processors = new LengthAnnotationProcess();
        processors.process(customerDto);

         processors = new EmailAnnotationProcess();
        processors.process(customerDto);

         processors = new MaxAnnotationProcess();
        processors.process(customerDto);

         processors = new MinAnnotationProcess();
        processors.process(customerDto);

    }
}
