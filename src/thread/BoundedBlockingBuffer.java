package thread;

public class BoundedBlockingBuffer<T> {

    private T data;
    private boolean  window = false;

    public synchronized void put(T data){
        while (window){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.data == null){
            window = true;
            this.data = data;
            System.out.println(data);
            notify();
        }
    }

    public synchronized T take() {
        while (!window){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T data = this.data;
        if(this.data != null){
            window = false;
            this.data = null;
            notify();
        }
        return data;

    }
}
