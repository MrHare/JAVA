/*
METHOD ONE(6.65% 31ms)
tips:bfs
*/
public class Solution {
    public int findCircleNum(int[][] M) {
        int ret = 0;
        int index = 0;
        List<Integer> list = new ArrayList<Integer>();
        int student =0;
        for(int i = 0; i < M.length; i ++){
            if(!list.contains(i)){
                list.add(i);
                ret ++;
                while(index < list.size()){
                    int tmp = list.get(index);
                    for(int j = 0;j < M.length;j ++){       
                        if(M[tmp][j] == 1 && (!list.contains(j))){
                            list.add(j);
                        }
                    }
                    index ++;
                }
            }   
        }
        return ret;        
    }
}
/*
METHOD TWO(98.91% 9ms)
tips:dfs
*/
public class Solution {
    public int findCircleNum(int[][] M) {
        int[] mark = new int[M.length];
        int ret = 0;
        for(int i = 0; i < M.length; i ++){
            if(mark[i] == 0){
                ret ++;
                dfs(mark, M, i);
            }
        }
        return ret;
    }
    public void dfs(int[] mark,int[][] M,int i){
        for(int j = 0; j < M.length; j ++){
            if(M[i][j] == 1 && mark[j] == 0){
                mark[j] =1;
                dfs(mark, M, j);
            }
        }
    }
}