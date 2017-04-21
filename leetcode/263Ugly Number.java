/*
METHOD ONE(30.51% 2ms)
*/
public class Solution {
    public boolean isUgly(int num) {
        if(num>1){
            if(num%5==0){
                return isUgly(num/5);
            }else if(num%3==0){
                return isUgly(num/3);
            }else if(num%2==0){
                return isUgly(num/2);
            }else{
                return false;
            }
        }else{
            if(num==1)return true;
            return false;
        }
    }
}
/*
METHOD TWO(30.51% 2ms)
*/
public class Solution {
    public boolean isUgly(int num) {
        if(num<1)return false;
        while(num%2==0)num=num>>1;
        while(num%3==0)num/=3;
        while(num%5==0)num/=5;
        return num==1;
    }
}