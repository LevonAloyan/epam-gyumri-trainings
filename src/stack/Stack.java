package stack;

import java.util.Arrays;

public class Stack {

	private static final int DEFAULT_SIZE = 4;
	private int[] data;
	private int tos;

	public Stack() {
		this(DEFAULT_SIZE);
	}

	public Stack(int size) {
		data = new int[size];
		this.tos = -1;
	}

	public void push(int value) {
		if (tos == data.length-1 && data.length <= 10) {
			ensureCapacity();
		} else if (data.length > 10) {
			try {
				throw new StackOverFlowException();
			} catch (StackOverFlowException e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
			data[++tos] = value;
	}

	public int pop() throws EmptyStackException {
		if (tos == -1) {
			throw new EmptyStackException();
		}
			return data[tos--];
	}

	public void clear() {
		if (data.length < 1000) {
			Arrays.fill(data, 0);
		} else {
			data = new int[DEFAULT_SIZE];
		}
			tos = -1;
	}


	public boolean isEmpty() {
		return tos == -1;
	}

	private void ensureCapacity() {
		int length = (data.length + 5);
		int[] result = new int[length];
		System.arraycopy(data,0,result,0,data.length);
		data = result;
	}
}
