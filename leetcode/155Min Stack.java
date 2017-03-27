/*
METHOD ONE(0.25% 273 ms)
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
    public void reorderList(ListNode head) {
        int length=0;
        ListNode travel=head;
        while(travel!=null){
            length++;
            travel=travel.next;
        }
        if(length<3)return;
        travel=head;
        for(int i=0;i<(length)/2;i++){
            travel=travel.next;
        }
        ListNode tmp=travel;
        travel=travel.next;
        tmp.next=null; 
        ListNode start=travel;
        travel=travel.next;
        start.next=null;
        while(travel!=null){
            tmp=travel;
            travel=travel.next;
            tmp.next=start;
            start=tmp;
        }
        travel=head;
        while(start!=null){
            tmp=start;
            start=start.next;
            tmp.next=travel.next;
            travel.next=tmp;
            travel=travel.next.next;
        }
    }
}