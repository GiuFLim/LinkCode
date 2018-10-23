package LinkCode;

import java.util.Stack;

public class MinStack {
	public Stack<Integer> stack;
	public Stack<Integer> minstack;

	public MinStack() {
		// do initialization if necessary
		stack = new Stack<Integer>();
		minstack = new Stack<Integer>();
	}

	/*
	 * @param number: An integer
	 * 
	 * @return: nothing
	 */
	public void push(int number) {
		// write your code here
		stack.push(number);
		if (minstack.isEmpty()) {
			minstack.push(number);
		} else {
			int value = minstack.peek() >= number ? number : minstack.peek();
			minstack.push(value);
		}
	}

	/*
	 * @return: An integer
	 */
	public int pop() {
		// write your code here
		minstack.pop();
		return stack.pop();
	}

	/*
	 * @return: An integer
	 */
	public int min() {
		// write your code here
		return minstack.peek();
	}

}
