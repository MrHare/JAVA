/*
METHOD ONE(65.19% 188ms)
*/
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result=0;
        int pairCount=points.length;
        for(int i=0;i<pairCount;i++){
            HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int j=0;j<pairCount;j++){
                int distance=dis(points[i][0],points[i][1],points[j][0],points[j][1]);
                if(map.containsKey(distance)){
                    int tmp=map.get(distance);
                    result+=tmp;
                    map.put(distance,tmp+1);
                }else{
                    map.put(distance,1);
                }
            }
        } 
        return result*2;
    }
    public int dis(int x1,int y1,int x2,int y2){
        int disx=x1-x2;
        int disy=y1-y2;
        return disx*disx+disy*disy;
    }
}