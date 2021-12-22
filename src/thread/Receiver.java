package thread;

public class Receiver<T> implements Runnable {

    private BoundedBlockingBuffer<T> buffer;

    public Receiver() {
    }

    public Receiver(BoundedBlockingBuffer<T> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            buffer.take();
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
}

