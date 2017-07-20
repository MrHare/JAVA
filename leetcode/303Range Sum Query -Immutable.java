/*
METHOD ONE(34.74% 250ms)
*/
public class NumArray {
    int[] nums;
    int[] sum;
    public NumArray(int[] nums) {
        this.nums = nums;
        sum = new int[nums.length + 1];
        sum[0] = 0;
        for(int i = 0; i < nums.length; i ++){
            sum[i + 1] = sum[i] + nums[i];
        }
    }  
    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
/////////////////
/*
METHOD TWO(66.89% 222ms)
litte change base on method one
*/
public class NumArray {
    int[] nums;
    int[] sum;
    int index = 0;
    public NumArray(int[] nums) {
        this.nums = nums;
        sum = new int[nums.length + 1];
        sum[0] = 0;
    }  
    public int sumRange(int i, int j) {
        if(j + 1 > index){
            setSum(j + 1);
        }
        return sum[j + 1] - sum[i];
    }
    public void setSum(int val){
        for(int i = index ;i < val; i ++){
            sum[i + 1] = sum[i] + nums[i];
        }
        index = val;
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */