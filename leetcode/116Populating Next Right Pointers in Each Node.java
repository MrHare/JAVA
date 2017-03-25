/*
METHOD ONE(29.74% 1ms T2)
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
        if(root==null)return;
        if(root.left!=null){
            root.left.next=root.right;
            connect(root.left);
            connect(root.right);
            foo(root.left,root.right);
        }
    }
    public void foo(TreeLinkNode node1,TreeLinkNode node2){
        if(node1.left!=null){
            node1.right.next=node2.left;
            foo(node1.right,node2.left);
        }
    }
}
/*
//-----------------------------------------------------------
METHOD TWO (29.74% 1ms)
defect:
the node1.right in foo(node1.left,node1.right)and in foo(node1.right,node2.left)
the operation will be done two times in next recursion
!!!! 

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
        if(root==null)return;
        foo(root.left,root.right);
    }
    public void foo(TreeLinkNode node1,TreeLinkNode node2){
        if(node1!=null){
            node1.next=node2;
            if(node1.left!=null){
                node1.next=node2;
                foo(node1.left,node1.right);
                foo(node1.right,node2.left);
                foo(node2.left,node2.right);
            }
        }
    }
}