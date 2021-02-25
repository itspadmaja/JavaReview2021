package functions;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		String capName = obj.getCapitalName("India");
		System.out.println(capName);
		capName = obj.getCapitalName("Russia");
		System.out.println(capName);
		int score = obj.getMarks("Sai");
		System.out.println(score);
		if(obj.launchBrowser("Safari")) {
			System.out.println("Launch Browser and Start Execution");
		}
		else {
			System.out.println("Browser not found.....");
		}
		

	}
	public String getCapitalName(String countryName) {
		System.out.println("The capital of the Country is : "+ countryName);
		if(countryName.equals("India")) {
			return "NewDelhi";
		}
		else if(countryName.equals("USA")) {
			return "Washington DC";
		}
		else if(countryName.equals("Germany")) {
			return "Berlin";
		}
		else{
			System.out.println("This Country is not found "+" : " + countryName);
			return null;
		}
		
	}
	//wap passing student name and return marks
	public int getMarks(String name) {
		System.out.println("Student name is: " +name);
		int marks = 0;
		if(name.equals("Rama")) {
			marks = 100;
		}
		else if(name.equals("krishna")) {
			marks = 90;
		}
		else if(name.equals("seetha")) {
			marks = 75;
		}
		else {
			System.out.println(name);
			return -1;
		}
		return marks;
	}

	
	//wap to pass browsername and launch browser and return boolean
	public boolean launchBrowser(String browserName) {
		System.out.println("Launching the browser"+ " " + browserName);
		boolean flag = false;
		switch (browserName) {
		case "Chrome":
			System.out.println("launching Chrome");
			flag = true;
			break;
			
		case "firefox":
			System.out.println("launching firefox");
				flag = true;
				break;
				
		case "Edge":
			System.out.println("launching Mircrosoft Edge");
					flag = true;
					break;

		default:
			System.out.println("Browser not found "+ browserName);
			break;
		}
		return flag;
	}
	 

}
	
