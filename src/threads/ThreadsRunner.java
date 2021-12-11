package threads;

public class ThreadsRunner {
    public static void main(String[] args) {
        PutAndTakeMethods<String> methods = new PutAndTakeMethods<>();

        Thread putThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    methods.put("Davo");
                }
            }
        });

        Thread takeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    methods.take();
                }
            }
        });

        putThread.start();
        takeThread.start();

    }
}
