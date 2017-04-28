/*
METHOD ONE(44.56% 9ms)
*/
public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result=new StringBuilder();
        StringBuilder tmp;
        int start=0;
        int end=0;
        boolean odd=true;
        while(end!=s.length()){
            end=(end+k)>s.length()?s.length():end+k;
            if(odd){
                tmp=new StringBuilder(s.substring(start,end));
                result.append(tmp.reverse());
            }else{
                result.append(s.substring(start,end));
            }
            odd=!odd;
            start+=k;
        }
        return result.toString();
        
    }
}
//------------------------------------------
/*
METHOD TWO(89.81% 6ms)
*/
public class Solution {
    public String reverseStr(String s, int k) {
        if(k<=1)return s;
        char[] str=s.toCharArray();
        int length=str.length;
        for(int i=0;i*k<length;i++){
            if((i&1)==0){
                if((i+1)*k>length){
                    reverse(str,i*k,length-1);
                }else{
                    reverse(str,i*k,i*k+k-1);
                }
            }
        }
        return String.valueOf(str);
    }
    public void reverse(char[] str,int begin,int end){
        while(begin<end){
            char ch=str[begin];
            str[begin++]=str[end];
            str[end--]=ch;
        }
    }
}
//----------------------------------------------
/*
METHOD TREE(89.81% 6ms)
*/
public class Solution {
    public String reverseStr(String s, int k) {
        if(k<=1)return s;
        char[] str=s.toCharArray();
        int i=0;
        while(i<str.length){
            int j=Math.min(str.length-1,i+k-1);
            reverse(str,i,j);
            i+=2*k;
        }
        return String.valueOf(str);
    }
    public void reverse(char[] str,int begin,int end){
        while(begin<end){
            char ch=str[begin];
            str[begin++]=str[end];
            str[end--]=ch;
        }
    }
}