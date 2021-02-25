package oop_Interface;

public interface US_Medical {
	
	int minFee = 50;
	// interface have only method declaration/method prototype
	//No method body
	//interface supports multiple parent inheritance
	// All interface variable are static and final by default

	//After JDK 1.8 1) we can have static methods with method body for interface
	
	//2)default method with method body (Can be overridden also) 
	
	
	
	public void orthoService();
	public void neuroServices();
	public void opthomologyServices();
	public String EmergencyServices(String name);
	
	
	// static methods cannot be overridden
	public static void adminFee() {
		System.out.println("admin fee is min 10$");
	}
	default void bloodBank() {
		System.out.println("Blood Bank services");
	}
	

}
