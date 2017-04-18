/*
METHOD ONE(67.33% 16ms)
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length,inorder,0,inorder.length);
    }
    public TreeNode build(int[] preorder,int ps,int pe,int[] inorder,int is,int ie){
        if(ps>=pe)return null;
        TreeNode node=new TreeNode(preorder[ps]);
        for(int i=0;;i++){
            if(preorder[ps]==inorder[i+is]){
                node.left=build(preorder,ps+1,ps+i+1,inorder,is,is+i);
                node.right=build(preorder,ps+i+1,pe,inorder,is+i+1,ie);
                break;
            }
        }
        return node;
    }
}