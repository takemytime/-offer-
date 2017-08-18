package practice20170818;

import java.util.Stack;

//用两个栈实现队列
//	题目描述
//	用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

public class Demo5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop(){
    	while(!stack1.isEmpty()) {		//直到stack1为空，将stack1压入stack2
    		stack2.push(stack1.pop());
    	}
    	int first = stack2.pop();		//把stack2的最后一个即stack1第一个输出
    	while(!stack2.isEmpty()) {		//再把stack2里的还原回stack1，以备push函数再压入新的元素进入stack1
    		stack1.push(stack2.pop());
    	}
    	return first;
    }

}
