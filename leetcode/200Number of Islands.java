/*
METHOD ONE(63.30% 3ms T2)
Tips:
if the grid[i][j]=='1',paint it into '2',and paint its neighbors whose value is '1' recursively.
*/
public class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0||grid[0].length==0)return 0;
        int result=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    result++;
                    paint(grid,i,j);
                }
            }
        }
        return result;
    }
    public void paint(char[][] grid,int i,int j){
        grid[i][j]='2';
        if(i+1<grid.length&&grid[i+1][j]=='1')paint(grid,i+1,j);
        if(i-1>=0&&grid[i-1][j]=='1')paint(grid,i-1,j);
        if(j+1<grid[0].length&&grid[i][j+1]=='1')paint(grid,i,j+1);
        if(j-1>=0&&grid[i][j-1]=='1')paint(grid,i,j-1);
    }
}