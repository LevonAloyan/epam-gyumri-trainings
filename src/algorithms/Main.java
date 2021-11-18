package algorithms;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args)
        throws InvocationTargetException, IllegalAccessException {
        SortingAlgorithms sortingAlgorithms =
            new SortingAlgorithms();
        ProfilingAnnotationProcessor processor=
            new ProfilingAnnotationProcessor();

        int [] array = {123,34,34,34,345,67,78,67456,45,0};
        processor.profiling(sortingAlgorithms,array);

    }

}
