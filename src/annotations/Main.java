package annotations;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws  IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("G","gtepanosyan@gmail.com",LocalDate.of(2007,01,06),-5);

       AnnotationInterface processors = new AdulthoodAnnotationProcess<LocalDate>();
        processors.process(customerDto);

        processors = new LengthAnnotationProcess<String>();
        processors.process(customerDto);

         processors = new EmailAnnotationProcess<String>();
        processors.process(customerDto);

         processors = new MaxAnnotationProcess<Integer>();
        processors.process(customerDto);

         processors = new MinAnnotationProcess<Integer>();
        processors.process(customerDto);

    }
}
