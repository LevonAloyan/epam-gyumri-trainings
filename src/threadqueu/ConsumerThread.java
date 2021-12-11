package threadqueu;

public class ConsumerThread<T> extends BaseThread{
    public ConsumerThread(QueueThread queue) {
        super(queue, "Consumer");
    }

    @Override
    protected void runThread() {
        for (int i = 0; i <= 100; i++) {
            queue.get();
        }
    }
}
