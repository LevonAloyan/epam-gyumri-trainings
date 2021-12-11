package tread;

public class Main {
    public static void main(String[] args) {
        BoundedBlockingBuffer boundedBlockingBuffer = new BoundedBlockingBuffer();
        Thread sender = new Thread(new Sender(boundedBlockingBuffer));
        Thread receiver = new Thread(new Receiver(boundedBlockingBuffer));

        sender.start();
        receiver.start();
    }
}