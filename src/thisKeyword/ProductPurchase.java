package thisKeyword;

public class ProductPurchase {
	
	//advantage of this keyword can create n number of use cases , this is called builder pattern

	public static void main(String[] args) {
		
		Ecommerce ecomm = new Ecommerce();
		ecomm.login("test123@gmail.com", "Test@abc" );
		ecomm.search("iMac");
		ecomm.search("iMac", 2700);
		ecomm.addToCart("iMac");
		ecomm.CheckOut("iMac");
		ecomm.doPayment("1222 3333 3456 4565", 255);
		ecomm.inVoice(1234, "iMac");
		
		System.out.println("*************************************************");
		
		ecomm.login("radhika1rama@gmail.com", "java@practice");
		ecomm.search("Coach handbag");
		ecomm.doPayment("1234 5645 4545 4567", 123);
		ecomm.inVoice(12345, "Coach handbag");
		
		System.out.println("****************************************************");
		
		ecomm.login("gopika@gmail.com", "practice");
		ecomm.search("Watch");
		ecomm.doPayment("1232 2232 3432", 987);
		
		System.out.println("*****************************************************");
		
		ecomm.search("Ring")
		     .addToCart("Ring")
		     .CheckOut("Ring")
		     .inVoice(25, "Ring");
		  
		
	}
	
	

}
