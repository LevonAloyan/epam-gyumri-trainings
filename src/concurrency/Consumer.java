package concurrency;

public class Consumer <T> implements Runnable{

    private BoundedBlockingBuffer<T> consumer;

    public Consumer(BoundedBlockingBuffer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try{
            consumer.take();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BoundedBlockingBuffer<T> getConsumer() {
        return consumer;
    }

    public void setConsumer(BoundedBlockingBuffer<T> consumer) {
        this.consumer = consumer;
    }
}
