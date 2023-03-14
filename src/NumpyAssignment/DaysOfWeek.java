package NumpyAssignment;

import java.util.Scanner;

public class DaysOfWeek {
	public void dayofweek(int day) {
		switch(day) {
		case 1:
		{
			System.out.println("its sunday");
			break;
		}
		case 2:{
			System.out.println("its monday");
			break;
			
		}
		case 3:
		{
			System.out.println("its tuesday");
			break;
		}
		case 4:
		{
			System.out.println("its wednesday");
			break;
		}
		case 5:
		{
			System.out.println("its thursday");
			break;
		}
		case 6:
		{
			System.out.println("its friday");
			break;
		}
		case 7:
		{
			System.out.println("its saturday");
			break;
		}
		}
	}

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("enter the number to find day :");
		int day=num.nextInt();
		DaysOfWeek obj=new DaysOfWeek();
		obj.dayofweek(day);
		
		
		
	}

}
