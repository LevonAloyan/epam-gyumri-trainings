package stack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stack <T> {

    static final int DEFAULT_SIZE = 16;
    private T[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = (T[]) new Object[size];
        this.tos = -1;


        if(size < 0)
        {
            throw new IllegalArgumentException("capacity " + size);
        }
        this.data = (T[]) new Object[size];
    }

    /**
     * Add element into stack
     */
    /*public void push(int value) {
        if (tos == data.length-1)
            System.out.println("stack is over");
        else
            data[++tos] = value;
    }*/

    public void push(T value) {
        if (tos == data.length-1)
            System.out.println("stack is over");
        else
            data[++tos] = value;
    }
    /**
     * Get element from the stack
     * @return
     */
    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty, no items found on the Stack");

        } else {
            return data[tos--];
        }
    }

    /**
     * Clear stack
     */
//    public void clear() {
////        data = new int[DEFAULT_SIZE];
//          tos = -1;
////    }



    public void clear() {
        data = (T[]) new Object[DEFAULT_SIZE];
        tos = -1;
    }
    /**
     * Check if stack is empty
     * @return
     */

   public boolean isEmpty() {

        if (tos > 0) {
            System.out.println(data[tos]);
        } else
            return true;

    }




        /**
         * Increase the stack capacity if there is not enough space to add additional items
         */
//        private void ensureCapacity() {
//            if (tos >= DEFAULT_SIZE) {
//                int newCapacity = (DEFAULT_SIZE * 2) + 1;
//                data[DEFAULT_SIZE] = data[newCapacity];
//            }
//        }

        private void ensureCapacity() {
            if (tos >= DEFAULT_SIZE) {
               T[] newCapacity =(T[]) new Object [(DEFAULT_SIZE * 2) + 1];
                data[DEFAULT_SIZE] = data[newCapacity];
           }
       }
    }