/*
METHOD ONE(65.41% 9ms)
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
    int ret = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null){
            visit(root);
        }
        return ret;
    }
    public int visit(TreeNode root){
        int left = -1;
        int right = -1;
        if(root.left != null){
            left = visit(root.left);
        }
        if(root.right != null){
           right = visit(root.right);
        }
        ret = Integer.max(left + right + 2, ret);
        return 1 + Integer.max(left,right);
    }
}
/*
METHOD TWO(65.41% 9ms)
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
    int ret = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        visit(root);
        return ret;
    }
    public int visit(TreeNode root){
        if(root == null)return 0;
        int left = visit(root.left);
        int right = visit(root.right);
        ret = Integer.max(left + right, ret);
        return 1 + Integer.max(left,right);
    }
}