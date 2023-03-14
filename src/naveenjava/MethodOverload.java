package naveenjava;

public class MethodOverload {
	public void test() 
	{
		System.out.println("in 0 parameters method");
	}
	public void test(int i) 
	{
		System.out.println("in 1 parameter method");
	}
	public void test(String i) 
	{
		System.out.println("in 1 parameter method");
	}

	public static void main(String[] args) {
		MethodOverload obj=new MethodOverload();
		obj.test();
		obj.test(20);
		obj.test("java");
		

	}

}
