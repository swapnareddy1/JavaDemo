package naveenjava;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		/*for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}*/
		for(int e:i) {
			System.out.println(e);
		}
		
    System.out.println(Arrays.toString(i));
    
    String str[]=new String[4];
    str[0]="hi";
    str[1]="swapna";
    str[2]="welcome";
    str[3]="java";
    
    System.out.println(Arrays.toString(str));
    
    for(String e:str)
    	
    {
    	System.out.println(e);
    }
    
    char c[]= {'a','b','c','d','e'};
    int n=c.length;
    System.out.println("length of char array is: "+n);
	}

}
