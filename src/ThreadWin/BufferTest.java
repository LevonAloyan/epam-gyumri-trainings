package ThreadWin;

public class BufferTest {
    public static void main(String[] args) {
        BufferBounded bufferBounded=new BufferBounded();
        new PutThreadMethod(bufferBounded);
        new TakeThreadMethod(bufferBounded);
    }
}
