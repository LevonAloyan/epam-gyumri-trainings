package bounded_buffer;

public class BoundedBlockingBuffer<T> {

    private T data;
    private boolean isTouched = true;

    protected synchronized void put(T data)  {
        while (isTouched){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (this.data == null){
            this.data = data;
            System.out.println("Data assigned succesfully " + data);

        }
        isTouched = true;
        notify();
    }

    protected synchronized T take() {
        while(!isTouched){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T temp = this.data;
        if (this.data != null) {
            this.data = null;
        }
        isTouched = false;
        notify();
        return temp;
    }



}
