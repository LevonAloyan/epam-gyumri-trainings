package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class PutThread implements Runnable{
    BoundedBlockingBuffer b;
    PutThread(BoundedBlockingBuffer b){
        this.b=b;
        new Thread(this).start();
    }
    @Override
    public void run() {
     int i=0;
        while (true){

                b.put(++i);
        }

    }
}
