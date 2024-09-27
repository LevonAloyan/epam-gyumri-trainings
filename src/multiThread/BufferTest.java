package multiThread;


import java.util.Stack;

public class BufferTest {
    public static void main(String[] args) {

        Buffer<String> stringBuffer = new Buffer<>();
//        Buffer<Integer> integerBuffer=new Buffer<>();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println("thread 1 put value " + i);
                    stringBuffer.put("value: " + i + " add time " + System.currentTimeMillis());
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println(stringBuffer.take() + " (The thread 2 get value)");
                }
            }
        });

        thread1.start();
        thread2.start();

        System.out.println(thread1.isAlive());
        System.out.println(thread2.isAlive());

    }
}
