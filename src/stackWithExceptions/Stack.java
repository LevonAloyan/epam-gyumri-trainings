package stackWithExceptions;
import java.util.Arrays;

public class Stack  {
        public static void main(String[] args) {
            Stack stack = new Stack(5);
            System.out.println(stack);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
            stack.push(7);
            System.out.println(stack);
            stack.pop();
            System.out.println(stack);
            System.out.println(stack.isEmpty());
            stack.clear();
            stack.pop();
            System.out.println(stack);


        }

        static final int DEFAULT_SIZE = 16;
        private int[] data;
        private int tos; //index which determines the top of stack

        public Stack() {
            this(DEFAULT_SIZE);
        }

        public Stack(int size) {
            data = new int[size];
            this.tos = 0;
        }


        public void push(int value) {
            if (tos == data.length) {
                throw new StackOverflowException("Stack is full, no more elements can be added.");
            } else {
                data[tos++] = value;
            }
        }


        public int pop()  {
            if (isEmpty()) {
                throw new EmptyStackException("Stack is empty, no more elements to pop.");
            } else {
                return data[--tos];
            }
        }


        public void clear() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
            } else {
                for (int i = data.length - 1; i >= 0; i--) {
                    data[i] = 0;
                }
            }
        }


        public boolean isEmpty() {
            return tos == 0;
        }

        private void ensureCapacity() {
            if (tos == data.length) {
                int[] newData = new int[3 * data.length/2];
                for (int i = 0; i < data.length; i++) {
                    newData[i] = data[i];
                }
                data = newData;
            }
        }

        @Override
        public String toString() {
            int[] itmes = Arrays.copyOfRange(data, 0, tos);
            return Arrays.toString(itmes);
        }

    }
