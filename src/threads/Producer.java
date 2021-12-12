package threads;

public class Producer<T> implements Runnable {
    private BoundedBlockingBuffer<T> producer;
    private T data;

    public Producer(BoundedBlockingBuffer buffer, T data) {
        this.producer = buffer;
        this.data = data;
    }

    public void setProducer(BoundedBlockingBuffer<T> producer) {
        this.producer = producer;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public void run() {
        try{
            producer.put(data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
