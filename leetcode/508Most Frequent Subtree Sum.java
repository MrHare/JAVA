/*
METHOD ONE(97.50% 14ms)
time complexity():o(n)
space comlexity<=o(tree.size());
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
    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    int max=1;
    int count=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        getSum(root);
        int[] ret=new int[count];
        int index=0;
        for(Integer i:map.keySet()){
            if(map.get(i)==max)ret[index++]=i;
        }
        return ret;
    }
    public int getSum(TreeNode root){
        if(root==null)return 0;
        int sum=root.val+getSum(root.left)+getSum(root.right);
        int tmp=0;
        if(map.containsKey(sum)){
            tmp=map.get(sum);
        }
        tmp++;
        if(tmp>max){
            max=tmp;
            count=1;
        }else{
            if(tmp==max){
                count++;
            }
        }
        map.put(sum,tmp);
        return sum;
    }
}