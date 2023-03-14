package NumpyAssignment;

public class MonthlySalary {
	
	int basicpay;
	int boa,bonus;
	int employeelevel;
	private int totalsalary;
	
	public MonthlySalary(int employeelevel,int basicpay,int boa,int bonus) {
		this.basicpay=basicpay;
		this.bonus=bonus;
		this.boa=boa;
		this.employeelevel=employeelevel;
	}
	
	
	public void totalSalary() {
		//total salary calculation
		totalsalary=basicpay+boa+bonus;
		
		//pf calculation		
		double pfdeduct=basicpay*0.12;
		
		//monthly salary after pf deduction		
		double monthlysalary=totalsalary-pfdeduct;
		
		//annual salary
		double annualsalary=monthlysalary*12;
		
	    double tax=taxamount (annualsalary);
	    
	    double taxableamt=annualsalary*tax;
	    
	    double totalsalary=annualsalary-taxableamt;
	    
	    double monthsalary=totalsalary/12;
	    
	  System.out.println("the monthly salary of employee" +employeelevel+  " is " +monthlysalary);
	    
	}
		public double taxamount(double annualsalary) { 
			double tax=0;
			//double annualsalary;
			if(annualsalary <250000) {
				 tax=0;
			}else if(annualsalary>250000 && annualsalary<=500000){ 
				tax=annualsalary*0.05;
			}else if(annualsalary>500000 && annualsalary<=750000){
				tax=annualsalary*0.2;				
			}else if(annualsalary>750000 && annualsalary<=1000000){
				tax=annualsalary*0.2;
			}else if(annualsalary>1000000 && annualsalary<=1250000) {
				tax=annualsalary*0.3;
			}
					return tax;
		}
		
	

	

	public static void main(String[] args) {
		MonthlySalary obj=new MonthlySalary(1,7000,5000,2000);
		obj.totalSalary();
		MonthlySalary obj1=new MonthlySalary(2,10000,7000,2500);
		obj1.totalSalary();
		MonthlySalary obj2=new MonthlySalary(3,12000,9000,3000);
		obj2.totalSalary();
		MonthlySalary obj3=new MonthlySalary(4,15000,10000,2500);
		obj3.totalSalary();
		
		
		
	}

}
