package practice20170823;

//合并两个排序的链表 
//题目描述
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

public class Demo16 {
	

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode ln = new ListNode(0);
        ListNode res = ln;
        ln = ln.next;
        
        if(list1 == null)
        	return list2;
        if(list2 == null)
        	return list1;
        
        while(list1 != null || list2 != null) {
        	if(list1.val< list2.val || list2 == null) {
        		ln.val = list1.val;
        		ln = ln.next;
        		list1 = list1.next;
        	}else if(list1.val >= list2.val || list1 == null) {
        		ln.val = list2.val;
        		ln = ln.next;
        		list2 = list2.next;
        	}
        }
        return res.next;
    }
}
