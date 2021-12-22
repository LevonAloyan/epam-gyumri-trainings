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
        return size;
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
        for(Node<T> current = head;
            current != null;
            current = current.getNext()) {
            if (current.data.equals(o)){
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        int index = size - 1;
        for (Node<T> current = last; current != null; current = current.getPrevious()){
            if (current.data.equals(o)){
                return index;
            }
            index --;
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
     T current = get(index);
      add(index,element);
        return current;
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
     if (index >= 0 && index <= size){
//         if (index == size) {
//             lastIndexOf(element);
//         }else {
//             Node<T> node = new Node<>(element);
//             node.setData(element);
//             node.setNext(node);
//             node.setPrevious(node.getPrevious());
//             node.getPrevious().setNext(node);
//             size ++;
//       int i = 0;
//        for (Node<T> current = last; current != null; current = current.getNext()){
//            if (i == index){
//               // Node<T> curr = new Node<>(null, null , element);
//                current.setData(element);
//                current.setNext(current.getNext());
//                current.setPrevious(current.getPrevious());
//            }
//            i++;
//        }
//        }
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
    }

    @Override
        public T removeByIndex(int index){
            T current = get(index);
            if (remove(get(index))) {
                return current;
            }
            return null;
        }

    @Override
    public boolean remove(T o) {
        if (o == null){
            for (Node<T> current = head; current != null; current = current.getNext()){
                if (current.getData().equals(o)){
                    unLink(current);
                    return true;
                }
            }
        }else {
        for (Node<T> current = head; current != null; current = current.getNext()){
            if (current.getData().equals(o)){
                unLink(current);
                return true;
            }
        }
        }
        return false;
    }

    private static class Node<T> {
        private  T data;
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

        public void setData(T data) {
            this.data = data;
        }
    }


    public void unLink(Node<T> current) {
        if (current.getPrevious() == null) {
            head = current.getNext();
        } else {
            current.getPrevious().setNext(current.getNext());
            current.setPrevious(null);
        }

        if (current.getNext() == null) {
            last = current.getPrevious();
        } else {
            current.getNext().setPrevious(current.getPrevious());
            current.setNext(null);
        }
        current.setData(null);
        size--;
    }

 public void  print (){
        for( Node<T> current = head;
        current != null;
        current = current.getNext()){
            System.out.print(current.getData() +" ,");
        }
 }

}


