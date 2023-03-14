package OOP_Inheritance;

public class TestHospital {

	public static void main(String[] args) {
		//TestHospital th=new TestHospital();
		
		Hospital h1=new Hospital();
		h1.patientName();
		h1.address();
		h1.payment();
		
		Appolo a1=new Appolo();
		a1.address();
		a1.patientName();
		a1.patientHistory();
		
		Hospital h2=new Appolo();
		h2.address();
		h2.patientName();
		h2.payment();
		
		//Fortis f1=new Hospital();
		
		

	}

}
