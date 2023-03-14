package JavaBasics;

public class ArrayDemo {

	public static void main(String[] args) {
		int i[]=new int[4];
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		 System.out.println(i[3]);
		 System.out.println(i.length);
		 
		 for(int j=0;j<i.length;j++) {
				System.out.println(i[j]);
			}
		 System.out.println("integer Array");
		 
		double d[]=new double[4];
		    d[0]=12.5;
		    d[1]=22.2;
		    d[2]=27.9;
		    d[3]=34.5;
		    System.out.println(d.length);
		    
		    char c[]=new char[3];
		    c[0]='a';
		    c[1]='b';
		    c[2]='c';
		    System.out.println(c[2]);
		    
		    String s[]=new String[2];
		    s[0]="swap";
		    s[1]="xyz";
		    System.out.println("hello"+s[1]);
		    Object obj[]=new Object[5];
		    obj[0]="abc";
		    obj[1]=2;
		    obj[2]=10.55;
		    obj[3]=2022;
		    obj[4]='y';
		    System.out.println(obj[2]);
		    System.out.println(obj.length);
		    
		    
		    
		
		
		
		
		
		

	}

}
