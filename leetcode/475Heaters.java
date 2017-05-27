/*
METHOD ONE(69.43% 24ms)
time complexity(o(houses.length+heaters.length)+o(Arrays.sort))
space complexity(o(1))
*/
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        if(houses.length==0||heaters.length==0)return 0;
        if(houses[0]>=heaters[heaters.length-1])return houses[houses.length-1]-heaters[heaters.length-1];
        if(houses[houses.length-1]<=heaters[0])return heaters[0]-houses[0];
        int ret=0;
        int i=0;
        int index=1;
        if(houses[0]<heaters[0]){
            ret=heaters[0]-houses[0];
            while(houses[++i]<heaters[0]);
        }
        while(i<houses.length&&index<heaters.length){
            if(houses[i]>heaters[index]){
                index++;
            }else{
                int tmp=Integer.min(houses[i]-heaters[index-1],heaters[index]-houses[i]);
                ret=Integer.max(ret,tmp);
                i++;
            }
        }
        if(index==heaters.length){
            ret=Integer.max(ret,houses[houses.length-1]-heaters[index-1]);
        }
        return ret;
    }
}
////////////////////////////
/*
METHOD TWO()
*/
