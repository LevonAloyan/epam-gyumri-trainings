package threads;

public class ThreadTake<T> implements Runnable{
    BoundedBuffer <T> boundedBuffer;

     ThreadTake(BoundedBuffer<T> boundedBuffer) {

         this.boundedBuffer = boundedBuffer;
         new Thread(this, "data put").start();
    }

    @Override
    public void run() {
        System.out.println(boundedBuffer.take());
    }
}
