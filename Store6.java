public class Store6 {
	String productType;
	double price;
	
	public Store6(String product, double initialPrice) {
		productType = product;
		price = initialPrice;
	}
	
	public void increasePrice(double priceToAdd) {
		double newPrice = price + priceToAdd;
	}
	
	public double getPriceWithTax() {
		double tax = 0.08;
		double totalPrice = price + price * tax;
		return totalPrice;
	}
	
	public String toString() {
		return "This store sells " + productType + " at a price of " + price + ".";
		
	}
	
	public static void main(String[] args) {
		Store6 lemonadeStand = new Store6("Lemonade", 3.75);
		Store6 cookieShop = new Store6("Cookies", 5);
		
		System.out.println(lemonadeStand);
		System.out.println(cookieShop);
	}
}