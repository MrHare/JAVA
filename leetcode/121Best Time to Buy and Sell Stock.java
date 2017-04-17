/*
//METHOD ONE(50.61% 2ms T2)
*/
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int low=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<low){
                low=prices[i];
            }else{
                int tmp=prices[i]-low;
                max=tmp>max?tmp:max;
            }
        }
        return max;
    }
}

