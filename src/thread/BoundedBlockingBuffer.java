package thread;

public class BoundedBlockingBuffer <B> {
     B instance;

    public synchronized B take() {
        synchronized (this) {
            try {
                if (this.instance == null) {
                    System.out.println("Instance waiting");
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Take: " + instance);
            notify();
            return instance;
        }
    }
    public synchronized void put(B instance) {
        synchronized (this) {
                try {
                    if (this.instance != null) {
                        System.out.println("Waiting.");
                        wait();
                    }else {
                        this.instance = instance;
                        System.out.println("Put: " + instance);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }
        }
    }

