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

	/**
	 * Add element into stack
	 */
	public void push(int value) {
		if (this.tos == data.length) {
			System.out.println("Stack full.");
		} else {
			data[++tos] = value;
		}
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {

		if (this.tos < 0) {
			System.out.println("Stack is empty.");
			return 0;
		} else {
			return data[tos--];
		}
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		if(!isEmpty()){
			for(int i = 0; i < data.length; i++){
				pop();
			}
			tos = -1;
		}
	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		if (this.tos < 0) {
			return false;
		} else {
			return false;
		}
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity(int size) {
		if (tos != size){
		int newSize = size * 3;
		data[size] = data[newSize];
	}

	}
}