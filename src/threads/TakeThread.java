package threads;

public class TakeThread implements Runnable {

    PutAndTakeMethods method2;

    TakeThread(PutAndTakeMethods method2) {

        this.method2 = method2;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            method2.take();
        }
    }
}
