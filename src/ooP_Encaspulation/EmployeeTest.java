package ooP_Encaspulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("SeethaRama");
		System.out.println(e1.getName());
		
		Company com = new Company();
		com.setSharePrice(5000);
		System.out.println(com.getSharePrice());
		com.getTermsAndConditions();
		
		
		
	}

}
