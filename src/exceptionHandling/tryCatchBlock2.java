package exceptionHandling;

public class tryCatchBlock2 {
	
	String name = "krishna";

	public static void main(String[] args) {
		
		System.out.println("Hello Testing");
		
		tryCatchBlock2 obj = new tryCatchBlock2();
		obj = null;
		try {
			int i = 9/0;
			System.out.println(obj.name);
			//int k = 9/0;
		}
		catch(NullPointerException e) {
			e.getMessage();
			System.out.println("NPE is coming");
			
		}
		catch(ArithmeticException e) {
			System.out.println("AME is coiming");
			e.printStackTrace();
			
		}
		System.out.println("Bye!");
		
		
	}

}
