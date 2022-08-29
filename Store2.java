public class Store2 {
	String productType;
	public Store2(String product) {
		productType = product;
	}
	public void advertise() {
		String message = "Selling " + productType + "!";
		System.out.println(message);
	}
	public void greetCustomer(String customer) {
		System.out.println("Welcome to the store, " + customer + "!");
	}
	public static void main(String[] args) {
		Store2 lemonadeStand = new Store2("Lemonade");
		
		lemonadeStand.greetCustomer("Laura");
	}
}