package concurrency;

public class Main {
    public static void main(String[] args) {
        BoundedBlockingBuffer<String> buffer = new BoundedBlockingBuffer<>();
        Producer<String> producer = new Producer<>(buffer, "aaa");
        Consumer<String> consumer = new Consumer<>(buffer);

            new Thread(producer).start();
            new Thread(producer).start();
            new Thread(producer).start();
            new Thread(producer).start();
            new Thread(producer).start();
            new Thread(producer).start();
            new Thread(producer).start();
            new Thread(producer).start();
            new Thread(producer).start();

            new Thread(consumer).start();
            new Thread(consumer).start();
            new Thread(consumer).start();
            new Thread(consumer).start();



    }
}
