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
		tos = tos + 1;
		if (tos < data.length) {
		data[tos] = value;
		}
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop(){
		int element = data[tos];
		tos  = tos - 1;

		return element;
	}


	/**
	 * Clear stack
	 */
	public void clear() {


	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		if (tos < 0) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		if (tos >= data.length) {
			int newData [] = new int[data.length + 16];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
		}
	}
}