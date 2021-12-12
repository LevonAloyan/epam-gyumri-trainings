package tread;

public class BoundedBlockingBuffer <T> {

    private T date;
    private boolean control;

    public synchronized T take() {
        while (!control){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        control=false;
        notify();
        System.out.println("Method PUT Available:");
        return date;
    }

    public synchronized void put(T date){
       while (control){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       this.date=date;
       control=true;
       notify();
        System.out.println("Method Take Available");

    }

    @Override
    public String toString() {
        return "BoundedBlockingBuffer{" +
                "date=" + date +
                ", control=" + control +
                '}';
    }
}
