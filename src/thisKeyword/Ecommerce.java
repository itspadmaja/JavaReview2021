package thisKeyword;

public class Ecommerce {
	
	public Ecommerce login(String un , String pwd) {
		System.out.println("login with "+ un +" and " +pwd);
		return this;//this keyword returns the object of that particular class
	}
	public Ecommerce search(String ProductName) {
		System.out.println("The Product name is: " + ProductName);
		return this;
	}
	public Ecommerce search(String ProductName, int price) {
		System.out.println("the "+ " : " + ProductName + "and" + price);
		return this;
	}
	public Ecommerce addToCart(String ProductName) {
		System.out.println("Adding to the cart" +"  " + ProductName);
		return this;
	}
	public Ecommerce CheckOut(String ProductName) {
		System.out.println("Checking out the Product " + ProductName);
		return this;
	}
	public Ecommerce doPayment(String CC , int cvv) {
		System.out.println("Payment is done with " + CC + "&" + cvv);
		return this;
	}
	public Ecommerce inVoice(int number, String ProductName) {
		System.out.println("Generating invoice with order number" + number + " for this " + ProductName);
		return this;
	}

}
