/*
METHOD ONE(5.46% 1ms,T2)
*/
public class Solution {
    public int rob(int[] nums) {
        return foo(nums,0,nums.length-1);
    }
    public int foo(int[] nums,int start,int end){
        if(start>end)return 0;
        if(start==end)return nums[start];
        int mid=start+(end-start)/2;
        int tmp1=foo(nums,start,mid-2)+foo(nums,mid+2,end)+nums[mid];
        int tmp2=foo(nums,start,mid-1)+foo(nums,mid+1,end);
        return Integer.max(tmp1,tmp2);
    }
}