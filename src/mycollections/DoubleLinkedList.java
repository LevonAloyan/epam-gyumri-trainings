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
        return size == 0;
    }

    @Override
    public boolean contains(T o) {
        elementValueCheck(o);
        return indexOf(o) != -1;
    }

    @Override
    public int indexOf(T o) {
        elementValueCheck(o);
        int index = 0;
        for (Node<T> first = head; first != null; first = first.next) {
            if (first.item.equals(o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        elementValueCheck(o);
        int index = 0;
        for (Node<T> last = tail; last != null; last = last.prev) {
            if (last.item.equals(o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public T get(int index) {
        rangeCheck(index);
        if (size != 0) {
            int halfLength = (size >> 1);
            if (index <= halfLength && head != null) {
                for (int i = 0; i <= halfLength; i++) {
                    if (i == index) {
                        return head.item;
                    }
                    head = head.next;
                }
            } else if (index > halfLength && tail != null) {
                for (int i = size; i > halfLength; i--) {
                    if (i == index) {
                        return tail.item;
                    }
                    tail = tail.prev;
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
        if (index == 0) {
            elementToSet.next = head.next;
            head = elementToSet;
        } else if (index == size) {
            elementToSet.prev = tail.prev;
            tail = elementToSet;
        } else {
            elementToSet.next = initialElement.next;
            elementToSet.prev = initialElement.prev;
        }
        initialElement.next = initialElement.prev = null;
        return initialElement.item;
    }

    @Override
    public boolean add(T e) {
        elementValueCheck(e);
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
    }

    @Override
    public T remove(int index) {
        rangeCheck(index);
        Node<T> removeByIndex = getByIndex(index);
        unlinkElement(removeByIndex);
        return removeByIndex.item;
    }

    @Override
    public boolean remove(T o) {
        elementValueCheck(o);
        Node<T> element = head;
        while (element != null) {
            if (element.item.equals(o)) {
                unlinkElement(element);
            } else {
                element = element.next;
            }
        }
        return true;
    }

    public void unlinkElement(Node<T> element) {
        elementValueCheck(element.item);
        Node<T> prevElement = element.prev;
        Node<T> nextElement = element.next;
        if (element.equals(tail)) {
            prevElement.next = tail.prev = tail = null;
            return;
        } else if (element.equals(head)) {
            nextElement.prev = head.next = head = null;
            return;
        }
        if (element.prev != null && element.next != null) {
            prevElement.next = nextElement;
            nextElement.prev = prevElement;
        }
        element.next = element.prev = null;
    }

    public void unlinkFirst() {
        if (head != null) {
            unlinkElement(head);
        }
    }

    public void unlinkLast() {
        if (tail != null) {
            unlinkElement(tail);
        }
    }

    public void linkFirst(T element) {
        Node<T> firstLink = new Node<>(null, element, head);
        if (!isEmpty()) {
            head.prev = firstLink;
        }
        head = firstLink;
        size++;
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
        size++;
    }

    public void printElements() {
        if (size != 0) {
            for (Node<T> last = tail; tail != null; last = tail.prev) {
                System.out.print(last.item + " | ");
            }
        } else {
            System.out.println("empty");
        }
    }

    private Node<T> getByIndex(int index) {
        Node<T> neededElement = null;
        int length = (size >> 1);
        if (index < length) {
            for (int i = 0; i <= length; i++) {
                if (i == index) {
                    neededElement = head;
                    return neededElement;
                } else {
                    neededElement = head.next;
                }
            }
        } else {
            for (int i = size; i > length; i--) {
                if (i == index) {
                    neededElement = tail;
                    return neededElement;
                } else {
                    neededElement = tail.prev;
                }
            }
        }
        return neededElement;
    }

    private void rangeCheck(int index) {
        if (index < 0 || (index > size)) {
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

