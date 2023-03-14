package naveenjava;

public class StudentMarks {
	
	public int getStudentMarks(String studentname) {
		System.out.println("student marks for "+studentname);
		int marks=0;
		switch(studentname) {
		
		case "swapna":
			marks=100;
			break;
			
		case "reddy":
			marks=90;
			break;
			
		case "sudeep":
			marks=10;
			break;
			
		default:
			System.out.println("student not found");
			break;
		}
		return marks;
		
	}

	public static void main(String[] args) {
		
    StudentMarks obj=new StudentMarks();
    int n=obj.getStudentMarks("jambula");
    System.out.println(n);
    
    if(obj.launchBrowser("edge")) 
    {
    	System.out.println("enter the url");
    	
    }
    else 
    {
    	System.out.println("no need to enter url");
    }

	}
	public boolean launchBrowser(String browsername) 
	{
		System.out.println("launching the browser:"+browsername);
		boolean flag=true;
		
		if(browsername.equals("chrome")) 
		{
			System.out.println("chrome browser is launched");
			
			
		}
		else if(browsername.equals("safari"))
		{
			System.out.println("safari browser is launched");
			//return flag;
		}
		else if(browsername.equals("firefox"))
		{
			System.out.println("firefox browser is launched");
			//return flag;
		}
		else
		{
			System.out.println(" browser not found");
			flag=false;
		}
		return flag;
	}

}
