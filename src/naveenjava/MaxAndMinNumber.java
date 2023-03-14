package naveenjava;

public class MaxAndMinNumber {
    
	public void maxMin(int a,int b,int c)
	{
		System.out.println("the numbers are :"+a+" "+b+" "+c);
		if(a>b&&a>c) {
			System.out.println(a +"is the greater number");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b +"is the greatest number");
		}
		else
		{
		System.out.println(c +"is the greatest number");	
		}
	}
	public static void main(String[] args) {
		MaxAndMinNumber obj=new MaxAndMinNumber();
		obj.maxMin(24, 125, 769);
		
	}

}
