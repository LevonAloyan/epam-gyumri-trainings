package threadqueu;


public class ProducerThread<T>  extends BaseThread {
    public ProducerThread(QueueThread queue) {
        super(queue, "Producer");

    }

    @Override
    protected void runThread() {
        for (int i = 0; i <= 100; i++) {
            queue.put(i);
        }
    }

}