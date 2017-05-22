/*
METHOND ONE(96.02% 5ms)
*/
public class Solution {
    public String complexNumberMultiply(String a, String b) {
        int[] aa=getN(a.toCharArray());
        int[] bb=getN(b.toCharArray());
        int Re=aa[0]*bb[0]-aa[1]*bb[1];
        int Im=aa[0]*bb[1]+aa[1]*bb[0];
        return ""+Re+"+"+Im+"i";
    }
    public int[] getN(char[] str){
        int[] ret=new int[2];
        ret[0]=ret[1]=0;
        int flag=1;
        int index=0;
        if(str[index]=='-'){
            flag=-1;
            index++;
        }
        for(;str[index]!='+';index++){
            ret[0]=ret[0]*10+str[index]-'0';
        }
        ret[0]*=flag;
        index++;
        flag=1;
        if(str[index]=='-'){
            flag=-1;
            index++;
        }
        for(;str[index]!='i';index++){
            ret[1]=ret[1]*10+str[index]-'0';
        }
        ret[1]*=flag;
        return ret;
    }
}