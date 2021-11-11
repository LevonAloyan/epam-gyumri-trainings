package stack;



public class Stack {
    static final int DEFAULT_SIZE = 16;
    private int[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = new int[size];
        this.tos = -1;
    }
    public void push(int value) {
        if (tos == DEFAULT_SIZE) {
            System.out.println("Stack is full ");
        } else {
            data[++tos] = value;

            System.out.print(data[value] + ",");

        }

    }




    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else
            return data[tos--];




    }


    public void clear(){
        for(int i=0;i<DEFAULT_SIZE;i++){
            data[i]=0;
            System.out.print(data[i]+",");
        }

    }
    public boolean isEmpty() {
        if (tos < 0) {}
            return false;
        }
        private void ensureCapacity() {
            if (tos==DEFAULT_SIZE){
                int[] newData= new int[DEFAULT_SIZE+1];
                newData = data;

            }
        }



    public static void main(String args[]){
        Stack mystack = new Stack();
        for(int i=0;i<DEFAULT_SIZE;i++) {
            mystack.push(i);
        }
        System.out.println();
        for(int i=0;i<DEFAULT_SIZE;i++){
            System.out.print(mystack.pop()+" ");
        }
        System.out.println();
        mystack.clear();
        mystack.isEmpty();
    }
}
