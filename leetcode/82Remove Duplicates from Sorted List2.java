/*
//METHOD ONE(6.0% 2ms)
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode hHead=new ListNode(1);
        ListNode travelNode=head;
        hHead.next=head;
        head=hHead;
        while(travelNode!=null){
            if(travelNode.next!=null&&travelNode.val==travelNode.next.val){
                while(travelNode.next!=null&&travelNode.val==travelNode.next.val){
                    travelNode=travelNode.next;
                }
                travelNode=travelNode.next;
                head.next=travelNode;
            }else{
                head=head.next;
                travelNode=travelNode.next;
            }
        }
        return hHead.next;
    }
}

/*
//---------------------------------------------------
METHOD TWO(25.25% 1ms T1)
this method is faster!! amazing,why?
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode hHead=new ListNode(1);
        ListNode tmp=hHead;
        while(head!=null){
            if(head.next!=null&&head.val==head.next.val){
                while(head.next!=null&&head.val==head.next.val){
                    head=head.next;
                }
                head=head.next;
            }else{
                tmp.next=head;      //l1
                head=head.next;   //head should travel before tmp.next=null,otherwise the head.next would be null,easy to make a mistake
                tmp=tmp.next;
                tmp.next=null;   //add a node a time,so the tmp.next should be null or tmp.next=new ListNode(head.val) instead(use space),
            }
        }
        return hHead.next;
        
    }
}