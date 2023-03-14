package naveenjava;

public class LoopConcept {

	public static void main(String[] args) {
	/*	int i=10;
		//System.out.println(i);
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		for(int j=1;j<=5;j++) {
			System.out.println("i am a batman"+" "+j);
			
		}*/
		//even numbers
		System.out.println("even numbers");
		for(int k=1;k<=100;k++) {
			if(k%2==0)
			{
				System.out.println(k);
			}
			
		}
		//odd numbers
		System.out.println("odd numbers");
		int n=1;
		while(n<=100) 
		{
			if(n%2==1) {
				System.out.println(n);
			}
			n++;
		}

	}

}
