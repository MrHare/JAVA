/*
METHOD ONE(88.50% 2ms)
*/
public class Solution {
    public int[] countBits(int num) {
        int[] ret=new int[num+1];
        ret[0]=0;
        int flag=1;
        for(int i=1;i<=num;i++){
            if(i==2*flag){
                flag*=2;
                ret[i]=1;
                continue;
            }
            ret[i]=1+ret[i-flag];
        }
        return ret;
    }
}