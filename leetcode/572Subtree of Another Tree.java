/*
METHOD ONE(78.52% 26ms)
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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)return false;
        return (s.val == t.val && subtree(s, t)) || isSubtree(s.left,t) || isSubtree(s.right,t);        
    }
    public boolean subtree(TreeNode s, TreeNode t){
        if(s != null && t != null){
            return s.val == t.val && subtree(s.left, t.left) && subtree(s.right, t.right);
        }
        return s == t;
    }
}