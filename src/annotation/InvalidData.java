package annotation;

import java.lang.reflect.Field;

public class InvalidData {

    private final Class<?> aClass;
    private final Field field;
    private final Object value;
    private final Class<?> annotationClass;

    public InvalidData(Class<?> aClass, Field field, Object value, Class<?> annotationClass) {
        this.aClass = aClass;
        this.field = field;
        this.value = value;
        this.annotationClass = annotationClass;
    }

    @Override
    public String toString() {
        return "InvalidData{" +
                "Class name: " + aClass.getName() +
                ", Field name: " + field.getName() +
                ", Value: " + value +
                ", Doesnt match annotation: " + annotationClass.getName() +
                '}';
    }
}
