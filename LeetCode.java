import java.util.*;
public class LeetCode{
	public String countAndSay(int n) {
        if(n==1)return "1";
        if(n==2)return "11";
        String str=countAndSay(n-1);
        StringBuilder result=new StringBuilder();
        int count=1;
        int i=1;
        for(;i<str.length();i++){   	
        	if(i<str.length()&&str.charAt(i)==str.charAt(i-1)){
        		count++;
        	}else{    		
        		//result=result+count+str.charAt(i-1);
        		result.append(count).append(str.charAt(i-1));
        		count=1;
        	}
        }
        //result=result+count+str.charAt(i-1);
        result.append(count).append(str.charAt(i-1));
        return result.toString();
    }
	public static void main(String[] args){
		LeetCode leetCode=new LeetCode();
		for(int i=1;i<10;i++)		
		System.out.println(leetCode.countAndSay(i));
	}
}