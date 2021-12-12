package threads;

public class Consumer<T> implements Runnable {

    private BoundedBlockingBuffer<T> consumer;

    public Consumer() {
    }

    public Consumer(BoundedBlockingBuffer<T> buffer) {
        this.consumer = buffer;
    }

    public BoundedBlockingBuffer<T> getConsumer() {
        return consumer;
    }

    public void setConsumer(BoundedBlockingBuffer<T> consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try {
            consumer.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
