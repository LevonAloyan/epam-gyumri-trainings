package mycollections;

public class DoubleLinkedList<T> implements MyList<T> {

    private T[] linkedArray;
    private final int DEFAULT_CAPACITY = 16;
    private int size;
    private Node<T> head;
    private Node<T> tail;

    @SuppressWarnings("unchecked")
    public DoubleLinkedList() {
        linkedArray = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public DoubleLinkedList(int capacity) {
        linkedArray = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T o) {
        elementValueCheck(o);
        for (T element : linkedArray) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        elementValueCheck(o);
//        int index = 0;
//        for (Node<T> first = head; first != null; first = first.next) {
//            if (first.item.equals(o)) {
//                return index;
//            }
//            index++;
//        }

        if (o.equals(head.item)) {
            return 0;
        } else if (o.equals(tail.item)) {
            return size;
        }
        for (int i = 1; i < size; i++) {
            if (linkedArray[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        elementValueCheck(o);
//        int index = 0;
//        for (Node<T> last = tail; last !=  null; last = last.prev) {
//            if (last.item.equals(o)) {
//                return index;
//            }
//            index++;
//        }

        if (o.equals(head)) {
            return 0;
        } else if (o.equals(tail)) {
            return size;
        }
        for (int i = size - 1; i > 1; i--) {
            if (linkedArray[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        rangeCheck(index);
        if (index == 0) {
            return head.item;
        } else if (index == size) {
            return tail.item;
        }
        int halfLength = (size >> 1);
        if (index < halfLength) {
            for (int i = 1; i < halfLength; i++) {
                if (i == index) {
                    return linkedArray[i];
                }
            }
        } else {
            for (int i = halfLength; i < size - 1; i++) {
                if (i == index) {
                    return linkedArray[i];
                }
            }
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        rangeCheck(index);
        elementValueCheck(element);
        Node<T> elementToSet = new Node<>(null, element, null);
        Node<T> initialElement = getByIndex(index);
        if (initialElement.equals(head)) {
            elementToSet.next = head.next;
            head = elementToSet;
        } else if (element.equals(tail)) {
            elementToSet.prev = tail.prev;
            tail = elementToSet;
        } else {
            elementToSet.next = initialElement.next;
            elementToSet.prev = initialElement.prev;
        }
        initialElement.next = initialElement.prev = null;
        linkedArray[index] = elementToSet.item;
        return initialElement.item;
    }

    @Override
    public boolean add(T e) {
        elementValueCheck(e);
        if (size == (int) (linkedArray.length * 0.75)) {
            ensureCapacity();
        }
        linkLast(e);
        return true;
    }

    @Override
    public void add(int index, T element) {
        rangeCheck(index);
        elementValueCheck(element);
        Node<T> elementToAdd = new Node<>(null, element, null);
        Node<T> initialElement = getByIndex(index);
        elementToAdd.next = initialElement;
        elementToAdd.prev = initialElement.prev;
        initialElement.prev = elementToAdd;
        addByIndexToLinkedArray(index, element);
    }

    public void addByIndexToLinkedArray(int index, T element) {
        rangeCheck(index);
        if (linkedArray.length - 1 - index >= 0) {
            System.arraycopy(linkedArray, index, linkedArray, index + 1, linkedArray.length - 1 - index);
        }
        size++;
        linkedArray[index] = element;
    }

    @Override
    public T remove(int index) {
        rangeCheck(index);
        Node<T> removeByIndex = getByIndex(index);
        unlinkElement(removeByIndex);
        remove(get(index));
        return removeByIndex.item;
    }

    @Override
    public boolean remove(T o) {
        elementValueCheck(o);
        Node<T> element = head;
        while (element != null) {
            if (element.equals(o)) {
                unlinkElement(element);
            } else {
                element = element.next;
            }
        }
        removeFromList(indexOf(o));
        return true;
    }

    public void unlinkElement(Node<T> element) {
        elementValueCheck(element.item);
        if (element.equals(tail)) {
            unlinkLast();
            return;
        } else if (element.equals(head)) {
            unlinkFirst();
            return;
        }
        Node<T> prevElement = element.prev;
        Node<T> nextElement = element.next;
        if (element.prev != null && element.next != null) {
            prevElement.next = nextElement;
            nextElement.prev = prevElement;
        }
        element.next = null;
        element.prev = null;
    }

    public void unlinkFirst() {
        Node<T> second = head.next;
        set(0, second.item);
    }

    public void unlinkLast() {
        Node<T> last = tail.prev;
        set(size, last.item);
    }

    private void removeFromList(int index) {
        rangeCheck(index);
        System.arraycopy(linkedArray, index + 1, linkedArray, index, linkedArray.length - 1 - index);
        size--;
    }


    public void linkFirst(T element) {
        Node<T> firstLink = new Node<>(null, element, head);
        if (!isEmpty()) {
            head.prev = firstLink;
        }
        head = firstLink;
        linkedArray[0] = element;
    }


    public void linkLast(T element) {
        Node<T> linkedElement = new Node<>(null, element, null);
        if (size == 0) {
            head = tail = linkedElement;
        } else {
            tail.next = linkedElement;
            linkedElement.prev = tail;
            tail = linkedElement;
        }
        linkedArray[size++] = element;
    }

    private Node<T> getByIndex(int index) {
        Node<T> neededElement = null;
        if (index == 0) {
            neededElement = head;
        } else if (index == size) {
            neededElement = tail;
        }
        int length = (size >> 1);
        Node<T> element = head;
        if (index < length) {
            for (int i = 1; i < length; i++) {
                if (i == index) {
                    return element;
                } else {
                    element = head.next;
                }
            }
        } else {
            for (int i = length; i <= size - 1; i++) {
                if (i == index) {
                    return element;
                } else {
                    element = head.next;
                }
            }
        }
        return neededElement;
    }

    public void printLinkedArray() {
        for (T t : linkedArray) {
            System.out.print(t + " | ");
        }
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        int length = (int) (DEFAULT_CAPACITY * 1.5);
        T[] newArray = (T[]) (new Object[length]);
        System.arraycopy(linkedArray, 0, newArray, 0, linkedArray.length);
        linkedArray = newArray;
    }

    private void rangeCheck(int index) {
        if (index < 0 || (index > linkedArray.length - 1)) {
            throw new IndexRangeChecker(index);
        }
    }

    private void elementValueCheck(T element) {
        if (element == null) {
            throw new ElementValueChecker(null);
        }
    }

    private static class Node<T> {
        private final T item;
        private Node<T> next;
        private Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}

