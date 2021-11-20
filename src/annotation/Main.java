package annotation;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        CostumeAnnotation costumeAnnotation=new CostumeAnnotation();
        CustomerDto customerDto=new CustomerDto("skkkk");

        System.out.println(costumeAnnotation.length(customerDto));
    }

}

