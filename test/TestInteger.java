public class TestInteger{
	public static void main(String[] args){
		int a=10;
		Integer b=10;
		Integer c=new Integer(10);
		Integer d=new Integer(10);
		System.out.println(a==b);//true
		System.out.println(a==c);//true
		System.out.println(b==c);//false
		System.out.println(b==d);//false
		System.out.println(c==d);//false
		b=c;//object
		System.out.println(b==c);//true 
		c+=1;
		System.out.println(b);
		Integer e=127;
		Integer f=127;
		Integer g=128;
		Integer h=128;
		System.out.println(e==f);//true
		System.out.println(g==h);//false
	}
}