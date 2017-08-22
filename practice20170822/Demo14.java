package practice20170822;

//链表中倒数第k个结点 
//题目描述
//输入一个链表，输出该链表中倒数第k个结点。

public class Demo14 {
	

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	/*
	 * 运行时间：23ms 占用内存：8528k
	 */
    public ListNode FindKthToTail(ListNode head,int k) {
    	ListNode pre = head;
    	ListNode last = head;
    	if(head == null || k <= 0 )
    		return null;
    	for(int i=1 ; i < k; i++) {			//先把pre移到整数第k个位置
    		if(pre.next != null)
    			pre = pre.next;
    		else
    			return null;
    	}
    	while(pre.next!=null) {				//然后pre和last一起往后移，pre移到最后一个的时候，就是last处在倒数第k的位置
    		pre = pre.next;
    		last = last.next;
    	}
    	return last;
    }
}
