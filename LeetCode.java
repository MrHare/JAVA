import java.util.*;
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val=x;}
}
public class LeetCode{
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode h=new ListNode(0);
		boolean isEnd=false;
		h.next=head;
		ListNode p,q,tmp1,tmp2;/////////p the node 1,q the node k
		p=h;
		while(p.next!=null){
			tmp1=p.next;
			if(tmp1.next!=null){
				tmp2=tmp1.next;
			}else{
				break;
			}
			tmp1.next=tmp2.next;
			tmp2.next=tmp1;
			p.next=tmp2;
			p=tmp1;
		}
		return h.next;
    }
	public static void main(String[] args){
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
		ListNode h;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;	
		n4.next=n5;
		n5.next=n6;
		LeetCode leetCode=new LeetCode();
		h=leetCode.reverseKGroup(n1,2);
		while(h!=null){
			System.out.println(h.val);
			h=h.next;
		}

	}
}
