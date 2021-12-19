package mycollections;

public class DoubleLinkedList<T> implements MyList<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

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
        if (o == null) {
            for (Node<T> node = this.head; node != null; node = node.next) {
                if (node.value == null)
                    return true;
            }
        } else {
            for (Node<T> node = this.head; node != null; node = node.next) {
                if (o.equals(node.value))
                    return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        int index = 0;
        if (o == null) {
            for (Node<T> node = this.head; node != null; node = node.next) {
                if (node.value == null)
                    return index;
                index++;
            }
        } else {
            for (Node<T> node = this.head; node != null; node = node.next) {
                if (o.equals(node.value))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        int index = this.size-1;
        if (o == null) {
            for (Node<T> node = this.tail; node != null; node = node.prev) {
                if (node.value == null)
                    return index;
                index--;
            }
        } else {
            for (Node<T> node = this.tail; node != null; node = node.prev) {
                if (o.equals(node.value))
                    return index;
                index--;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        return this.getNodeByIndex(index).getValue();
    }

    @Override
    public T set(int index, T element) {
        checkIndex(index);
        Node<T> node = this.getNodeByIndex(index);
        T oldValue = node.getValue();
        node.setValue(element);
        return oldValue;
    }

    @Override
    public boolean add(T e) {
        Node<T> node = new Node<>(e, null, this.tail);
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
        }
        this.tail = node;
        this.size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        checkIndex(index);
        Node<T> node = this.getNodeByIndex(index);
        Node<T> newNode = new Node<>(element, node, node.getPrev());
        if (index == 0) {
            this.head = newNode;
        } else {
            node.getPrev().setNext(newNode);
        }
        node.setPrev(newNode);
        this.size++;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        Node<T> node = this.getNodeByIndex(index);
        T removedValue = node.getValue();
        if (index == 0) {
            this.head = node.getNext();
            node.getNext().setPrev(null);
        } else if (index == this.size - 1) {
            node.getPrev().setNext(null);
            this.tail = node.getPrev();
        } else {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
        this.size--;
        return removedValue;
    }

    // The duplicated part of this method can be moved to another private method
    @Override
    public boolean remove(T o) {
        if (o == null) {
            for (Node<T> node = this.head; node != null; node = node.next) {
                if (node.value == null) {
                    if (node == this.head) {
                        this.head = node.getNext();
                        node.getNext().setPrev(null);
                    } else if (node == this.tail) {
                        node.getPrev().setNext(null);
                        this.tail = node.getPrev();
                    } else {
                        node.getPrev().setNext(node.getNext());
                        node.getNext().setPrev(node.getPrev());
                    }
                    return true;
                }
            }
        } else {
            for (Node<T> node = this.head; node != null; node = node.next) {
                if (o.equals(node.value)) {
                    if (node == this.head) {
                        this.head = node.getNext();
                        node.getNext().setPrev(null);
                    } else if (node == this.tail) {
                        node.getPrev().setNext(null);
                        this.tail = node.getPrev();
                    } else {
                        node.getPrev().setNext(node.getNext());
                        node.getNext().setPrev(node.getPrev());
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("Index is out of range");
        }
    }

    private Node<T> getNodeByIndex(int index) {
        checkIndex(index);
        Node<T> node;
        if (index <= this.size >> 1) {
            node = this.head;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
        } else {
            node = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                node = node.getPrev();
            }
        }
        return node;
    }

    public void print (){
        System.out.print("[ ");
        for (Node<T> node = this.head; node!=null; node=node.getNext()) {
            System.out.print(node.getValue() + ", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }

}
