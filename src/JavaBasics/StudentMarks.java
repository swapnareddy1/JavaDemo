package JavaBasics;

public class StudentMarks {
	int sub1,sub2,sub3,sub4;
	int sum;
	float avg;
	public int Student(int sub1,int sub2,int sub3,int sub4) {
		sum=sub1+sub2+sub3+sub4;
		return sum;
	}
public float Average(int sum) {
	 avg=sum/4;
	return avg;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks student1=new StudentMarks();
		StudentMarks student2=new StudentMarks();
		StudentMarks student3=new StudentMarks();
		StudentMarks student4=new StudentMarks();
		
	    int sum1=student1.Student(20,30,40,50);
		int sum2=student2.Student(15,34,28,30);
		int sum3=student3.Student(25,30,45,15);
		int sum4=student4.Student(43,32,27,28);
		
		float avg1=student1.Average(sum1);
		float avg2=student2.Average(sum2);
		float avg3=student3.Average(sum3);
		float avg4=student4.Average(sum4);
	
	System.out.println("the total marks for student1: "+sum1);
	System.out.println("the average marks of student1 :"+avg1);
	System.out.println("the average marks of student2 :"+avg2);
	System.out.println("the average marks of student3 :"+avg3);
	System.out.println("the average marks of student4 :"+avg4);

	}

}
