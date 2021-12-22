package thread;

public class Sender<T> implements Runnable {

    private BoundedBlockingBuffer<T> buffer;

    private T data;

    public Sender() {
    }

    public Sender(BoundedBlockingBuffer<T> buffer, T data) {
        this.buffer = buffer;
        this.data = data;
    }

    @Override
    public void run() {
        try {
            buffer.put(data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public BoundedBlockingBuffer<T> getBuffer() {
        return buffer;
    }

    public void setBuffer(BoundedBlockingBuffer<T> buffer) {
        this.buffer = buffer;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

