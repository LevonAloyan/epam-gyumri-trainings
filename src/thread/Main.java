package thread;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BoundedBlockingBuffer<String> buffer = new BoundedBlockingBuffer<>();
        Sender<String> sender = new Sender<>(buffer, "KKK");
        Receiver<String> receiver = new Receiver<>(buffer);
        for (int i = 0; i < 5; i++) {
            new Thread(sender).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(receiver).start();
        }
    }

}
