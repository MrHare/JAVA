/*
METHOND ONE(84.05% 39ms)
tips:
revise the original array
space complexity:o(1)
time complexity:max o(2n)->o(n)
*/
public class Solution {
    public int arrayNesting(int[] nums) {
        int ret=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                int count=1;
                int index=nums[i];
                nums[i]=-1;
                while(nums[index]!=-1){
                    count++;
                    int tmp=nums[index];
                    nums[index]=-1;
                    index=tmp;
                }
                if(count>ret)ret=count;
            }
        }
        return ret;
    }
}