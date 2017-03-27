/*
METHOD ONE(8.18% 1ms T1)
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
    public ListNode partition(ListNode head, int x) {
        ListNode hHead=new ListNode(1);
        hHead.next=head;
        ListNode travel=hHead;
        while(travel.next!=null&&travel.next.val<x){
            travel=travel.next;
        }
        head=travel;
        while(travel.next!=null){
            if(travel.next.val<x){
                ListNode tmp=travel.next;
                travel.next=travel.next.next;
                tmp.next=head.next;
                head.next=tmp;
                head=tmp;
            }else{
                travel=travel.next;
            }
        }
        return hHead.next;
    }
}