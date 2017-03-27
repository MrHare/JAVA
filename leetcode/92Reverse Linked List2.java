/*
METHOD ONE(18.23% 0ms T1)
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode hHead=new ListNode(1);
        hHead.next=head;
        ListNode travel=hHead;
        for(int i=1;i<m;i++){
            travel=travel.next;
        }
        head=travel;
        travel=travel.next;
        ListNode start=travel;
        ListNode end=travel;
        travel=travel.next;
        for(int i=m;i<n;i++){
            ListNode tmp=travel;
            travel=travel.next;
            tmp.next=start;
            start=tmp;
        }
        head.next=start;
        end.next=travel;
        return hHead.next;
    }
}