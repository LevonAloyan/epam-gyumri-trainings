package ThreadWin;

public class BufferTest {
    public static void main(String[] args) {
        BufferBounded<Integer> bufferBounded = new BufferBounded<>();

        Thread thread = new Thread(() -> {
            while (true) {
                bufferBounded.put(1);
            }
        });
        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("Take: " + bufferBounded.take());
            }
        });
        thread.start();
        thread1.start();

    }
}
