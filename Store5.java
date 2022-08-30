public class Store5 {
	String productType;
	double price;
	
	public Store5(String product, double initialPrice) {
		productType = product;
		price = initialPrice;
	}
	
	public void increasePrice(double priceToAdd) {
		double newPrice = price + priceToAdd;
		price = newPrice;
	}
	
	public double getPriceWithTax() {
		double tax = 0.08;
		double totalPrice = price + price * tax;
		return totalPrice;
	}
	
	public static void main(String[] args) {
		Store5 lemonadeStand = new Store5("Lemonade", 3.75);
		double lemonadePrice = lemonadeStand.getPriceWithTax();
		System.out.println(lemonadePrice);
	}
}