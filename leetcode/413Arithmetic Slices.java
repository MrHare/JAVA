/*
METHOD ONE(35.71% 2ms T1)
*/
public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int ret = 0;
        int len = 2;
        for (int i = 1; i < A.length - 1; i ++){           
            if (A[i] - A[i - 1] == A[i + 1] - A[i]){
                len ++;
            }else{
                ret += (len - 1) * (len - 2) / 2;
                len = 2;
            }
        }
        ret += (len - 1) * (len - 2) / 2;
        return ret;
    }      
}