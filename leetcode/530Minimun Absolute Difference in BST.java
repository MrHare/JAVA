/*
METHOD ONE(77.33% 15ms)
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
    int ret = Integer.MAX_VALUE;
    int preVal = -1;
    public int getMinimumDifference(TreeNode root) {       
        visit(root);
        return ret;
    }
    public void visit(TreeNode root){
        if(root.left != null){
            visit(root.left);
        }
        if(preVal >= 0){
            int tmp = root.val - preVal;
            ret = tmp < ret ? tmp : ret;
        }
        preVal = root.val;
        if(root.right != null){
            visit(root.right);
        }       
    }
}

//METHOD1.1(64.66% 16ms)
public class Solution {
    int ret = Integer.MAX_VALUE;
    int preVal = -1;
    public int getMinimumDifference(TreeNode root) {       
        if(root == null)return 0; //no matter what is returned
        getMinimumDifference(root.left);
        if(preVal >= 0){
            ret = Integer.min(ret, root.val-preVal);
        }
        preVal = root.val;
        getMinimumDifference(root.right);
        return ret;
    }
}