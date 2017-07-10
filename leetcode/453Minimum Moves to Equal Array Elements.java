/*
METHOND ONE(18.02% 35ms)
time complexity:o(Arrays.sort(n)+n)
space complexity:o(1)
*/
public class Solution {
    public int minMoves(int[] nums) {
        int ret=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            ret+=nums[i]-nums[0];
        }
        return ret;
    }
}
//-------
/*
METHOD TWO(10ms 97.87%)
time complexity:o(n)
space complexity:o(1)
*/
public class Solution {
    public int minMoves(int[] nums) {
        int ret=0;
        int min=nums[0];
        for(int i:nums){
            ret+=i;
            min=i<min?i:min;
        }
        return ret-min*nums.length;
    }
}