/*
METHOND ONE(87.43% 1ms)
time complexity o(n);
space complexity o(1);
*/
public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ret=new int[2];
        int tmp=0;
        for(int n:nums){
            tmp^=n;
        }
        /*int index=0;
        while((tmp&1)==0){
            tmp=tmp>>1;
            index++;
        }
        tmp=1<<index;*/         //could change as tmp&=-tmp;
        tmp&=-tmp;             //!!!
        for(int n:nums){
            if((n&tmp)==0){
                ret[0]^=n;
            }else{
                ret[1]^=n;
            }
        }
        return ret;
    }
}