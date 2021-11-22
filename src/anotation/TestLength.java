package anotation;



public class TestLength {
    public String testLength(String name) {
        if (name == null) {
            throw new NullPointerException("The name can`t be empty.");
        }
        if (name.length() < 2 || name.length() > 30) {
            throw new RuntimeException("The length of the name should be from 3 to 30");
        }
        return "true";

    }
}








