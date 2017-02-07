//Feb.7th 2017 by Mr.Hare
//find the longest common sequence(need not be continuous)
//eg:LCS(abc,aadc)=ac
/*
test simple
 
*/
import java.util.*;
public class LCS{
	String result="";
	public int findLCS(String str1,String str2){
		int length1=str1.length();
		int length2=str2.length();
		if(length1==0||length2==0)return 0;
		if(length1==1||length2==1){
			System.out.println(str1+"--"+str2);
			if((length1==1)&&str2.indexOf(str1)!=-1)return 1;
			if((length2==1)&&str1.indexOf(str2)!=-1)return 1;
			return 0;
		}
		if(str1.charAt(length1-1)==str2.charAt(length2-1)){
			System.out.println(str1+"--"+str2);
			return findLCS(str1.substring(0,length1-1),str2.substring(0,length2-1))+1;
		}
		else{
			System.out.println(str1+"--"+str2);
			int len1=findLCS(str1.substring(0,length1-1),str2.substring(0,length2));
			int len2=findLCS(str1.substring(0,length1),str2.substring(0,length2-1));
			if(len1>=len2)return len1;
			return len2;
		}

	}
	public static void main(String[] args){
		LCS lcs=new LCS();
		System.out.println(lcs.findLCS("abcd","aaad"));
	}
}