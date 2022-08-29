public class Store1 {
	String productType;
	public Store1(String product) {
		productType = product;
	}
	public void advertise() {
		String cookie = "Cookies";
		String message = "Selling " + productType + "!";
		System.out.println(message);
	}
	public static void main(String[] args) {
		String cookie = "Cookies";
		Store1 cookieShop = new Store1(cookie);
		
		cookieShop.advertise();
	}
}