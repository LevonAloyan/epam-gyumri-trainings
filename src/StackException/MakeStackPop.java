package StackException;

public class MakeStackPop {
    /*static final int DEFAULT_SIZE = 16;*/
    private int[] data;
    private int tos; //index which determines the top of stack

    public MakeStackPop() {
        this(DEFAULT_SIZE);
    }

    public MakeStackPop(int size) {
        data = new int[size];
        this.tos = -1;
    }
    public void pop(int value) {
        if(tos < 0){
            System.out.println("stack is not over");
            return 0;
        }
        else
            return data[--tos];
    }
}
