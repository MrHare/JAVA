/*
METHOD ONE(7ms 67.33% T2)
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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode node = root;
        TreeNode pNode = null;
        while(node != null){
            if(node.val == key)break;
            pNode = node;
            if(key < node.val){
                node = node.left;
            }else{
               node = node.right; 
            } 
        }
        if(node == null)return root;
        if(pNode == null)return removeNode(node);
        if(pNode.left == node){
            pNode.left = removeNode(node);
        }else{
            pNode.right = removeNode(node);
        }
        return root;
    }
    public TreeNode removeNode(TreeNode root){
        if(root.left == null)return root.right;
        if(root.right == null)return root.left;
        TreeNode node = root.right;
        if(node.left == null){
            node.left = root.left;
            return node;
        }
        TreeNode pNode=root;
        while(node.left != null){
            pNode = node;
            node = node.left;
        }
        root.val = node.val;
        pNode.left = node.right;
        return root;
    }
}
/*
METHOD TWO(67.33% 7ms T2)
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return root;
        if(key < root.val){
            root.left = deleteNode(root.left,key);
        }else if(key > root.val){
            root.right =deleteNode(root.right,key); 
        }else{
            if(root.left == null)return root.right;
            if(root.right == null)return root.left;
            root.val = findMinNode(root.right).val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
    public TreeNode findMinNode(TreeNode node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}