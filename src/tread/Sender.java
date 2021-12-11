package tread;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
    private BoundedBlockingBuffer data;

    public Sender(BoundedBlockingBuffer data) {
        this.data = data;
    }

    @Override
    public void run() {

        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };
        for (String packet : packets) {
            data.put(packet);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted" + e);
            }
        }
    }
}
