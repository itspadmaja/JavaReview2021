package thisKeyword;

public class DataConversion {

	public static void main(String[] args) {
		
		//1, String to Integer
		String n = "100";
		System.out.println(n+20);
		int i = Integer.parseInt(n);//Integer is a Wrapper Class
		System.out.println(i+20);
		
		//2. String to Double
		
		String price = "34.55";
		System.out.println(price+25);
		
		double amt = Double.parseDouble(price);//Double is a wrapper class, Wrapper classes are created on top of primitive datatypes
		System.out.println(amt+25);//Wrapper Classes used to handle different types of primitive datatypes
		
		String h = "100A";
		//int k = Integer.parseInt(h);
		//System.out.println(k+20); //NumberFormatException 
		
		// 3. int to String
		// String is not a Wrapper class, just a simple class
		
		int s = 100;
		System.out.println(s+25);
		String s1 = String.valueOf(s);//"100";
		System.out.println(s1+25);
	}

}
