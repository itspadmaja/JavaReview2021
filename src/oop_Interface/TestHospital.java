package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.audiologyServices();
		fh.clinicalServices();
		System.out.println(fh.EmergencyServices("India"));
		fh.covidTest();
		fh.pandemicControl();
		fh.WorldHealthServices();
		fh.bloodBank();
		
		System.out.println("*********************************");
		US_Medical.adminFee();
		System.out.println("min fee should be paid: " +US_Medical.minFee);
				
		System.out.println("**********************************");
		//Object of Interface cannot be created
		
		//TopCasting
		//Parent Interface ref variable referred to Child Class Object
		//canNOT call (non-overridden methods) of child class object with Parent ref variable [Reference Type Check Rule is applied here]
		US_Medical USA = new FortisHospital();
		USA.opthomologyServices();
		System.out.println(USA.EmergencyServices("USA"));
		USA.orthoService();
		USA.neuroServices();
	
		
		//DownCasting is NOT Possible even at compile time, bcos Object of Interface cannot be created
		//cannot call the other interface methods, 
		
		
		
	
		
		
		
		
	}

}
