/*
METHOD ONE(74.63% 5ms T2)
*/
public class Solution {
    public int lengthOfLastWord(String s) {
		s=s.trim();
    	int length=s.length();
    	if(length==0)return 0;
    	int i=1;	
   		while(length>=i&&s.charAt(length-i)!=' ')i++; 		
   		return i-1;
    }
}
/*
----------------------------------------------------------------
METHOD TWO(74.63% 5ms t2)
*/
public class Solution{
	public int lengthOfLastWord(String s){
		s=s.trim();
		return s.length()-s.lastIndexOf(' ')-1;
	}
}