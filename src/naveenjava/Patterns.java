package naveenjava;

public class Patterns {

	public static void main(String[] args) {
		
		int i=0;
		while(i<=100) 
		{
			if(i%5==0) {
				System.out.println(i);
			}
			i++;
		} 
		for(char ch='a';ch<='z';ch++) 
		{
			System.out.println((int)ch);
		}
		System.out.println("----------------------");
		for(char ch1='A';ch1<='Z';ch1++) 
		{
			System.out.println((int)ch1);
		}
		System.out.println("------------------------");
		for(char ch2='0';ch2<='9';ch2++) 
		{
			System.out.println((int)ch2);
		}
		
		float f=1.0f;
		while(f<=10.0)
		{
			System.out.println(f);
			f++;
		}
		for(int a=0;a<=5;a++) {
			for(int b=0;b<=5;b++) {
				for(int c=0;c<=5;c++) {
					System.out.print(a+""+b+c+" ");
				}
				System.out.println();
			}
			//System.out.println();
		}
	}

}
