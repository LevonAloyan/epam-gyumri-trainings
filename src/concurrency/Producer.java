package concurrency;

public class Producer <T> implements Runnable{
    private BoundedBlockingBuffer<T> producer;
    private T data;

    public Producer(BoundedBlockingBuffer producer, T data) {
        this.producer = producer;
        this.data = data;
    }

    public Producer(BoundedBlockingBuffer<String> buffer) {
    }

    @Override
    public void run() {
        try{
            producer.put(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BoundedBlockingBuffer<T> getProducer() {
        return producer;
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
}
