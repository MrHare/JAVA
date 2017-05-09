/*
METHOD ONE(44.14% 1ms T1)
*/
public class Solution {
    public int trailingZeroes(int n) {
        int ret=0;
        while(n>0){
            ret+=n/5;
            n/=5;
        }
        return ret;
    }
}