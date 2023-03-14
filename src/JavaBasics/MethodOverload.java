package JavaBasics;

public class MethodOverload {

	public static void main(String[] args) {
		MethodOverload md=new MethodOverload();
		md.sum();
		md.sum(15);
		md.sum("hello","method");

	}
public void sum() {
	int a=15;
	int b=45;
	int c=a+b;
	System.out.println(c);
}
public void sum(int i) {
	int c=4*i;
	System.out.println(c);
}
public void sum(String s1,String s2) {
	//s1="hello";
	//s2="method overload";
	String s3=s1+s2;
	System.out.println(s3);
	
}
}
