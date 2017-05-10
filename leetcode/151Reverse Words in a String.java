/*
METHOND ONE(91.76% 3ms T2)
*/
public class Solution {
    public String reverseWords(String s) {
        if(s.length()==0)return s;
        String[] strArray=s.trim().split(" ");
        StringBuilder ret=new StringBuilder();
        for(int i=strArray.length-1;i>=0;i--){
            if(strArray[i].length()>0){
                ret.append(" ");
                ret.append(strArray[i]);
            }
        }
        if(ret.length()>0)ret.deleteCharAt(0);
        return ret.toString();
    }
}
//-----------
//little change
public class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        if(s.length()==0)return s;
        String[] strArray=s.split(" ");
        StringBuilder ret=new StringBuilder();
        for(int i=strArray.length-1;i>=0;i--){
            if(strArray[i].length()>0){
                ret.append(" ").append(strArray[i]);
            }
        }
        ret.deleteCharAt(0);
        return ret.toString();
    }
}
/////////////////////////////////////////////////
/*
METHOD TWO(28.01% 27ms)
*/
public class Solution {
    public String reverseWords(String s) {
        int ins=0,ine=0;
        StringBuilder ret=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                ins=i;
                ine=s.length();
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)==' '){
                        ine=j;
                        break;
                    }
                }
                ret.insert(0,s.substring(ins,ine)).insert(0," ");
                i=ine;
            }
        }
        if(ret.length()>0)ret.deleteCharAt(0);
        return ret.toString();
    }
}