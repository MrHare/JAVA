/*
//METHOD ONE(8.3% 1ms T1)
TIPS
travel the linkedlist and turn the next of the node to a TARGET NODE(head),
if the the travel can arrived at the TARGET NODE,then the list has cycle,vice versa.
THIS METHOD WILL BREAK THE LIST!
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tmp=head;
        ListNode p;
        while(tmp!=null){
            p=tmp.next;
            tmp.next=head;
            tmp=p;
            if(tmp==head)return true;
        }
        return false;
    }
}
//-------------------------------------------------------------------
/*
//METHOD TWO(8.3% 1ms T1)
TIPS
two travels,fast(every step travel two node)and slow(every step travel one node)
if the travel arrived at null,return false
else there must be a cycle,the fast will catch the slow
WON'T CHANGE LIST
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            if(fast.next==null){
                return false;
            }else{
                fast=fast.next.next;
            }
            slow=slow.next;
            if(fast==slow)break;
        }
        return fast!=null;
    }
}
*/