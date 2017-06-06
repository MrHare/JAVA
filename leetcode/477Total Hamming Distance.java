/*
METHOD ONE(61.67 26ms)
time complexity:o(32*nums.length)
space complexity:o(32)
*/
public class Solution {
    public int totalHammingDistance(int[] nums) {
        int len=nums.length;
        int ret=0;
        int[] bits=new int[32];
        for(int val:nums){
            int index=0;
            while(val!=0){
                bits[index++]+=val&1;
                val=val>>1;
            }
        }
        for(int val:bits){
            ret+=val*(len-val);
        }
        return ret;
    }
}
/*
METHOD TWO(86.43% 21 ms)
time complexity:o(n)
space complexity:o(1)
*/
public class Solution {
    public int totalHammingDistance(int[] nums) {
        int len=nums.length;
        int ret=0;
        for(int i=0;i<32;i++){
            int Nof1=0;
            for(int val:nums){
                Nof1+=(val>>i)&1;
            }
            ret+=Nof1*(len-Nof1);
        }
        return ret;
    }
}