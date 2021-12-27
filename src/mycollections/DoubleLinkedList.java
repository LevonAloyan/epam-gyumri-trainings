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
        return indexOf(o) != -1;
    }

    @Override
    public int indexOf(T o) {
        int index = 0;
        if (o == null) {
            for (Node<T> first = head; first != null; first = first.next) {
                if (first.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<T> first = head; first != null; first = first.next) {
                if (o.equals(first.item)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        int index = size - 1;
        if (o == null) {
            for (Node<T> last = tail; last != null; last = last.prev) {
                if (last.item == null) {
                    return index;
                }
                index--;
            }
        } else {
            for (Node<T> last = tail; last != null; last = last.prev) {
                if (last.item.equals(o)) {
                    return index;
                }
                index--;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        rangeCheck(index);
        return getByIndex(index).item;
    }

    @Override
    public T set(int index, T element) {
        rangeCheck(index);
        Node<T> initialElement = getByIndex(index);
        T oldValue = initialElement.item;
        initialElement.item = element;
        return oldValue;
    }

    @Override
    public boolean add(T e) {
        linkLast(e);
        return true;
    }

    @Override
    public void add(int index, T element) {
        rangeCheck(index);
        Node<T> initialElement = getByIndex(index);
        if (index == 0) {
            linkFirst(element);
        } else if (index == size) {
            linkLast(element);
        } else {
            Node<T> initPrev = getByIndex(index - 1);
            Node<T> elementToAdd = new Node<>(initPrev, element, initialElement);
            initPrev.next = elementToAdd;
            initialElement.prev = elementToAdd;
        }
        size++;
    }

    @Override
    public T remove(int index) {
        rangeCheck(index);
        Node<T> removeByIndex = getByIndex(index);
        remove(removeByIndex.item);
        return removeByIndex.item;
    }

    @Override
    public boolean remove(T o) {
        for (Node<T> removingElement = head; removingElement != null; removingElement = removingElement.next) {
            if (o == null) {
                if (removingElement.item == null) {
                    unlinkElement(removingElement);
                    return true;
                }
            } else {
                if (o.equals(removingElement.item)) {
                    unlinkElement(removingElement);
                    return true;
                }
            }
        }
        return false;
    }

    public void unlinkElement(Node<T> element) {
        Node<T> prevElement = element.prev;
        Node<T> nextElement = element.next;
        if (prevElement == null) {
            head = nextElement;
        } else if (nextElement == null) {
            tail = prevElement;
        } else {
            prevElement.next = nextElement;
            nextElement.prev = prevElement;
        }
        size--;
    }

    private void unlinkFirst() {
        if (head != null) {
            unlinkElement(head);
        }
    }

    private void unlinkLast() {
        if (tail != null) {
            unlinkElement(tail);
        }
    }

    private void linkFirst(T element) {
        Node<T> firstLink = new Node<>(null, element, head);
        if (!isEmpty()) {
            head.prev = firstLink;
        }
        head = firstLink;
        size++;
    }

    private void linkLast(T element) {
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
        int index = 0;
        Node<T> neededElement = head;
        while (index < size) {
            System.out.print(neededElement.item + " | ");
            neededElement = neededElement.next;
            index++;
        }
    }

    private Node<T> getByIndex(int index) {
        Node<T> neededElement = null;
        int length = (size >> 1);
        if (index <= length) {
            neededElement = head;
            for (int i = 0; i < index; i++) {
                neededElement = neededElement.next;
            }
        } else {
            neededElement = tail;
            for (int i = size - 1; i > index; i--) {
                neededElement = neededElement.prev;
            }
        }
        return neededElement;
    }

    private void rangeCheck(int index) {
        if (index < 0 || (index > size)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static class Node<T> {
        private T item;
        private Node<T> next;
        private Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}

