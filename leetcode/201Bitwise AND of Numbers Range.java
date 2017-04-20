/*
METHOD ONE(73.84% 8ms T2)
*/
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int dis=n-m;
        int i=0;
        for(;dis!=0;i++){
            dis=dis>>>1;
        }
        return m&n&(-1<<i);
    }
}