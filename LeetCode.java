import java.util.*;
public class LeetCode{
	public int lengthOfLongestSubstring(String s) {
		int length=0;
		int start=1;
		int[] array=new int[128];
		s="a"+s;
		char[] cs=s.toCharArray();
		for(int i=1;i<s.length();i++){
			if(array[cs[i]]!=0){
				start=Math.max(start,array[cs[i]]+1);
			}
			array[cs[i]]=i;
			length=Math.max(length,i-start+1);
		}    
		return length;  
    }
	public static void main(String[] args){
		LeetCode leetCode=new LeetCode();		
		System.out.println(leetCode.lengthOfLongestSubstring("abcabcbb"));
	}
}