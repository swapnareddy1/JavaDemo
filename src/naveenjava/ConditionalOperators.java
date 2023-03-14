package naveenjava;

public class ConditionalOperators {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		// > >= < <= == !=
		//System.out.println(i==j);
		
		if(i==j) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		if(j>=i) {
			System.out.println("j is gr than i");
		}
		else {
			System.out.println("i is gr than j");
		}
		// nested if
		int marks=90;
		if(marks<=100) {
			System.out.println("valid marks");
			if(marks>=90) {
				System.out.println("a grade");
			}else {
				if(marks<=80) {
					System.out.println("b grade");
				}
			}
			
		}else {
			System.out.println("not a valid mark");
		}
	}

}
