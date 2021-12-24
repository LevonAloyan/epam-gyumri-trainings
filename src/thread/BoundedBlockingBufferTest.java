package thread;

public class BoundedBlockingBufferTest {
    public static void main(String[] args) {
        BoundedBlockingBuffer<String> buffer = new BoundedBlockingBuffer<>();

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buffer.put("INSTANCE");
            System.out.println("Thread exiting");
        });

        Thread thread1 = new Thread(() ->
                System.out.println(buffer.take()));
        thread.start();
        thread1.start();
    }
}
