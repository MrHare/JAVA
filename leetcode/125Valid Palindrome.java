/*
METHOD ONE(94.65% 6ms)
*/
public class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        int length=s.length();
        if(length==0)return true;
        int start=-1;
        int end=length;
        char sChar='0';
        char eChar='0';
        boolean sValid=false;
        boolean eValid=false;
        while(start<end){
            if(!sValid){
                start++;
                sChar=s.charAt(start);
                sValid=isValid(sChar);
            }
            if(!eValid){
                end--;
                eChar=s.charAt(end);
                eValid=isValid(eChar);
            }
            if(sValid&&eValid){
                if(sChar!=eChar&&Character.toLowerCase(sChar)!=Character.toLowerCase(eChar)){
                    return false;
                }else{
                    sValid=false;
                    eValid=false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char ch){
        return ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9';
    }
}