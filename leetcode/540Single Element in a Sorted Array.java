/*
METHOD ONE(40.13% 1sm T1)
*/
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result=nums[0];
        int i=0;
        while(i+2<nums.length){
            if(result==nums[i+1]){
                i+=2;
                result=nums[i];
            }else{
                break;
            }
        }
        return result;
    }
}
/*
little change based on METHOD ONE
METHOD 1.1(40.13% 1ms)
*/
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result=nums[0];
        int i=0;
        while(i+2<nums.length&&result==nums[i+1]){
            i+=2;
            result=nums[i];
        }
        return result;
    }
}