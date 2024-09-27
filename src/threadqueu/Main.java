package threadqueu;

public class Main {
    public static void main(String[] args) {
        QueueThread queue = new QueueThread();
        new ProducerThread(queue);
        new ConsumerThread(queue);
    }
}
