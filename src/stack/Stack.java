package stack;

public class Stack {
	public static void main(String[] args) {
		System.out.println(stack);
		stack.push(12);
		stack.pop();
		stack.clear();
		stack.isEmpty();
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
		if (tos == data.length-2){
			ensureCapacity();
		}
		tos++;
		data[tos] = value;
	}
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {

		return data[tos];
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		while (tos != -1) {
			tos--;
		}
	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		if (tos == -1) {
			System.out.println("stack is empty");
			return true;
		}
		System.out.println("stack is fool");

		return false;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		int size = DEFAULT_SIZE*2;
		int [] newArray = new int[size];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		data = newArray;
		newArray = null;
	}
}