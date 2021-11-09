package stack;

public class Stack {
//	public static void main(String[] args) {
//
//		Stack stack = new Stack(16);
//		//System.out.println(stack);
//		stack.push(44);
//		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
//		stack.clear();
//
//	}

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
		//if (tos == data.length - 1) {
		if (tos == data.length){
			ensureCapacity();
		}else {
			data[++tos] = value;
		}
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {
//		if (isEmpty()) {
//			System.out.print(" Stack is empty ");
//			return -1;
//		} else {
//			return data[tos--];
//		}
		if (tos == -1){
			System.out.println("empty");
			return -1;
		}else{
			return data[tos--];

		}
	}


	/**
	 * Clear stack
	 */
	public void clear() {
//		data = new int[DEFAULT_SIZE];
//		tos = -1;
		if (data.length < 1000){
			for (int i = 0; i < data.length; i++){
				data[i] = -1;
			}
			//tos = -1;
		}else {
			data = new int[DEFAULT_SIZE];
		}
		tos = -1;
	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return 0 > tos;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		int[] dataTemp = new int[data.length + 10];
		System.arraycopy(data, 0, dataTemp, 0, data.length);
		data = dataTemp;
	}
}