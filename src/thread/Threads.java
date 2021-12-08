package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Threads {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread thread = new Thread(new Runner());
        thread.start();
        Callable<Integer> callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <= 100; i++) {
                System.out.println("Thread 1 " + i);
            }
        }
    }
    static class Runner implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i <= 100; i++) {
                System.out.println("Runnable 1 " + i);
            }
        }
    }
    static  class MyCallable implements Callable<Integer>{
        int a=0;
        @Override
        public Integer call() throws Exception {
            for (int i = 0; i < 100; i++) {
                a = i;
                System.out.println("Callable " +a);
            }return a;
        }
    }

}
