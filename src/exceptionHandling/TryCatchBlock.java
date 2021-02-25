package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		
		try {
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("exception is coming");
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		
		System.out.println("hi");
		System.out.println("hi");
	}

}
