package JavaBasics;

public class StaticNonstaticDemo {
	String s="swapna";
	static int ab=100;

	public static void main(String[] args) {
		
	int i=100;
	
	StaticNonstaticDemo sn=new StaticNonstaticDemo();
	sn.sum();
	sum();
	System.out.println(ab);
	System.out.println(sn.s);

	}
public static void sum() {
	int a=10;
	int b=15;
	int c=a+b;
	System.out.println(c);
}
}
