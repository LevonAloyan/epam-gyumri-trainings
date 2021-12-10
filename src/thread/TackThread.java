package thread;

public class TackThread implements Runnable {
    BoundedBlockingBuffer b;
    TackThread(BoundedBlockingBuffer b){
        this.b=b;
        new Thread(this).start();

    }
    @Override
    public void run() {
        while (true){
            b.take();
        }

    }
}
