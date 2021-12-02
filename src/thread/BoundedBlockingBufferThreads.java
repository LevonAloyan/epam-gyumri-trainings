package thread;

class Importer<T> implements Runnable {
    BoundedBlockingBuffer<T> boundedBlockingBuffer;
    T transmittedValue;

    Importer(BoundedBlockingBuffer<T> boundedBlockingBuffer, T transmittedValue) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
        this.transmittedValue = transmittedValue;
        new Thread(this, "Importer").start();
    }

    @Override
    public void run() {
            boundedBlockingBuffer.put(transmittedValue);
    }
}

class Exporter<T> implements Runnable {
    BoundedBlockingBuffer<T> boundedBlockingBuffer;

    Exporter(BoundedBlockingBuffer<T> boundedBlockingBuffer) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
        new Thread(this, "Exporter").start();
    }

    @Override
    public void run() {
        boundedBlockingBuffer.take();

    }
}

