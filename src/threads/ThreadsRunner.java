package threads;

public class ThreadsRunner {
    public static void main(String[] args) {
        PutAndTakeMethods<String> methods = new PutAndTakeMethods<>();

        new Thread(new PutThread(methods)).start();
        new Thread(new TakeThread(methods)).start();
    }
}
