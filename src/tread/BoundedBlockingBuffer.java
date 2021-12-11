package tread;

public class BoundedBlockingBuffer {
    private String data;
    private boolean flag = true;


    public synchronized void put(String data){
        while (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Tread interrupted " + e);
            }
        }
        flag = false;

        this.data = data;
        notifyAll();
    }

    public synchronized String take(){
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted" + e);
            }
        }
        flag = true;

        notifyAll();
        return data;
    }
}
