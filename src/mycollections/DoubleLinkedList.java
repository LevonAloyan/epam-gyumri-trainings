package mycollections;

public class DoubleLinkedList<T> implements MyList<T> {
    int size = 0;
    int index = -1;

    private Node<T> pointerToFirst;
    private Node<T> pointerToLast;


    private void firstLink(T element) {
        Node<T> first = pointerToFirst;
        Node<T> newNode = new Node<T>(null, first, element);
        pointerToFirst = newNode;
        if (first == null) {
            pointerToLast = newNode;
        } else {
            first.setPrevious(newNode);
            size++;
            index++;
        }
    }

    private void lastLink(T element) {
        final Node<T> last = pointerToLast;
        Node<T> newNode = new Node(last, null, element);
        pointerToLast = newNode;
        if (last == null) {
            pointerToFirst = newNode;
        } else {
            last.setNext(newNode);
            size++;
            index++;
        }
    }

    @Override
    public int size() {
        return this.size;

    }

    @Override
    public boolean isEmpty() {
        if (this.size <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(T o) {
        if (o == null) {
            for (Node<T> x = pointerToFirst; x != null; x = x.getNext()) {
                if (x.getValue() == null) {
                    return true;
                }
            }
        } else {
            for (Node<T> x = pointerToFirst; x != null; x = x.getNext()) {
                if (o.equals(x.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        int indexInList = 0;
        if (o == null) {
            for (Node<T> x = pointerToFirst; x != null; x = x.getNext()) {
                if (x.getValue() == null) {
                    return indexInList;
                }
                indexInList++;
            }
        } else {
            for (Node<T> x = pointerToFirst; x != null; x = x.getNext()) {
                if (o.equals(x.getValue())) {
                    return indexInList;
                }
                indexInList++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        int indexOf = 0;
        int temp = -1;
        if (o == null) {
            for (Node<T> x = pointerToFirst; x != null; x = x.getNext()) {
                if (x.getValue() == null) {
                    temp = indexOf;
                }
                indexOf++;
            }
            return temp;
        } else {
            for (Node<T> x = pointerToFirst; x != null; x = x.getNext()) {
                if (o.equals(x.getValue())) {
                    temp = indexOf;
                }
                indexOf++;
            }
        }
        return temp;
    }

    @Override
    public T get(int index) {

        Node<T> tNode = get0(index);
        return tNode.getValue();
    }

    private Node<T> get0(int index) {
        int i = 0;
        if (index < size && index >= 0) {
            for (Node<T> x = pointerToFirst; x != null; x = x.getNext()) {
                if (i == index) {
                    return x;
                }
                i++;
            }
        }
        throw new ListIndexOutOfBoundException("Index is not available");
    }

    @Override
    public T set(int index, T element) {

        T temp = get(index);
        Node<T> nodeByIndex = get0(index);
        nodeByIndex.setValue(element);
        return temp;
    }

    @Override
    public boolean add(T e) {
        lastLink(e);
        return true;

    }

    @Override
    public void add(int index, T element) {
        if (index >= 0 && index <= size) {
            if (index == size) {
                lastLink(element);
            } else {
                Node<T> t = get0(index);
                Node<T> temp = new Node<>();
                temp.setValue(element);
                temp.setNext(t);
                temp.setPrevious(t.getPrevious());
                t.getPrevious().setNext(temp);
                size++;
            }
        }
    }


    @Override
    public T removeByIndex(int index) {
        T temp = get(index);
        if (remove(get(index))) {
            return temp;
        }
        return null;
    }

    @Override
    public boolean remove(T o) {
        if (o == null) {
            for (Node<T> x = pointerToFirst; x != null; x = x.getNext()) {
                if (x.getValue() == null) {
                    unLink(x);
                    return true;
                }
            }
        } else {
            for (Node<T> x = pointerToFirst; x != null; x = x.getNext()) {
                if (o.equals(x.getValue())) {
                    unLink(x);
                    return true;
                }
            }
        }
        return false;
    }

    public void print() {
        for (Node<T> node = pointerToFirst; node != null; node = node.getNext()) {
            System.out.print(node.getValue() + ", ");
        }
    }

    public void unLink(Node<T> x) {
        if (x.getPrevious() == null) {
            pointerToFirst = x.getNext();
        } else {
            x.getPrevious().setNext(x.getNext());
            x.setPrevious(null);
        }
        if (x.getNext() == null) {
            pointerToLast = x.getPrevious();
        } else {
            x.getNext().setPrevious(x.getPrevious());
            x.setNext(null);
        }
        x.setValue(null);
        size--;
    }
}

