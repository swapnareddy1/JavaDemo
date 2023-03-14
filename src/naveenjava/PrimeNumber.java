package naveenjava;

public class PrimeNumber {
	public void primeRNot(int n) 
	{

		int count=0;
		for(int i=1;i<=n;i++) 
		{
			//int count=0;
			if(n%i==0) {
			count++;	
			}
		
		}
		if(count==2)
		{
		System.out.println(n+" is prime");	
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}

	public static void main(String[] args) {
		PrimeNumber obj=new PrimeNumber();
		obj.primeRNot(131);
		

	}

}
