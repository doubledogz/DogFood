public class Store3 {
	String productType;
	double price;
	
	public Store3(String product, double initialPrice) {
		productType = product;
		price = initialPrice;
	}
	
	public void increasePrice(double priceToAdd) {
		double newPrice = price + priceToAdd;
		price = newPrice;
	}
	
	public static void main(String[] args) {
		Store3 lemonadeStand = new Store3("Lemonade" , 3.75);
		lemonadeStand.increasePrice(1.5);
		System.out.println(lemonadeStand.price);
	}
}