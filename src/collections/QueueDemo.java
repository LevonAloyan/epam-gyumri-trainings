package collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("1");

//        queue.poll();
//        queue.peek();
//
//        queue.element();
//        queue.offer();
//        queue.add();

        for (String s : queue) {
            System.out.println(s);
        }
    }
}
