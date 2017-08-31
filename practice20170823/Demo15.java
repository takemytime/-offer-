package practice20170823;

import java.util.Stack;

//反转链表 
//题目描述
//输入一个链表，反转链表后，输出链表的所有元素。

public class Demo15 {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
//    public ListNode ReverseList(ListNode head) {
//    	Stack<Integer> st = new Stack<Integer>();
//    	ListNode ln = new ListNode(0);
//    	ListNode res = ln;
//    	while(head != null) {
//    		st.push(head.val);
//    		head = head.next;
//    	}
//    	while(st.isEmpty()) {
//    		ln.val = st.pop();
//    		ln = ln.next;
//    	}
//    	
//    	return res;
//    }
	
	/*
	 * 运行时间：20ms   占用内存：8588k
	 */
	public ListNode ReverseList(ListNode head) {
		if(head == null)
			return null;		
		ListNode pre = null;
		ListNode next = null;		
		while(head != null) {
			next = head.next;
			head.next = pre;			
			pre = head;
			head = next;					
		}		
		return pre;
	}
	
}
