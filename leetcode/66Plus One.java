/*
METHOD ONE(49.07% 0ms T1)
*/
public class Solution {
    public int[] plusOne(int[] digits) {
        int index=digits.length-1;
        int tmp=1;
        while(index>=0&&tmp==1){
            digits[index]+=1;
            if(digits[index]>9){
                tmp=1;
                digits[index]%=10; 
            }else{
                tmp=0;
            }
            index--;
        }
        if(index==-1&&tmp==1){
            int[] result=new int[digits.length+1];
            int k=1;
            result[0]=1;
            for(int n:digits){
                result[k++]=n;
            }
            return result;
        }else{
            return digits;
        }
        
    }
}