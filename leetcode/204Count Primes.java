/*
METHOD ONE(3.09% 328ms)
*/
public class Solution {
    public int countPrimes(int n) {
        int ret=0;
        int[] array=new int[n];
         for(int i=0;i<n;i++){
            array[i]=1;
        }
        for(int i=2;i<n;i++){
            for(int j=2;i*j<n;j++){
                array[i*j]=0;
            }
        }
        for(int i=2;i<n;i++){
            ret+=array[i];
         }
         return ret;
    }
}
//--------------------------------------
//METHOD 1.1(13.23% 104ms)
public class Solution {
    public int countPrimes(int n) {
        int ret=n-2;
        int[] array=new int[n];
         for(int i=0;i<n;i++){
            array[i]=1;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            for(int j=2;i*j<n;j++){
                if(array[i*j]==1){
                    ret--;
                    array[i*j]=0;
                }
            }
        }
        return ret>0?ret:0;
    }
}

