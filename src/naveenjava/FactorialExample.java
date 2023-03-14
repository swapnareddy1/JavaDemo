package naveenjava;

public class FactorialExample {
	int fact=1;
	public void factorial(int i) 
	{
		//System.out.println("the factorial of number "+i+"is");
		for(int j=i;j>=1;j--) 
		{
			//int fact=1;
			fact=fact*j;
			
			
		}
		System.out.println("the factorial of number "+i+" is :"+fact);
	}

	public static void main(String[] args) {
		
		FactorialExample obj=new FactorialExample();
		obj.factorial(5);
		
	}

}
