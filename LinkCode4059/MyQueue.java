package LinkCode4059;

import java.util.Stack;

public class MyQueue {
	
	Stack<Integer> stack1;  //进来的元素都放在里面
    Stack<Integer> stack2;  //元素都从这里出去

	public MyQueue() {
        // do initialization if necessary
		
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
    	stack1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
    	if(stack2.empty()){//如果没有元素,就把负责放入元素的栈中元素全部放进来
    		while(!stack1.empty()){
    			stack2.push(stack1.top());
    			stack1.top();
    		}
    	}
    	int ret=stack2.top(); //有元素后就可以弹出了
    	stack2.pop();
    	return ret;
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
    	if(stack2.empty()){
    		while(!stack1.empty()){
    			stack2.push(stack1.top());
    			stack1.pop();
    		}
    	}
    	return stack2.top();
    }

}
