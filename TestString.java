//Feb.7th.2017
//operat String
import java.util.*;
public class TestString{
	public static void main(String[] args){
		String str1="123Abc";
		String str2="1234abcdefg1234";
		String str3="Abc123%D";
		String str4="    1,  .   , 34   ";
		//length;
		//public int length()
		System.out.println("----length---------------------------");
		System.out.println(str1.length());
		System.out.println(str2.length());
		//trim
		//public String trim();
		System.out.println("----trim-----------------------------");
		System.out.println(str4.trim());
		//upperCase&lowerCase
		//public String toLowerCase()
		//public String toUpperCase()
		System.out.println("----upperCase&lowerCase--------------------");	
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		//index
		//public char charAt(int index)
		//public int indexOf(int ch)
		//public int indexOf(int ch,int fromIndex)
		//public int lastIndexOf(int ch)
		//public int lastIndexOf(int ch,int fromIndex)
		System.out.println("----index-----------------------------");
		System.out.println(str1.charAt(0));
		System.out.println(str2.indexOf(49));
		System.out.println(str2.indexOf(10));

		System.out.println(str2.indexOf('2'));
		System.out.println(str2.indexOf('2',4));
		System.out.println(str2.lastIndexOf('2'));		
		System.out.println(str2.lastIndexOf('2',4));
		
		//substring
		//public String substring(int beginIndex)
		//public String substring(int beginIndex, int endIndex)
		System.out.println("----substring----------------------------");
		System.out.println(str2.substring(2));
		System.out.println(str2.substring(2,5));
		//findSubString
		//public int indexOf(String str)
		//public int indexOf(String str, int fromIndex)
		//public int lastIndexOf(String str)
		//public int lastIndexOf(String str, int fromIndex)
		System.out.println("----findSubString-----------------------");
		System.out.println(str2.indexOf("234"));
		System.out.println(str2.indexOf("234",2));
		System.out.println(str2.indexOf("--123"));
		System.out.println(str2.lastIndexOf("234"));
		System.out.println(str2.lastIndexOf("234",5));
		//prefix&suffix
		//public boolean startsWith(String prefix)
		//public boolean startsWith(String prefix,int toffset)
		//public boolean endsWith(String prefix)
		System.out.println("----prefix&suffix-----------------------");
		System.out.println(str2.startsWith("123"));
		System.out.println(str2.startsWith("234"));
		System.out.println(str2.startsWith("234",1));
		System.out.println(str2.endsWith("4"));
		//replace
		//public String replace(char oldChar,char new newChar)
		//public String replaceFirst(String regex,String replacement)
		//public String replaceAll(String regex,String replacement)
		System.out.println("----replace----------------------------");
		System.out.println(str2.replace('1','a'));
		System.out.println(str2.replace('9','a'));
		System.out.println(str2.replaceFirst("23","zzzz"));
		System.out.println(str2.replaceAll("23","zzzz"));
		//compare
		//public boolean equals(Object anObject)
		//public boolean equalsIgnoreCase(String anotherString)
		System.out.println("----equal-----------------------------");
		System.out.println(str1.equals("123Abc"));
		System.out.println(str1.equals("123ABC"));
		System.out.println(str1.equalsIgnoreCase("123ABC"));

		//toCharArray
		//public char[] toCharArray(String str)
		System.out.println("----toCharArray--------------------------");
		char[] c=str2.toCharArray();
		for(char ch:c)
		System.out.println(ch);
		//toBuffer 





	}
}