package StackException;

public class MakeStackPush {
        static final int DEFAULT_SIZE = 16;
        private int[] data;
        private int tos; //index which determines the top of stack

        public MakeStackPush() {
            this(DEFAULT_SIZE);
        }

        public MakeStackPush(int size) {
            data = new int[size];
            this.tos = -1;
        }
    public void push(int value) {
        if (tos == value-1){
            try {
                push(int size);
            } catch (Exception e){
                System.err.println("Stack is over");
        }

        else
            data[++tos] = value;
    }
}
