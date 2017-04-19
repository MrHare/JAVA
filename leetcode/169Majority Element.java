
/*
METHOD ONE(34.16% 5ms)
tips:
bit manipulation,caclute the the number of the 1 or o of the nums of every bit of int
if the number is larger than nums.length/2,the very bit of result is equal to it
generate the result from the array
*/
public class Solution {
    public int majorityElement(int[] nums) {
        int[] array=new int[32];
        int result=0;
        for(int n:nums){
           foo(array,n); 
        }
        for(int i=31;i>=0;i--){
            result=result<<1;
            if(array[i]>nums.length/2){
                result+=1;
            }
        }
        return result;
    }
    void foo(int[] array,int n){
        int i=0;
        while(n!=0){
            array[i++]+=n&1;
            n=n>>>1;
        }
    }
}
/*
METHOD TWO(18.34% 33ms)
tips:
use hashmap the record the frequency of each number of the nums
*/
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int n:nums){
            if(map.containsKey(n)){
                int tmp=map.get(n)+1;
                if(tmp>nums.length/2)return n;
                map.put(n,tmp);
                
            }else{
                map.put(n,1);
            }
        }
        return nums[0];
    }
}
/*
METHOD THREE(82.86% 2ms)
tips:
if the result==current,count++,else count--;if count==0,change the result to the current num
*/
public class Solution {
    public int majorityElement(int[] nums) {
        int result=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                result=num;
                count++;
            }else{
                if(result==num){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return result;
    }
}