package stack;

public class Stack {

	static final int DEFAULT_SIZE = 16;
	public int[] data;
	private int tos; //index which determines the top of stack
	public Stack() {
		this(DEFAULT_SIZE);
	}

	public Stack(int size) {
		data = new int[size];
		this.tos = 0;
	}

	/**
	 * Add element into stack
	 * @return
	 */
	public int push(int value) {
		data[tos] = value;
		tos++;
		return value;
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop(int value) {
		if (isEmpty(data)) {
			System.out.println("This array don't have value,that pop it");
		} else {
			for (int i = 0; i < data.length; i++) {
				if (data[i] == value) {
					return value;
				}
			}
		}
		return -1;
	}



	/**
	 * Clear stack
	 */
	public void clear() {
		if (isEmpty(data)) {
			System.out.println("That array already is empty");
		} else {
			for (int i = 0; i < data.length; i++) {
				if (data[i] != 0) {
					data[i] = 0;
				}
			}
			System.out.println("Array is cleared");
		}
	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty(int [] arrray) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] != 0){
				return false;
			}
		}
		return true;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		if (data.length > 16 && data.length < 1000){
			data = new int[data.length * 5];
		}
	}
}