import java.util.*;
public class LeetCode{
	public boolean isPalindrome(int x) {
        String s=""+x;
        int i=0;
        int j=s.length()-1;
        while(i<=j){
        	if(s.charAt(i++)!=s.charAt(j--))return false;
        }
        return true;
    }
	public static void main(String[] args){
		LeetCode leetCode=new LeetCode();		
		System.out.println(leetCode.isPalindrome(0123));
	}
}