import java.util.*;
public class LRU{
	public int useLRU(int num,int[] sequence){
		int count=0;
		int time=1;
		int[][] current=new int[2][num];
		for(int n:sequence){
			int flag=0;
			for(int i=0;i<num;i++){
				if(current[0][i]==n){
					current[1][i]=time;
					time++;
					flag=1;
					break;
				}
			}
			if(flag==0){
				int index=0;
				for(int k=0;k<num;k++){
					if(current[1][index]>=current[1][k]){
						index=k;
					}
				}					
				current[0][index]=n;
				count++;
				current[1][index]=time;
				time++;
			}								
			System.out.println(Arrays.toString(current[0]));
			System.out.println(Arrays.toString(current[1]));
			System.out.println("------------------");
		}
		return count;
	}
	public static void main(String[] args){
		LRU lru=new LRU();
		int[] sequence={1,2,5,3,4,6,1,4,3,6,7,8,3,9};
		System.out.println(lru.useLRU(5,sequence));
	}
}