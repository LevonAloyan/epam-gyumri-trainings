package stack;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
		if (tos == value-1)
			System.out.println("stack is over");
		else
			data[++tos] = value;
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {
		if(tos < 0){
			System.out.println("stack is not over");
			return 0;
		}
		else
			return data[--tos];
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		for (int tos = 0; tos < DEFAULT_SIZE; tos++)
			data[tos] = null;

	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {

		if (tos > 0){
			System.out.println(data[tos]);
		}
		else{
			return true;
		}




		/**
		 * Increase the stack capacity if there is not enough space to add additional items
		 */
		private void ensureCapacity() {

		}
	}