/*
METHOD ONE(79.11% 1ms T1)
tips
"preinorder"(right first)the tree,
add the val of first node arrving the next depth to List
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        visit(root,result,0);
        return result;
    }
    public void visit(TreeNode root,List<Integer> result,int depth){
        if(root!=null){
            if(depth>=result.size()){
                result.add(root.val);
            }
            if(root.right!=null)visit(root.right,result,depth+1);
            if(root.left!=null)visit(root.left,result,depth+1);
        }
    }
}