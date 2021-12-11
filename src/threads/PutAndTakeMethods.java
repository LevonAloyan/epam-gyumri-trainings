package threads;

public class PutAndTakeMethods<T> {

    private T data;
    private boolean var = false;

    synchronized void put(T data) {
        while (var)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        if (this.data == null) {
            this.data = data;
            var = true;
            System.out.println("Put " + data);
            notifyAll();
        }
    }

    synchronized T take() {
        while (!var)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        if (this.data != null) {
            var = false;
            System.out.println("Take " + data);
            this.data = null;
            notifyAll();
        }
        return data;
    }
}
