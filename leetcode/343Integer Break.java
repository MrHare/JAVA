/*
METHOND ONE(58.36%,0ms)
*/
public class Solution {
    public int integerBreak(int n) {
        if(n<=3)return n-1;
        int count=n/3;
        switch(n%3){
            case 0:return getRet(count,1);
            case 1:return getRet(count-1,4);
            default:return getRet(count,2);
        }
    }
    public int getRet(int count,int rest){
        int ret=1;
        for(int i=0;i<count;i++){
            ret*=3;
        }
        return ret*rest;
    }
}