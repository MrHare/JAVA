/*
METHOD ONE(45.65% 257ms)
*/
public class Solution {
    int ret = 0;
    public int findTargetSumWays(int[] nums, int S) {
        foo(nums,0,S);
        return ret;
    }
    public void foo(int[] nums,int left,int S){
        if(left == nums.length - 1){
            if(nums[left] == S )ret ++;
            if(nums[left] + S == 0)ret ++;
        }else{
            foo(nums,left + 1,S - nums[left]);
            foo(nums,left + 1,S + nums[left]);
        }           
    }
}
/*
METHOD TWO()
*/
