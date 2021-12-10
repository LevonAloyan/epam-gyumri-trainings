package thread;

public class Test {
    public static void main(String[] args) {
        BoundedBuffer<Object> buffer = new BoundedBuffer<>();
        Object value;

        buffer.put("1");
        buffer.put(2);
        buffer.put("3");


        System.out.println("Is Buffer full? " + buffer.isFull());

        value = buffer.take();
        System.out.println("Element taken from Buffer: " + value);

        value = buffer.take();
        System.out.println("Element taken from Buffer: " + value);

        value = buffer.take();
        System.out.println("Element taken from Buffer: " + value);

        System.out.println("Is Buffer empty? " + buffer.isEmpty());


    }
}
