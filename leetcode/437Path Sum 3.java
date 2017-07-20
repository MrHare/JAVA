/*
METHOD ONE(70.98% 28ms)
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
    public int pathSum(TreeNode root, int sum) {
        if(root == null)return 0;
        foo(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);       
        return ret;
    }
    public void foo(TreeNode root,int current){
        if(root != null){
            if(root.val == current){
                ret ++;
            }
            foo(root.left,current - root.val);
            foo(root.right,current - root.val);
        }
    }
}