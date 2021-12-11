package threads;

public class PutThread implements Runnable {

    PutAndTakeMethods method1;

    PutThread(PutAndTakeMethods method1) {
        this.method1 = method1;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            method1.put(0);
        }
    }
}
