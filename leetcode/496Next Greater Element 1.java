/*
//EMTHOD ONE(11.0% 25ms)
tips:
result[] record the index of findNums in nums
find the next greater num from the index+1 till the end of the nums
*/

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result=new int[findNums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<findNums.length;j++){
                if(nums[i]==findNums[j]){
                    result[j]=i;
                    break;
                }
            }
        }
        for(int i=0;i<result.length;i++){
            int j=result[i]+1;
            for(;j<nums.length;j++){
                if(nums[j]>findNums[i]){
                    result[i]=nums[j];
                    break;
                }
            }
            if(j==nums.length)result[i]=-1;
        }
        return result;
    }
}