package ooP_Encaspulation;

public class LoginPageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage("admin@gmail.com","admin@123");
//		lp.setUsername("admin@gmail.com");
//		lp.setPassword("Test@123");
//		System.out.println(lp.getUsername());
//		System.out.println(lp.getPassword());
		lp.doLogin(lp.getUsername(), lp.getPassword());
		lp.doLogin("sales@gmail.com", "sale@123");
		

	}

}
