package OOP_Interface;

public class EngineeringCollege extends CentralUniversity implements University1,University2,University3{

	@Override
	public void dataScience() {
		
		System.out.println("university3----datascience");
		
		}

	@Override
	public void networking() {
		System.out.println("university3----networking");
		
	}

	@Override
	public void bioTechnology() {
		System.out.println("university3----biotechnology");
		
	}

	@Override
	public void civil() {
		System.out.println("university2----civil engineering");
		
	}

	@Override
	public void electronics() {
		System.out.println("university2----ElectronicsEngineering");
	}

	@Override
	public void informationTechnology() {
		System.out.println("university2----InformationTechnology Engineering");
		
	}

	@Override
	public void computerScience() {
		System.out.println("university1----computerscience engineering");
		
	}

	@Override
	public void mechanical() {
		System.out.println("university1----Mechanical engineering");
		
	}

	@Override
	public void electrical() {
		System.out.println("university1----ElectricalEngineering");
		
	}
	public void Adminstration() {
		System.out.println("in college Admin department");
	}
	public void Recruitment() {
		System.out.println("in college Recruitment department");
	}

	@Override
	public void internationalStudents() {
		
		System.out.println("world education system method");
		
	}

}
