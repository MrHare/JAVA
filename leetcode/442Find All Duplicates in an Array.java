/*
METHOD ONE(97.93% 13ms)
time complexity o(n);
space complexity o(1);
*/
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> ret=new ArrayList<Integer>();
        if(n==0)return ret;
        for(int i=0;i<n;i++){
            nums[nums[i]%n]+=n;
        }
        if(nums[0]>2*n)ret.add(n);
        for(int i=1;i<n;i++){
            if(nums[i]>2*n){
                ret.add(i);
            }
        }
        return ret;
    }
}
        