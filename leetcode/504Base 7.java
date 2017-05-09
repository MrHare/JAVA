/*
METHOD ONE(69.40% 17ms)
*/
public class Solution {
    public String convertToBase7(int num) {
        if(num==0)return "0";
        StringBuilder result=new StringBuilder();
        boolean isNegative=false;
        if(num<0){
            num=-num;
            isNegative=true;
        }
        while(num>0){
            result.append(num%7);
            num/=7;
        }
        if(isNegative){
            result.append("-");
        }
        return result.reverse().toString();       
    }
}