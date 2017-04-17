/*
METHOD ONE(56.66% 1ms)
*/
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode head=root;
        TreeLinkNode firstTravel=null;
        TreeLinkNode secondTravel=null;
        boolean isHead=false;
        while(isHead==false){
            firstTravel=head;
            isHead=true;
            while(firstTravel!=null){
                if(firstTravel.left!=null){
                    if(isHead){
                        head=firstTravel.left;
                        secondTravel=head;
                        isHead=false;
                    }else{
                        secondTravel.next=firstTravel.left;
                        secondTravel=secondTravel.next;
                    }
                }
                if(firstTravel.right!=null){
                    if(isHead){
                        head=firstTravel.right;
                        secondTravel=head;
                        isHead=false;
                    }else{
                        secondTravel.next=firstTravel.right;
                        secondTravel=secondTravel.next;
                    }
                }
                firstTravel=firstTravel.next;
            }
        }
    }
}