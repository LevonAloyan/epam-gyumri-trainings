package multiThread;

public class Buffer<V> {

    private V data;
    private boolean monitor;


    public synchronized V take() {
        while (!monitor) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        monitor = false;
        notify();

//        System.out.println("метод put() доступен");
        return data;
    }

    public synchronized void put(V data) {
        while (monitor) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        monitor = true;
        notify();
    }

    @Override
    public String toString() {
        return "Buffer{" +
                "date=" + data +
                ", monitor=" + monitor +
                '}';
    }
}
