package JavaBasics;

public class CallbyvalCallbyref {
	int p;
	int q;

	public static void main(String[] args) {
		
		CallbyvalCallbyref obj=new CallbyvalCallbyref();
		
		int y=obj.mult(12,15);
		System.out.println(y);
		
		obj.p=20;
		obj.q=30;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
 public int mult(int a,int b) {
	 int c=a*b;
	 return c;
	 
 }
 public void swap(CallbyvalCallbyref t) {
	 int temp=p;
	 p=q;
	 q=temp;
	 
 }
}
