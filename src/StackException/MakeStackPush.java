package StackException;

import StackException.StackException.OverFlowException;

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
        if (tos == value-1) {
            throw new OverFlowException("Stack is overflow");
        }else
            data[++tos] = value;
    }
}
