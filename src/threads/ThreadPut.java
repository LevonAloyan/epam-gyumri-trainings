package threads;

public class ThreadPut<T> implements Runnable{
    BoundedBuffer<T> boundedBuffer;
    T value;
     ThreadPut(BoundedBuffer<T> boundedBuffer, T value) {
         this.boundedBuffer = boundedBuffer;
         this.value = value;
         new Thread(this, "data exchanger").start();
     }

    @Override
    public void run() {
        boundedBuffer.put(value);
    }
}
