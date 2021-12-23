package bounded_buffer;

public class BoundedBlockingBuffer<T> {

   private final Object[] boundedBlockingBuffer;
   private int putPos;
   private int takePos;
   private int count;

    public BoundedBlockingBuffer(int bound) {
        boundedBlockingBuffer = new Object[bound];
    }


    public synchronized void put(T object){
        try {
            while (isFull()){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doPut(object);
        notifyAll();
    }

    public synchronized T take(){
        try {
            while (isEmpty()){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        T element = doTake();
        notifyAll();
        return element;
    }

    public synchronized boolean isFull(){
        return count == boundedBlockingBuffer.length;
    }

    public synchronized boolean isEmpty(){
        return count == 0;
    }

    protected synchronized void doPut(T object){
        boundedBlockingBuffer[putPos] = object;
        if(++putPos == boundedBlockingBuffer.length){
            putPos = 0;
        }
        ++count;
    }

    protected synchronized T doTake(){
        T element = (T) boundedBlockingBuffer[takePos];
        if(++takePos == boundedBlockingBuffer.length){
            takePos = 0;
        }
        --count;
        return element;
    }
}
