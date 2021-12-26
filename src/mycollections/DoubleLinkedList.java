package mycollections;

import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements MyList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;


    public DoubleLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(T o) {
        return indexOf(o) != -1;
    }

    @Override
    public int indexOf(T o) {
        int index = 0;
        Node<T> current = first;
        while (current != null) {
            if (current.data == o) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        Node<T> current;
        int currentIndex = size - 1;
        for (current = last; current != null; current = current.previous) {
            if (current.data.equals(o)) {
                return currentIndex;
            }
            currentIndex--;
        }
        return -1;
    }

    @Override
    public T get(int index) {
        if (index > size || index < 0) {
            throw new ListIndexOutOfBoundException("Index " + index + " is out of bound. The LinkedList size is " + size);
        }
        Node<T> nodeToReturn = first;
        int currentIndex = 0;
        while (currentIndex < index) {
            nodeToReturn = nodeToReturn.next;
            currentIndex++;
        }
        return nodeToReturn.getData();
    }

    @Override
    public T set(int index, T element) {
        Node<T> newNode = new Node<>(element);
        int currentIndex = 0;
        if (isEmpty()) {
            return null;
        } else if (index == 0) {
            first.data=newNode.data;
        } else if (index == size - 1) {
            last.data= newNode.data;
        } else if (index > 0 && index < size - 1) {
            Node<T> current;
            for (current = first; current != null; current = current.next) {
                if (currentIndex == index) {
                    newNode.next = current.next;
                    newNode.previous=current.previous;
                    current.data = newNode.data;
                }
                currentIndex++;
            }
        }
        return (T) newNode;
    }

    @Override
    public boolean add(T e) {
        if (first == null) {
            first = new Node<>(e);
            last = first;
        } else {
            Node<T> current = new Node<>(e);
            current.previous = last;
            last.next = current;
            last = current;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else if (index == 0) {
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        } else if (index == size - 1) {
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        } else if (index > 0 && index < size - 1) {
            Node<T> current;
            int currentIndex = 1;
            for (current = first; current != null; current = current.next) {
                if (currentIndex == index) {
                    newNode.next = current.next;
                    current.next = newNode;
                }
                currentIndex++;
            }
            size++;
        }
    }

    @Override
    public T remove(int index) {
        Node<T> current;
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (index == 0) {
            current = first.next;
            first = current;
            first.previous = null;
        } else if (index == size - 1) {
            current = last.previous;
            last = current;
            last.next = null;
        } else {
            int currentIndex = 0;
            for (current = first; current != null; current = current.next) {
                if (currentIndex == index) {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                currentIndex++;
            }
            size--;
        }
        return null;
    }

    @Override
    public boolean remove(T o) {
        if (!contains(o)) {
            return false;
        } else {
            remove(indexOf(o));
        }
        return true;
    }

    public void print(DoubleLinkedList<T> list) {
        System.out.print("[");
        while (!isEmpty()) {
            System.out.print(list.getFirst().getData() + " ");
            first = first.next;
        }
        System.out.println("]");
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

    }
}