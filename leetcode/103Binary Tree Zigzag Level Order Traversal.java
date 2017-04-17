//METHOD ONE(46.32% 2ms T2)
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int depth=0;
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root!=null)visit(root,result,depth);
        return result;
    }
    public void visit(TreeNode root,List<List<Integer>> result,int depth){
        if(root!=null){
            if(result.size()==depth){
                result.add(new ArrayList<Integer>());
            }
            if(depth%2==0){
                result.get(depth).add(root.val);
            }else{
                result.get(depth).add(0,root.val);
            }
            visit(root.left,result,depth+1);
            visit(root.right,result,depth+1);
        }
    }
}