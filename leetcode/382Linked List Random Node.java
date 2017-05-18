/*
METHODN ONE(45.31% 145ms)
tips:
for 1st node, save it,
for ith node ,the possibility of saving it as final result is 1/i
for (i+1)th node,the posiibility of saving it as final result is 1/(i+1),
the posibility of origin(the result of ith step)is (1/i)*(i/i+1)=1/(i+1),
the the possibility of fisrt i+i node as final result is equaly to 1/(i+1)
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
    ListNode h;
    Random random;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        h=head;
        random=new Random();
    }
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode travel=h;
        int ret=0;
        for(int i=0;travel!=null;i++){
            if(random.nextInt(i+1)==0)ret=travel.val;
            travel=travel.next;
        }
        return ret;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */