/*
METHOD ONE(83.59%,15ms)
*/
public class Solution {
    public int maxSubArray(int[] nums) {
        int ret=nums[0];
        int tmp=0;
        for(int n:nums){
            tmp+=n;
            if(tmp>ret)ret=tmp;
            if(tmp<0)tmp=0;
        }
        return ret;
    }
}