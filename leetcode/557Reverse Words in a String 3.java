/*
METHOD ONE(85.43% 11ms)
*/
public class Solution {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        StringBuilder tmp;
        for(String str:s.split(" ")){
            tmp=new StringBuilder(str);
            result.append(" ");
            result.append(tmp.reverse());
        }
        return result.deleteCharAt(0).toString();
    }
}
/*
METHOD TWO(95.66% 9ms)
*/
public class Solution {
    public String reverseWords(String s) {
        char[] result=s.toCharArray();
        int start=0;
        for(int i=0;i<result.length;i++){
            if(result[i]==' '){
                mReverse(result,start,i-1);
                start=i+1;
            }
        }
        mReverse(result,start,result.length-1);
        return String.valueOf(result);
    }
    public void mReverse(char[] str,int start,int end){
        while(start<end){
            char tmp=str[start];
            str[start++]=str[end];
            str[end--]=tmp;
        }
    }
}