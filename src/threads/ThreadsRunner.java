package threads;

public class ThreadsRunner {
    public static void main(String[] args) {
        PutAndTakeMethods<String> methods = new PutAndTakeMethods<>();

        new PutThread(methods);
        new TakeThread(methods);
    }
}
