package practice20170818;

//从尾到头打印链表 
//	题目描述
//	输入一个链表，从尾到头打印链表每个节点的值。

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;

import practice170811.Demo19.ListNode;
public class Demo3 {
	/*
	 * 也可以用stack来做
	 */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        while(listNode != null) {
        	ans.add(listNode.val);
        	listNode = listNode.next;
        }
        for(int i = ans.size()-1 ; i >= 0 ; i--) {
        	res.add(ans.get(i));
        }
        return res;
    }
    
	 public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	 
}