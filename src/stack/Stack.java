package stack;




public class Stack {
//	public static void main(String[] args) {
//		Stack stack = new Stack();
//		stack.push(22);
//		stack.push(44);
//		stack.push(88);
//		stack.clear();
//		stack.push(12);
//		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
//	}
public static void main(String[] args) {

	Stack stack = new Stack();
	System.out.println(stack.isEmpty());
	stack.push(7);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	stack.push(6);
	stack.push(8);
	stack.push(8);
	stack.push(8);
	stack.push(9);
	stack.push(9);
	stack.push(10);
	stack.push(12);
	try {
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	} catch (EmptyStackException exception) {
		exception.printStackTrace();
	}
}


	static final int DEFAULT_SIZE = 16;
	private int[] data;
	private int tos;

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
		if (tos == data.length) {
			ensureCapacity();
		}else if (data.length > 10) {
			try {
				throw new StackOverFlowException();
			} catch (StackOverFlowException e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
		data[++tos] = value;
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() throws EmptyStackException {

		if (isEmpty()){
			throw  new EmptyStackException();

			//System.out.println("empty");
			//return -1;
		}
		return  data [tos--];
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		tos = -1;
	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		//return 0 > tos;
		return tos == -1;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		int[] dataResult = new int[data.length + 10];
		System.arraycopy(data, 0, dataResult, 0, data.length);
		data = dataResult;
	}
}