package JavaBasics;

public class FunctionsDemo {

	public static void main(String[] args) {
		
		FunctionsDemo fd=new FunctionsDemo();
		fd.test();
		int x=fd.addition();
		System.out.println(x);
		String s=fd.Name();
		System.out.println(s);
		int y=fd.division(20,4);
		System.out.println(y);

	}
	
	public void test() {
		System.out.println("you are in test method");
	}

	public int addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("you are in addition method");
		return c;
		
}
	public String Name() {
		String s1="hello";
		String s2="swapna";
		String s3=s1+s2;
		
		return s3;
		
	}
	public int division(int x,int y) {
		
		int z=x/y;
		System.out.println("you are in division method");
		return z;
	}
	}
