/*
METHOD ONE(44.01% 0ms T1)
*/
public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1||nums[0]>nums[1])return 0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]){
                if(nums[i]>nums[i+1])return i;
            }else{
                i++;
            }
        }
        return nums.length-1;
    }
}