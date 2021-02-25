package functions;

import java.util.ArrayList;

public class Employee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		String[] Rama_assets = e1.getEmployeeAssets("Rama");
		System.out.println(Rama_assets.length);
		for(String s : Rama_assets) {
			System.out.println(s);
		}
		String[] Krishna_assets = e1.getEmployeeAssets("Krishna");
		System.out.println(Krishna_assets.length);
		for(String s1 : Krishna_assets) {
			System.out.println(s1);
		}
		System.out.println("**************************");
		ArrayList<String> Orders = e1.getEmpOrderList("Radha");
		System.out.println(Orders.size());
		for(String s3:Orders) {
			System.out.println(s3);
		}
		
		
	}
	public String[] getEmployeeAssets(String empName) {
		System.out.println("The emp name is: "+empName);
		String assets[]=new String[4];
		if(empName.equals("Rama")) {
			assets[0]="MacBook";
			assets[1]="iPhone";
			assets[2]="USB Cable";
			assets[3]="Charger";
		}
		else if(empName.equals("Krishna")) {
			assets[0]="hp";
			assets[1]="Samsung";
			assets[2]="Adopter";
			assets[3]="Mouse";
		}
		else {
			System.out.println("This emp name is "+empName+" "+"is not found......");
			return null;
		}
		return assets;
	}
	
	//WAP with respect to ArrayList 
	
	public ArrayList<String> getEmpOrderList(String empName) {
		System.out.println("The emp name is: "+empName);
		ArrayList<String> OrderList = new ArrayList<String>();
		if(empName.equals("Seetha")) {
		OrderList.add("Android Phone");
		OrderList.add("Samsung Tablet");
		OrderList.add("Keyboard");
		OrderList.add("HeadPhones");
	}
		else if(empName.equals("Radha")) {
			OrderList.add("Saree");
			OrderList.add("Bangles");
			OrderList.add("Bhindi");
			OrderList.add("Necklace Set");
		}
		else {
			System.out.println("The emp name "+empName+" "+"is not found,Please pass the correct name....");
		}
		return OrderList;
	}

}
