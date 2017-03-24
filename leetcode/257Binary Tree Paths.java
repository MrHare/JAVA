/*
wrong idea
StringBuilder is different from String!!!,the val of a StringBuilder 
can be changed through a method foo.
import java.util.*;
public class LeetCode{
    public static void main(String[] args){
        String a="123";
        StringBuilder b=new StringBuilder();
        b.append("123");
        foo(a);
        System.out.println(a);     //123
        foo1(b);
        System.out.println(b.toString()); //123ddss
    }
    static String foo(String a){
        a=a+"ddss";
        System.out.println(a);
        return a;
    }
    static StringBuilder foo1(StringBuilder b){
        b.append("ddss");
        System.out.println(b);
        return b;
    }
}
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<String>();
        if(root==null)return result;
        StringBuilder tmp=new StringBuilder();
        tmp.append(root.val);
        if(root.left!=null)foo(root.left,tmp,result);
        if(root.right!=null)foo(root.right,tmp,result);
        return result;
    }
    void foo(TreeNode node,StringBuilder tmp,List<String> result){
        tmp.append("->").append(node.val);
        if(node.left==null&&node.right==null){
            result.add(tmp.toString());            
        }else{
            if(node.left!=null){
                foo(node.left,tmp,result);
            }
            if(node.right!=null){
                foo(node.right,tmp,result);
            }
        }
    }
}
/*
--------------------------------------------------------------------------------
METHOD ONE(16% 27ms)
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<String>();
        if(root==null)return result;
        //StringBuilder tmp=new StringBuilder();
        //tmp.append(root.val);
        String tmp=""+root.val;
        if(root.left==null&&root.right==null){
            result.add(tmp);
        }else{
            if(root.left!=null)foo(root.left,tmp,result);
            if(root.right!=null)foo(root.right,tmp,result);
        }
        return result;
    }
    void foo(TreeNode node,String tmp,List<String> result){
        //tmp.append("->").append(node.val);
        tmp=tmp+"->"+node.val;
        if(node.left==null&&node.right==null){
            result.add(tmp);            
        }else{
            if(node.left!=null){
                foo(node.left,tmp,result);
            }
            if(node.right!=null){
                foo(node.right,tmp,result);
            }
        }
    }
}