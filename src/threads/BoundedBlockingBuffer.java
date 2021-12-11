package threads;

import java.util.ArrayList;
import java.util.List;

public class BoundedBlockingBuffer<T> {
    List<T> buffer = new ArrayList<>();
    private T data;

    protected synchronized void put(T data) {
        this.data = data;
        if (buffer.isEmpty()) {
            buffer.add(data);
                System.out.println(data + " <--- data is put");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected synchronized T take() {
        if (!buffer.isEmpty()) {
                System.out.print("data is taken ---> ");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}
