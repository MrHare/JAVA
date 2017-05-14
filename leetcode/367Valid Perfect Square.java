/*
METHOND ONE(41.75% 0ms)
*/
public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0)return false;
        int ret=1;
        do{
            ret=(ret+num/ret)/2;
        }while(ret>num/ret);
        if(ret*ret==num)return true;
        return false;
    }
}