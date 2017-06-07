/*
METHOD ONE(73.63% 9ms)
time complexity:o(n)
space complexity:o(1)
*/
public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0||duration==0)return 0;
        int ret=0;
        for(int i=0;i<timeSeries.length-1;i++){
            ret+=Integer.min(timeSeries[i+1]-timeSeries[i],duration);
        }
        ret+=duration;
        return ret;
    }
}

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0||duration==0)return 0;
        int ret=0;
        for(int i=0;i<timeSeries.length-1;i++){
            int tmp=timeSeries[i+1]-timeSeries[i];
            ret+=tmp<duration?tmp:duration;          //more quicker
        }
        ret+=duration;
        return ret;
    }
}