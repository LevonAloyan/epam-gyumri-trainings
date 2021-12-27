package mycollections;

public class DynamicArrayIndexOutOfBoundException extends IndexOutOfBoundsException{
    DynamicArrayIndexOutOfBoundException(int index) {
        super("Dynamic array index out of range: " + index);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.err.println("DynamicArrayIndexOutOfBoundException !");
    }
}
