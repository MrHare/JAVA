/*
METHOD ONE(69.95% 2ms T1)
tips
1.get the length 
2.partition the linked list,reverse the last length-(length+2)/2 nodes
3.merge the two list
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