package thread;

public class ThreadTest {
    private static Object BoundedBlockingBuffer;

    public static void main(String[] args) {
        BoundedBlockingBuffer<Integer> buffer = new BoundedBlockingBuffer<>();
        Thread  thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    buffer.put(15);
                }

            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println(buffer.take());
                }
            }
        });
        thread.start();
        thread1.start();
    }
}
