package algorithms;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ProfilingAnnotationProcessor {
    public  void  profiling(Object object, int [] array) throws InvocationTargetException, IllegalAccessException {
        Class<?> aClass =  object.getClass();
        if (aClass.isAnnotationPresent(Profiling.class)) {
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (Modifier.isPublic(method.getModifiers())) {
                    System.out.println("Profiling started for " + method.getName());
                    long start = System.nanoTime();
                    if (method.getName().equals("sortByQuickSorting")) {
                        method.invoke(object, array, 0, array.length - 1);
                    } else {
                        method.invoke(object, array);
                    }
                    long end = System.nanoTime();
                    System.out.println("Profiling is completed in " + (end - start));
                }
            }
        }
    }
}
