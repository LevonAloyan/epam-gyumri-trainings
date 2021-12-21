
package mycollections;


public class DoubleLinkedList<T> implements MyList<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;


    public DoubleLinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public int size() {

        return this.size;
    }

    @Override
    public boolean isEmpty() {

        return this.size == 0;
    }

    @Override
    public boolean contains(T o) {

        return indexOf(o) != -1;
    }

    @Override
    public int indexOf(T o) {
        int index = 0;
        for(Node<T> current = this.head; current !=null; current = current.next){
            if (current.data.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        int index = this.size-1;
        for(Node<T> current = this.last; current !=null; current = current.previous){
            if (current.data.equals(o)) {
                return index;
            }
            current = current.previous;
            index--;
        }
        return -1;
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
        if (index < 0 || index >= size) {
            throw new ListIndexOutOfBoundException("Index " + index + " is out of bound. The LinkedList size is " + size);
        }

        Node<T> node = this.getByIndex(index);
        T oldData = node.getData();
        node.data = element;
        return oldData;

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

        if (index < 0 || index >= size) {
            throw new ListIndexOutOfBoundException("Index " + index + " is out of bound. The LinkedList size is " + size);
        }

        if (head == null && index == 0) {
            head = new Node(element);

        } else if (head == null && index != 0) {
            return;
        } else if (index > size) {
            return;
        }

        Node<T> current = head;
        int pos = -1;
        Node previous = null;
        Node next = null;
        Node newNode = new Node(element);
        while (current != null) {
            if (pos == index - 1) {
                previous = current;
            } else if (pos == index + 1) {
                next = current;
            }
            pos++;
            current = current.next;
        }
        previous.next = newNode;
        newNode.next = next;
    }

    @Override
    public T remove(int index) {
        if (index == 0) {
            last.previous = null;
            return (T) last;
        }

        Node<T> nodeToRemove = this.getByIndex(index);

        for (int i = 0; i < index; i++) {
            nodeToRemove = nodeToRemove.next;
        }

        nodeToRemove.previous.next = nodeToRemove.next;

        if (nodeToRemove.previous.next != null) {
            nodeToRemove.previous.next.previous = nodeToRemove.previous;
        }


        return nodeToRemove.data;
    }

    @Override
    public boolean remove(T o) {
        boolean result = false;
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove() from empty list.");
        }

        if (head != null) {
            Node<T> currentNode = head;
            Node<T> previousNode = head;

            while (currentNode != null) {
                if (currentNode.getData() == o) {
                    previousNode.setNext(currentNode.getNext());

                    if (currentNode.getNext() != null) {
                        currentNode.getNext().setPrevious(previousNode);
                    }
                    result = true;
                    break;
                } else {
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                }
            }
        }
        return result;
    }

    private Node<T> getByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ListIndexOutOfBoundException("Index " + index + " is out of bound. The LinkedList size is " + size);
        }
        Node<T> node;
        if (index <= this.size /2) {
            node = this.head;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
        } else {
            node = this.last;
            for (int i = this.size - 1; i > index; i--) {
                node = node.getPrevious();
            }
        }
        return node;
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

    public static void main(String[] args) {
        DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(5);
        System.out.println(myLinkedList.contains(10));
        System.out.println(myLinkedList.indexOf(5));
        System.out.println(myLinkedList.lastIndexOf(5));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.set(2, 15));
        myLinkedList.add(2, 67);
        System.out.println(myLinkedList.remove(2));

        //System.out.println(myLinkedList.get(16));


    }
}


