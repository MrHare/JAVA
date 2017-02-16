import java.util.*;
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val=x;}
}
public class LeetCode{
	 public ListNode deleteDuplicates(ListNode head) {
        ListNode result=new ListNode(0);
        result.next=head;
        while(head.next!=null){
        	if(head.val==head.next.val){
        		head.next=head.next.next;
        	}else{
        		head=head.next;
        	}
        }
        return result.next;
    }
	public static void main(String[] args){
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(2);
		ListNode n4=new ListNode(2);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
		ListNode h;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;	
		n4.next=n5;
		n5.next=n6;
		LeetCode leetCode=new LeetCode();
		h=leetCode.deleteDuplicates(n1);
		while(h!=null){
			System.out.println(h.val);
			h=h.next;
		}

	}
}
