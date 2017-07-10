/*
METHOD ONE(99.05% 14ms)
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int preVal=0;
    public TreeNode convertBST(TreeNode root) {
        visit(root);
        return root;
    }
    public void visit(TreeNode root){
        if(root!=null){
            visit(root.right);
            root.val+=preVal;
            preVal=root.val;
            visit(root.left);
        }  
    }
}