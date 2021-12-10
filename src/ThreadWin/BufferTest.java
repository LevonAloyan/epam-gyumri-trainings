package ThreadWin;

public class BufferTest {
    public static void main(String[] args) {
        BufferBounded<String> bufferBounded = new BufferBounded<>();
        new Thread(new TakeThreadMethod(bufferBounded)).start();
        new Thread(new PutThreadMethod(bufferBounded)).start();
    }
}
