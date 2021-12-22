package mycollections;

import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.LinkedList;

public class DoubleLinkedList<T> implements MyList<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;


    public DoubleLinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        DoubleLinkedList<String> myLinkedList = new DoubleLinkedList<>();

        myLinkedList.add("6");
        myLinkedList.add("10");
        myLinkedList.add("-8");
        myLinkedList.add("3");
        myLinkedList.add("60");
        myLinkedList.add("69");
        myLinkedList.add("16");
        System.out.println(myLinkedList);
        //System.out.println(myLinkedList.get(0));
        // System.out.println(myLinkedList.set(0,"20"));
        // System.out.println(myLinkedList.contains("davo"));
//        System.out.println(myLinkedList.isEmpty());
        myLinkedList.removeByIndex(0);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList);

    }

    @Override
    public String toString() {
        Object[] result = new Object[size];
        int i = 0;
        for (DoubleLinkedList.Node<T> x = head; x != null; x = x.next)
            result[i++] = x.data;
        return Arrays.toString(result);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T o) {
        Node<T> nodeToReturn = head;

        for (int i = 0; i < size; i++) {
            if (nodeToReturn != null) {
                if (!(nodeToReturn.getData().equals(o))) {
                    nodeToReturn = nodeToReturn.getNext();
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        Node<T> nodeToReturn = head;
        int currentIndex = 0;

        while (!(nodeToReturn.getData().equals(o))) {
            nodeToReturn = nodeToReturn.getNext();
            currentIndex++;
        }
        return currentIndex;
    }

    @Override
    public int lastIndexOf(T o) {
        Node<T> nodeToReturn = last;
        int currentIndex = size - 1;
        while (!(nodeToReturn.getData().equals(o))) {
            nodeToReturn = nodeToReturn.getPrevious();
            currentIndex--;
        }
        return currentIndex;
    }

    @Override
    public T get(int index) {
        if (index > size || index < 0) {
            throw new ListIndexOutOfBoundException("Index " + index + " is out of bound. The LinkedList size is " + size);
        }
        Node<T> nodeToReturn = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            nodeToReturn = nodeToReturn.getNext();
            currentIndex++;
        }
        return nodeToReturn.getData();
    }

    @Override
    public T set(int index, T element) {

        if (index > size || index < 0) {
            throw new ListIndexOutOfBoundException("Index " + index + " is out of bound. The LinkedList size is " + size);
        }
        Node<T> nodeToReturn = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            nodeToReturn = nodeToReturn.getNext();
            currentIndex++;
        }
        T data = nodeToReturn.data;
        nodeToReturn.data = element;
        return data;
    }

    @Override
    public boolean add(T e) {
        if (head == null) {
            head = new Node<>(e);
            last = head;
        } else {
            Node<T> current = new Node<>(e);
            current.setPrevious(last);
            last.setNext(current);
            last = current;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {

        Node<T> nodeToReturn = head;
        int currentIndex = 0;

        if (index >= 0 && index < size) {
            method:
            for (int i = 0; i < size; i++) {
                if (nodeToReturn != null) {
                    if (index == i) {
                        Node<T> current = new Node<>(element);
                        if (nodeToReturn.getPrevious() != null) {
                            current.setNext(nodeToReturn);
                            current.setPrevious(nodeToReturn.getPrevious());
                            nodeToReturn.getPrevious().setNext(current);
                            nodeToReturn.setPrevious(current);
                        } else {
                            head = current;
                            current.setNext(nodeToReturn);
                            nodeToReturn.setPrevious(current);
                        }
                        size++;
                    } else nodeToReturn = nodeToReturn.getNext();
                    continue method;
                }
            }
        } else {
            throw new ListIndexOutOfBoundException("Index " + index + " is out of bound. The LinkedList size is " + size);
        }
    }


    @Override
    public T removeByIndex(int index) {

        Node<T> nodeToReturn = head;

        method:
        for (int i = 0; i < size; i++) {
            if (i == index) {
                size--;
                if (nodeToReturn != null) {
                    if (nodeToReturn.getPrevious() != null && nodeToReturn.getNext() != null) {
                        nodeToReturn.getPrevious().setNext(nodeToReturn.getNext());
                        nodeToReturn.getNext().setPrevious(nodeToReturn.getPrevious());
                        return nodeToReturn.getData();
                    } else if (nodeToReturn.getPrevious() == null) {
                        nodeToReturn.getNext().setPrevious(null);
                        head = nodeToReturn.getNext();
                        nodeToReturn.setNext(null);
                        return nodeToReturn.getData();
                    } else if (nodeToReturn.getNext() == null) {
                        nodeToReturn.getPrevious().setNext(null);
                        last = nodeToReturn.getPrevious();
                        nodeToReturn.setPrevious(null);
                        return nodeToReturn.getData();
                    }
                }
            } else nodeToReturn = nodeToReturn.getNext();
            continue method;
        }
        return null;
    }

    @Override
    public boolean remove(T o) {
        Node<T> nodeToReturn = head;

        method:
        for (int i = 0; i < size; i++) {
            if (nodeToReturn != null) {
                size--;
                if (nodeToReturn.getData().equals(o)) {
                    if (nodeToReturn.getPrevious() != null && nodeToReturn.getNext() != null) {
                        nodeToReturn.getPrevious().setNext(nodeToReturn.getNext());
                        nodeToReturn.getNext().setPrevious(nodeToReturn.getPrevious());
                        // size--;
                        return true;
                    } else if (nodeToReturn.getNext() == null) {
                        last = nodeToReturn.getPrevious();
                        nodeToReturn.getPrevious().setNext(null);
                        nodeToReturn.setPrevious(null);
                        //  size--;
                        return true;
                    } else if (nodeToReturn.getPrevious() == null) {
                        head = nodeToReturn.getNext();
                        nodeToReturn.getNext().setPrevious(null);
                        nodeToReturn.setPrevious(null);
                        //  size--;
                        return true;
                    }
                }
            }
            nodeToReturn = nodeToReturn.getNext();
            continue method;
        }
        return false;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> previous;

        public Node(T value) {
            this.data = value;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public Node<T> getPrevious() {
            return previous;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }

    }
}


