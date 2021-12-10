package thread;

public class BoundBlockBufferTest {
    public static void main(String[] args) {
        BoundedBlockingBuffer b=new BoundedBlockingBuffer();
        new PutThread(b);
        new TackThread(b);
    }
}
