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

		if (tos == DEFAULT_SIZE){

			System.out.println("stake is full");
		}
		else data[++tos] = value;
		System.out.print(data[value] + " ");

	}


	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {

		if (tos < 0 ) {
			System.out.println("stake is ampty ");
		}
		else
			return data[tos--];

		return 0;
	}


	/**
	 * Clear stack
	 */
	public void clear() {

		for (int i = 0; i < DEFAULT_SIZE; i++) {

			data[i] = 0;

		}

	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {

		for (int i = 0; i < DEFAULT_SIZE; i++) {

			if (data[i] == 0){

				return true;

			}

		}

		return false;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {

		if (tos == DEFAULT_SIZE){

			int newData[];

			newData = new int[DEFAULT_SIZE+1];

		}

	}

	public static void main(String[] args) {

		Stack myStack = new Stack();

		for (int i = 0; i < DEFAULT_SIZE; i++) {

			myStack.push(i);

		}
		System.out.println();

		for (int i = 0; i < DEFAULT_SIZE; i++) {

			System.out.print(myStack.pop() + " ");

		}

		myStack.clear();
		myStack.isEmpty();


	}
}