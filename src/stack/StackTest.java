package stack;

import stack.exceptions.EmptyStackException;
import stack.exceptions.StackOverFlowException;

public class StackTest {

	public static void main(String[] args) throws StackOverFlowException {
		Stack stack = new Stack();

		try{
			for(int i = 0; i < 30; i++){
				stack.push(100);
			}
		}catch (StackOverFlowException e){
			System.out.println(e);
		}

		try{
			stack.pop();
		}catch (EmptyStackException e){
			System.out.println(e);
		}
	}
}