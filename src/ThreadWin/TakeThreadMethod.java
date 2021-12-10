package ThreadWin;

public class TakeThreadMethod implements Runnable{
    BufferBounded bufferBounded;
    TakeThreadMethod(BufferBounded bufferBounded){
        this.bufferBounded =bufferBounded;
        new Thread(this).start();

    }
    @Override
    public void run() {
        while (true){
            bufferBounded.take();
    }}
}
