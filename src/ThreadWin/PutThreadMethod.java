package ThreadWin;

public class PutThreadMethod implements Runnable{
    BufferBounded bufferBounded;
    PutThreadMethod(BufferBounded bufferBounded){
        this.bufferBounded=bufferBounded;
        new Thread(this).start();
    }
    @Override
    public void run() {
        while(true) {
            bufferBounded.put(0);
        }
    }
}
