package JavaBasics;

public class WrapperDemo {

	public static void main(String[] args) {
		String s="100";
		
		System.out.println("conversion from string to other datatypes");
		int i=Integer.parseInt(s);
		System.out.println(i+50);
		
		double d=Double.parseDouble(s);
		System.out.println(d+10);
		
		boolean b=Boolean.parseBoolean(s);
		System.out.println(b);
		
		System.out.println("conversion from integer to string");
		
		int x=30;
		String s1=String.valueOf(30);
		System.out.println(s1+20);

	}

}
