package test.leetcode.solutions;

class ListNode{
	
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
		this.next = null;
	}
	
}

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        if(l1 == null && l2 == null)
        	return null;
        
        ListNode curr = head;
        int carry = 0;
        while(l1 != null || l2 != null){
        	int first = l1!=null?l1.val : 0;
        	int second = l2!=null?l2.val : 0;
        	int result = first + second + carry;
        	carry = 0;
        	if(result >= 10){
        		result = result%10;
        		carry = 1;
        	}
        	
        	ListNode temp = new ListNode(result);
        	if(head == null){
        		head = temp;
        		curr = temp;
        	}
        	else{
        		curr.next = temp;
        		curr = temp;
        	}
        	if(l1 != null) l1 = l1.next;
        	if(l2 != null) l2 = l2.next;
        }
        
        if(carry == 1){
        	ListNode temp = new ListNode(1);
        	curr.next = temp;
        	curr = temp;
        }
        
        return head;
    }
}
