import java.util.*;
public class LeetCode{
	public int myAtoi(String str) {
		str=str.trim();
		if(str.length()==0)return  0;
		int flag=1;
		int i=0;
		int result=0;
		int max=Integer.MAX_VALUE/10;
		if(str.charAt(i)=='-'||str.charAt(i)=='+'){
			if(str.charAt(i)=='-'){
				flag=-1;
			}
			i++;
		}
		for(;i<str.length()&&str.charAt(i)<='9'&&str.charAt(i)>='0';i++){
			if(result>max||result==max&&str.charAt(i)>'7'){
				if(flag==1)return Integer.MAX_VALUE;
				return Integer.MIN_VALUE;
			}
			result=result*10-'0'+str.charAt(i);
		}
		return result*flag;

    }
	public static void main(String[] args){
		LeetCode leetCode=new LeetCode();
		System.out.println(leetCode.myAtoi("+1"));
	}
}