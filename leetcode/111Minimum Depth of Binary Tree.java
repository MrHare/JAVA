/*
METHOD ONE(21.81.% 1ms)
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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        if(root.left!=null&&root.right!=null){
            return Integer.min(minDepth(root.left)+1,minDepth(root.right)+1);
        }
        if(root.left==null)return minDepth(root.right)+1;
        return minDepth(root.left)+1;
    }
}