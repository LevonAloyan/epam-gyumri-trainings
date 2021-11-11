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
	Stack stack = new Stack(value);
	stack.push(12);
	stack.push(245);
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public static String pop(String value) {
	Stack stack = new Stack();
	stack.pop("Apple");
	stack.pop("Peach");
		return stack.pop(value);
	}


	/**
	 * Clear stack
	 */
	public void clear(int value) {
 Stack stack = new Stack();
 stack.clear(21);
 stack.clear(35);


	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return false;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {

	}

	public static void main(String[] args) {

	}
}