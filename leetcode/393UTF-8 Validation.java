/*
METHOND ONE(31.76 9ms)
*/
public class Solution {
    public boolean validUtf8(int[] data) {
        for(int i=0;i<data.length;i++){
            int len=getLen(data[i]);
            if(len==0)continue;
            if(len==1||len+i>data.length||len>4)return false;
            for(int j=1;j<len;j++){
                if(getLen(data[i+j])!=1)return false;
            }
            i+=len-1;
        }
        return true;
    }
    public int getLen(int val){
        int ret=0;
        int num=0x80;
        while((num&val)!=0){
            ret++;
            num=num>>>1;
        }
        return ret;
    }
}
/////
/*
METHOND ONE(80.24% 7ms)
little change based on METHOND ONE
check the '10' without getLen
*/
public class Solution {
    public boolean validUtf8(int[] data) {
        for(int i=0;i<data.length;i++){
            int len=getLen(data[i]);
            if(len==0)continue;
            if(len==1||len+i>data.length||len>4)return false;
            for(int j=1;j<len;j++){
                if((data[i+j]&0xC0)!=0x80)return false;
            }
            i+=len-1;
        }
        return true;
    }
    public int getLen(int val){
        int ret=0;
        int num=0x80;
        while((num&val)!=0){
            ret++;
            num=num>>>1;
        }
        return ret;
    }
}