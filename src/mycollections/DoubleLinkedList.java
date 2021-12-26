package mycollections;

import java.util.Arrays;

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
        DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<>();
        int contains = 5;
        int index = 2;
        int remove = 3;
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(5);
        System.out.println("Size: " + myLinkedList.size());
        System.out.println("Remove: " + remove + "  " + myLinkedList.remove(remove));
        System.out.println("Size: remove " + myLinkedList.size());
        System.out.println(myLinkedList);
        System.out.println("Contains number: " + contains + " " + myLinkedList.contains(contains));
        System.out.println("Get Index: " + index + "   " + myLinkedList.get(index));
        System.out.println("IndexOf method First element: " + myLinkedList.indexOf(5));
        System.out.println("LastIndexOf method Last element: " + myLinkedList.lastIndexOf(5));


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
        // todo iterate on Linked list check if the data is equals to given value, return the index
        Node<T> nodeToReturn = head;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (nodeToReturn != null) {
                if (!(nodeToReturn.getData().equals(o))) {
                    nodeToReturn = nodeToReturn.getNext();
                    index++;
                } else {
                    return index;
                }
            }

        }
        return 0;
    }

    @Override
    public int lastIndexOf(T o) {
        Node<T> nodeToReturn = last;

        for (int i = size - 1; i >= 0; i--) {

            if (nodeToReturn != null) {
                if (!(nodeToReturn.getData().equals(o))) {
                    nodeToReturn = nodeToReturn.getPrevious();
                } else {
                    return i;
                }
            }
        }
        return 0;
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
        int index1 = 0;
        while (index1 < index) {
            nodeToReturn = nodeToReturn.getNext();
            index1++;
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
            throw new ListIndexOutOfBoundException("\"Index \" + index + \" is out of bound. The LinkedList size is \" + size");
        }
    }

    @Override
    public T removeByIndex(int index) {
        Node<T> nodeToReturn = head;
        if (index >= 0 && index < size) {
            method:
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    if (nodeToReturn != null) {
                        if (nodeToReturn.getNext() != null && nodeToReturn.getPrevious() != null) {
                            nodeToReturn.getPrevious().setNext(nodeToReturn.getNext());
                            nodeToReturn.getNext().setPrevious(nodeToReturn.getPrevious());
                            size--;
                            return (T) nodeToReturn;
                        } else if (nodeToReturn.getPrevious() == null) {
                            nodeToReturn.getNext().setPrevious(null);
                            head = nodeToReturn.getNext();
                            nodeToReturn.setNext(null);
                            size--;
                            return (T) nodeToReturn;

                        } else {
                            nodeToReturn.getPrevious().setNext(null);
                            last = nodeToReturn.getPrevious();
                            nodeToReturn.setPrevious(null);
                            size--;
                            return (T) nodeToReturn;
                        }
                    }
                } else {
                    nodeToReturn = nodeToReturn.getNext();
                    continue method;
                }
            }
        }
        return (T) nodeToReturn;
    }

    @Override
    public boolean remove(T o) {
        Node<T> nodeToReturn = head;
        for (int i = 0; i < size; i++) {
            if (nodeToReturn != null) {
                if (nodeToReturn.getData().equals(o)) {
                    removeByIndex(indexOf(o));
                    return true;
                } else nodeToReturn = nodeToReturn.getNext();
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(get(i));
        }
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

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }
    }
}


