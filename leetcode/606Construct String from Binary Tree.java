/*
METHOD ONE(64.19% 33ms)
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
    public String tree2str(TreeNode t) {
        StringBuilder ret = new StringBuilder();
        if(t == null)return "";
        ret.append(t.val);
        if(t.left == null && t.right == null){
            return ret.toString();
        }
        if(t.left != null){
            ret.append("(")
                .append(tree2str(t.left))
                .append(")");
        }else{
            ret.append("()");            
        }
        if(t.right != null){
            ret.append("(")
                .append(tree2str(t.right))
                .append(")");
        }
        return ret.toString();
    }
}