/*
METHOD ONE(72.94% 338ms)
*/
public class Solution {
    int[] num;
    Random random;
    public Solution(int[] nums) {
       num=nums; 
       random=new Random();
    }
    
    public int pick(int target) {
        int ret=0;
        int j=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==target&&random.nextInt(1+j++)==0){
                ret=i;
            }
        }
        return ret;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */