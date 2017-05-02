/*
METHOD ONE(39.01% 9ms)
*/
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int r1=nums.length;
        int c1=nums[0].length;
        if(r1*c1!=r*c)return nums;
        int[][] result=new int[r][c];
        int m=0;
        int n=0;
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
            result[m][n++]=nums[i][j];
            m+=n/c;
            n%=c;
            }
        }
        return result;
    }
}
////
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int r1=nums.length;
        int c1=nums[0].length;
        if(r1*c1!=r*c)return nums;
        int[][] result=new int[r][c];
        int k=0;
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                result[k/c][k%c]=nums[i][j];
                k++;
            }
        }
        return result;
    }
}