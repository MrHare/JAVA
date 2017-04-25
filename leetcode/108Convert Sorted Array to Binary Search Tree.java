/*
METHOD ONE(14.91% 1ms T2)
use the binary search travel the Array and build the BST
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums,0,nums.length-1);    
    }
    public TreeNode buildBST(int[] nums,int begin,int end){
        if(begin<=end){
            int mid=begin+(end-begin)/2;
            TreeNode node=new TreeNode(nums[mid]);
            node.left=buildBST(nums,begin,mid-1);
            node.right=buildBST(nums,mid+1,end);
            return node;
        }else{
            return null;
        }
    }
}