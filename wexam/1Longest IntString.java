//http://group.jobbole.com/28731/#comm-81196
import java.util.*;
//import java.lang.*;
public class Test{
	public String foo(String str){
		int start=-1;
		int length=0;
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				int j=i+1;
				while(j<str.length()){
					if(Character.isDigit(str.charAt(j))){
						j++;
					}
					break;
				}
				if(j-i>length){
							length=j-i;
							start=i;
						}
				i=j;
			}
		}
		return str.substring(start,start+length);

	}
	public static void main(String[] args){
		Test test=new Test();
		System.out.println(test.foo("abcd123325ed125ss123456789"));
		
	}
}