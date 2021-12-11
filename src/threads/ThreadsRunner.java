package threads;

public class ThreadsRunner {
    public static void main(String[] args) {
        PutAndTakeMethods<String> methods = new PutAndTakeMethods<>();

        Thread putThread = new Thread(() -> {
            while (true) {
                methods.put("1");
            }
        });

        Thread takeThread = new Thread(() -> {
            while (true) {
                methods.take();
            }
        });

        putThread.start();
        takeThread.start();

    }
}
