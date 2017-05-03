/*
METHOD ONE(48.03% 1ms)
*/
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(true){
            int sum=numbers[i]+numbers[j];
            if(sum==target)break;
            if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{i+1,j+1};
    }
}