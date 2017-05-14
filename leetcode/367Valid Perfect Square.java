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
//////////////////////
/*
little change based on METHOD ONE
*/
public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;// when num=1,ret=0,then num/0,so ..
        int ret=num/2;
        while(ret>num/ret){
            ret=(ret+num/ret)/2;
        };
        return ret*ret==num;
    }
}
///////////////////////
/*
METHOND TWo(12.53% 2ms)
tips:
1=1
4=1+3
8=1+3+5
16=1+3+5+7..
*/
public class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=1;num>0;i+=2){
            num-=i;
        }
        return num==0;
    }
}