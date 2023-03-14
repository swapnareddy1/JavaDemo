package JavaBasics;

public class TwoDimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x[][]=new String[3][4];
		System.out.println(x.length);
		System.out.println(x[0].length);

		x[0][0]="a";
		x[0][1]="b";
		x[0][2]="c";
		x[0][3]="d";
		
		x[1][0]="1";
		x[1][1]="2";
		x[1][2]="3";
		x[1][3]="4";
				
		x[2][0]="x";
		x[2][1]="y";
		x[2][2]="z";
		x[2][3]="w";
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		
		
	}

}

