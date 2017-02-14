import java.util.*;
public class KMP{
	public String getStr(int n){
		String base="0123456789";
		String str="";
		Random random=new Random();
		for(int i=0;i<n;i++){
			str=str+base.charAt(random.nextInt(10));
		}
		return str;
	}
	public int[] getNext(String pattern){
		int[] next=new int[pattern.length()];
		next[0]=-1;
		for(int i=1;i<pattern.length();i++){
			int index=next[i-1];
			while(index>=0&&pattern.charAt(i)!=pattern.charAt(index+1)){
					index=next[index];
				
			}
			if(pattern.charAt(0)==pattern.charAt(i)){
				next[i]=0;
			}else{
				next[i]=-1;
			}		
		}
		return next;
	}
	public int useKMP(String target,String pattern){
		int[] next=getNext(pattern);
		int targetIndex=0;
		int patternIndex=0;

		while(targetIndex<target.length()&&patternIndex<pattern.length()){
			if(target.charAt(targetIndex)==pattern.charAt(patternIndex)){
				targetIndex++;
				patternIndex++;
			}else{
				if(patternIndex==0){
					targetIndex++;
				}else{
					patternIndex=next[patternIndex-1]+1;
				}
			}
		}
		if(patternIndex==pattern.length())return targetIndex-patternIndex;
		return -1;
	}
	public int useCommon(String target,String pattern){
		int targetIndex=0;
		int patternIndex=0;
		while(targetIndex<target.length()&&patternIndex<pattern.length()){
			if(target.charAt(targetIndex)==pattern.charAt(patternIndex)){
				targetIndex++;
				patternIndex++;
			}else{
				targetIndex=targetIndex-patternIndex+1;
				patternIndex=0;
			}
		}
		if(patternIndex==pattern.length())return targetIndex-patternIndex;
		return -1;
	}
	public static void main(String[] args){
		String target="123341234";
		String pattern="1234";
		KMP kmp=new KMP();
		for(int i=0;i<100;i++){
			target=kmp.getStr(10000);
			pattern=kmp.getStr(6);
			System.out.println(kmp.useCommon(target,pattern));
			System.out.println(kmp.useKMP(target,pattern));
		}
	}
}