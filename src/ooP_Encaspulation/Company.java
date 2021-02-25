package ooP_Encaspulation;

public class Company {
	
	private String name;
	private int sharePrice;
	private int totalNoOfEmployees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public int getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}
	public void setTotalNoOfEmployees(int totalNoOfEmployees) {
		this.totalNoOfEmployees = totalNoOfEmployees;
	}
	
	private void getPrivacyPolicy() {
		System.out.println("Privacy Policy updated");
	}
	public void getTermsAndConditions() {
		getPrivacyPolicy();
	}
	

}
