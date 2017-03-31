/*
METHOD ONE(40.67% 12ms)
*/
public class Solution {
    public int strStr(String haystack, String needle) {
        int nLen=needle.length();
        int hLen=haystack.length();
        if(nLen==0)return 0;
        if(nLen>hLen)return -1;
        for(int i=0;i<hLen;i++){
            int j=0;
            for(;j<nLen;j++){
                if(i+j==hLen)return -1;
                if(needle.charAt(j)!=haystack.charAt(i+j))break;
            }
            if(j==nLen)return i;
        }
        return -1;
    }
}
//METHOD TWO --KMP
//METHOD THREE --Boyer-Moore