package NumpyAssignment;

import java.util.Scanner;

public class fibonaciDemo {
	int num1=0;
	int num2=1;
	int sum;
	

	public void fibonaciSeries(int number) {
		
		 System.out.print(num1+" ");
		

	for(int i=2;i<=number;i++) {
		num1=num2;
		num2=sum;
		sum=num1+num2;
		
		System.out.print(" "+sum);
	}
	}
	 
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		//int number=num.nextInt();
		System.out.println("enter the number to find fibinacci series : ");
		int number=num.nextInt();
		fibonaciDemo obj=new fibonaciDemo();
		obj.fibonaciSeries(number);

	}

}
