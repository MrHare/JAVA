/*
METHOD ONE()
TIPS:
NOTE:Given n will always be valid
create a new head(incase of the remove node coubld be the head)
two pointers,the two pointers travel at the same time after the first travel 
n steps,till the first arrived the end
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hHead=new ListNode(0);
        hHead.next=head;
        ListNode first=hHead;
        ListNode second=hHead;
        for(int i=0;i<n;i++){
            first=first.next;
        }
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return hHead.next;
    }
}