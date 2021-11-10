package stack;

public class Stack {
    public static void main(String[] args) {
        Stack stack= new Stack();
        for (int i = 0; i < 5; i++) {
            stack.push(i^2);
        }
        System.out.println(stack.pop());
        stack.push(45);
        stack.push(44);
        stack.push(48);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Stack  " + stack);
        stack.clear();
        System.out.println("Stack after clear()  " + stack);
        System.out.println("Is the stack empty?  " + stack.isEmpty());
        //stack.ensureCapacity();
    }
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

	/**
	 * Add element into stack
	 */
	public void push(int value) {
		if(tos == data.length){
			System.out.println("Stack is full");
		}else {
			data[++tos] = value;
		}
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {
		if(tos < 0){
			System.out.println("Stack is empty");
			return 0;
		}else {
			return data[tos--];
		}
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		data = new int[DEFAULT_SIZE];
		tos = -1;
	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		if (tos < 0) {
			return true;
		}
		return false;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		int[] dataTemp = new int[data.length + DEFAULT_SIZE];
		System.arraycopy(data, 0, dataTemp, 0, data.length);
		data = dataTemp;
	}
}