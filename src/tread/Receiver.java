package tread;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable{
    private BoundedBlockingBuffer load;

    public Receiver(BoundedBlockingBuffer load) {
        this.load = load;
    }

    @Override
    public void run() {
        for (String receivedMessage = load.take();
             !"End".equals(receivedMessage);
             receivedMessage = load.take()){
            System.out.println(receivedMessage);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted " + e);

            }

        }

    }
}
