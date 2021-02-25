package ooP_Encaspulation;

public class LoginPage {
	
	private String Username;
	private String Password;
	public String getUsername() {
		return Username;
	}
	public LoginPage(String Username,String Password) {
		this.Username = Username;
		this.Password = Password;
	}
//	public void setUsername(String username) {
//		Username = username;
//	}
	public String getPassword() {
		return Password;
	}
//	public void setPassword(String password) {
//		Password = password;
//	}
	
	public void doLogin(String un , String pwd) {
		System.out.println("Username is: "+un +" and " +"password is: " +pwd);
	}

}
