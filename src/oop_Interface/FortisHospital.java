package oop_Interface;

public class FortisHospital extends CentralizedHospital 
                            implements US_Medical, UK_Medical, Indian_Medical{

	@Override
	public void orthoService() {
		System.out.println("FH-----orthoservices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH-------neuroservices");
	}

	@Override
	public void opthomologyServices() {
		
		System.out.println("FH----------opthomology");
	}

	@Override
	public void ENTservices() {
		
		System.out.println("FH----------ENT Services");
	}

	@Override
	public void audiologyServices() {
		System.out.println("FH--------------audiologyServices");
	}

	@Override
	public String EmergencyServices(String countryName) {
		
		System.out.println("FH------Emergency services");
		if(countryName.equals("India")) {
			System.out.println("The country name is: " + countryName);
			return "108 services";
		}
		else if(countryName.equals("USA")) {
			System.out.println("The country name is: " + countryName);
			return "911 services";
		}
		else if(countryName.equals("UK")) {
			System.out.println("The country name is: " + countryName);
			return "99 services";
		}
		else {
			System.out.println("Please pass the correct Country Name : "+countryName);
			return null;
		}
		
		
		
	}

	@Override
	public void PediatricService() {
		System.out.println("FH==========pediatricServices");
	}

	@Override
	public void gyncServices() {
		System.out.println("FH--------gyenic Services");
	}
	//non=overridden methods
	
	public void clinicalServices() {
		System.out.println("FH------clinical services");
	}
	public void OPTServices() {
		System.out.println("FH--------OutPatient Services");
	}

	@Override
	public void covidTest() {
		System.out.println("FH------Covid dept services");
		
	}

	@Override
	public void pandemicControl() {
		System.out.println("FH------Pandemic Control WorldWide");
		
	}

	@Override
	public void WorldHealthServices() {
		System.out.println("FH-----------World Health Services");
		
	}
	@Override
	public void bloodBank() {
		System.out.println("FH---------default method");
	}
	
	

}
