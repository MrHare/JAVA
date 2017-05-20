/*
METHOD ONE(47.71% 6ms T2)
tips:

*/
public class Solution {
    public int findNthDigit(int n) {
        int n0=1;
        int index=1;
        int count=index*9*n0;
        while(n>count){
            n-=count;
            index++;
            n0*=10;
            count=index*9*n0;
            if(count<0)break;
        }
        int rest=(n-1)%index;
        int ith=(n-1)/index;
        int ret=n0+ith;
        char[] chArray=(""+ret).toCharArray();
        return chArray[rest]-'0';
    }
}