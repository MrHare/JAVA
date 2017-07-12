/*
METHOD ONE(10.47% 16ms)
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        visit(root,list,0);
        List<Double> ret = new ArrayList<Double>();
        for(List<Integer> array : list){
            Double sum = 0.0;
            for(int i: array){
                sum += i;
            }
            ret.add(sum/array.size());
        }
        return ret;
    }
    public void visit(TreeNode root, List<List<Integer>> list, int level){
        if(root == null)return;
        if(level == list.size()){
            List<Integer> array = new ArrayList<Integer>();
            list.add(array);
        }
        list.get(level).add(root.val);
        visit(root.left, list, level + 1);
        visit(root.right, list, level + 1);
    }
    
}