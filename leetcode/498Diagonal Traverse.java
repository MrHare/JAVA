/*
METHOND ONE(90.35% 7ms T2)
time complexity:o(raw+col)
space complexity:o(1) +o(raw+col)->the space to store the result
*/
public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int raw=matrix.length;
        if(raw==0)return new int[0];
        int col=matrix[0].length;
        if(col==0)return new int[0];
        int[] ret=new int[raw*col];
        int index=0;
        for(int rc=0;rc<raw+col-1;rc++){
            if((rc&1)==0){
                int r=rc>=raw?raw-1:rc;
                for(;r>=0&&rc-r<col;r--){
                    ret[index++]=matrix[r][rc-r];
                }
            }else{
                int c=rc>=col?col-1:rc;
                for(;c>=0&&rc-c<raw;c--){
                    ret[index++]=matrix[rc-c][c];
                }
            }
        }
        return ret;
    }
}