/*
METHOD(12.61% 0ms)
*/
public class Solution {
    public int numTrees(int n) {
        int[] count = new int[n+1];
        if(n <= 1)return 1;
        count[0] = 1;
        count[1] = 1;
        count[2] = 2;
        for(int j = 3;j <= n; j ++){
            for(int i = 0; i < j ;i ++){
                count[j] += count[i]*count[j - i - 1];
            }
        }
        return count[n];
    }
}