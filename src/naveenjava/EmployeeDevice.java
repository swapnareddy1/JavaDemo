package naveenjava;

import java.util.Arrays;

public class EmployeeDevice {
	
	public String[] getEmployeeDevices(String empname) 
	{
	System.out.println("device details of :"+empname);
	
	if(empname.equals("swapna")) 
	{
		String devices[]= {"macbook","iphone 13","ipad"};
		return devices;
	}
	else if(empname.equals("reddy")){
		
		String devices[]= {"hp laptop","samsung galaxy","tab"};
		return devices;
	}
    else if(empname.equals("jambula")){
		
		String devices[]= {"surface","googlepixel","tab"};
		return devices;
	}
    else {
	
	System.out.println("emp not found");
	return null;
         }
	}

	public static void main(String[] args) {
		EmployeeDevice obj=new EmployeeDevice();
		String str[]=obj.getEmployeeDevices("jambula");
		System.out.println(Arrays.toString(str));

	}

}
