/*
METHOD ONE(30.69% 2ms T3)
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
    public boolean isValidBST(TreeNode root) {
        List<Integer> array=new ArrayList<Integer>();
        return visit(root,array);
    }
    public boolean visit(TreeNode root,List<Integer> array){
        if(root!=null){
            boolean left=visit(root.left,array);
            int length=array.size();
            if(length!=0&&array.get(length-1)<root.val||length==0){
                array.add(root.val);
                return left&&visit(root.right,array);
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
}
//------------------------------------------------------------------------
/*
wrong idea
when the test tree including a node whose val is equal Integer.MIN_VALUE;
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
    public Integer preVal=Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        return visit(root);
    }
    public boolean visit(TreeNode root){
        if(root!=null){
            boolean left=visit(root.left);
            if(preVal<root.val){
                preVal=root.val;
                return left&&visit(root.right);
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
}
//---------------------------------------------------------------------
/*
METHOD TWO(30.69% 2ms)
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
    public Integer preVal;
    boolean first=true;
    public boolean isValidBST(TreeNode root) {
        return visit(root);
    }
    public boolean visit(TreeNode root){
        if(root!=null){
            boolean left=visit(root.left);
            if(preVal<root.val||first){
                preVal=root.val;
                first=false;
                return left&&visit(root.right);
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
}
*/