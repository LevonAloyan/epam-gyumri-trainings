package thread;

public class BoundedBlockingBuffer<T> {

    private T data;
    private boolean door = false;


    public synchronized void put(T data) {
        while (door) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.data == null) {
            door = true;
            this.data = data;
            System.out.println(data);
            notify();
        }

    }

    public synchronized T take() {
        while(!door){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        T data=this.data;
        if(this.data!=null){

            this.data=null;
            door=false;
            notify();
        }
        return data;

    }
}


