package bounded_buffer;

public class BoundedBlockingBufferTest {

    public static void main(String[] args) {
        BoundedBlockingBuffer<String> boundedBlockingBuffer = new BoundedBlockingBuffer<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    boundedBlockingBuffer.put("1");
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println(boundedBlockingBuffer.take());
                }
            }
        });

        thread.start();

        thread1.start();
    }
}
