public class BankAccount {
	public static void main(String[] args) {
		double balance = 1000.75;
		double amountToWithdraw = 250;
		
		double undatedBalance = balance - amountToWithdraw;
		double amountForEachFriend = undatedBalance/3;
		boolean canPurchaseTicket = amountForEachFriend >= 250;
		
		System.out.println(canPurchaseTicket);
	}
}