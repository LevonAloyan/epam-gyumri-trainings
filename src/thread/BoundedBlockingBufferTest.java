package thread;

public class BoundedBlockingBufferTest {
        public static void main(String[] args) {
            BoundedBlockingBuffer boundedBlockingBuffer = new BoundedBlockingBuffer();
            new Importer( boundedBlockingBuffer, "Welcome!!!");
            new Exporter ( boundedBlockingBuffer);


            BoundedBlockingBuffer boundedBlockingBuffer1 = new BoundedBlockingBuffer();
            new Importer(boundedBlockingBuffer1,1);
            new Exporter(boundedBlockingBuffer1);
        }
    }
