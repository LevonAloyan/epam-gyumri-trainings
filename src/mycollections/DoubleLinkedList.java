package mycollections;

public class DoubleLinkedList<T> implements MyList<T>{

    Link<T> first;
    Link<T> last;
    private int size = 0;

    public DoubleLinkedList(){

    }
    private static class Link<T> {
        T item;
        private Link<T> next;
        private Link<T> prev;

        Link(Link<T> next, Link<T> prev, T element) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        public Link<T> getNext() {
            return next;
        }

        public Link<T> getPrev() {
            return prev;
        }

        public void setPrev(Link<T> prev) {
            this.prev = prev;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(T o) {
        int index = 0;
        if (o == null) {
            for (Link<T> i = this.first; i != null; i = i.next) {
                if (i.item == null)
                    return index;
                index++;
            }
        } else {
            for (Link<T> i = this.first; i != null; i = i.next) {
                if (o.equals(i.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        int index  = this.size - 1;

        if (o == null) {
            for (Link<T> i = this.last; i != null; i = i.prev) {
                index--;
                if (i.prev == null) {
                    return index;
                }
            }
        } else {
            for (Link<T> i = this.last; i != null; i = i.prev) {
                index--;
                if (o.equals(i.item)) {
                    return index;
                }
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        if (!isElementIndex(index)){
            throw new IndexOutOfBoundsException();
        }
        return link(index).item;
    }
    Link<T> link(int index) {
        Link<T> i;
        if (index < (size >> 1)) {
            i = first;
            for (int j = 0; j < index; j++)
                i = i.next;
        } else {
            i = last;
            for (int j = size - 1; j > index; j--)
                i = i.prev;
        }
        return i;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public T set(int index, T element) {
        if (!isElementIndex(index)){
            throw new IndexOutOfBoundsException();
        }
        Link<T> i = link(index);
        T value = i.item;
        i.item = element;
        return value;
    }

    @Override
    public boolean add(T e) {
        linkLast(e);
        return true;
    }
    private void linkLast(T element){
        Link<T> l = this.last;
        Link<T> temp = new Link<>(l, null, element);
        if(last != null){
            last.next = temp;
        }
        last = temp;
        if (first == null){
            first = temp;
        }
        size++;
    }

    @Override
    public void add(int index, T element) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            linkLast(element);
        } else {
            int i = 0;
            for (Link<T> l = this.last; l != null; l = l.getNext()) {
                if (i == index) {
                    l.setItem(element);
                }
                i++;
            }
        }
    }

    @Override
    public T remove(int index) {
        if (!isElementIndex(index)){
            throw new IndexOutOfBoundsException();
        }
        return unlink(link(index));
    }
    T unlink(Link<T> index) {
        T el = index.item;
        Link<T> next = index.getNext();
        Link<T> prev = index.getPrev();

        if (prev == null) {
            this.first = next;
        } else {
            prev.next = next;
            index.prev = null;
        }
        if (next == null) {
            this.last = prev;
        } else {
            next.prev = prev;
            index.next = null;
        }
        index.setItem(null);
        this.size--;
        return el;
    }

    @Override
    public boolean remove(T o) {

        if(o == null) {
            for (Link<T> i = this.first; i != null; i = i.next){
                if (i.item == null){
                    unlink(i);
                    return true;
                }
            }
        }else {
            for (Link<T> i = this.first; i != null; i = i.next){
                if (o.equals(i.item)){
                    unlink(i);
                    return true;
                }
            }
        }
        return false;
    }

    public void printList() {
        System.out.print("[ ");
        for (Link<T> i = this.first; i != last; i = i.getNext()){
            System.out.print(i.getItem() + ", ");
        }
        System.out.print(" ]");
        System.out.println();
    }

}
