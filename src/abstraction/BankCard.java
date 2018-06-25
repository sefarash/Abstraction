package abstraction;

public abstract class BankCard {
	
	String name;
	long cardNumber;
	double balance;
	
	
	
	public BankCard(String name, long cardNumber, double balance) {
		
		this.name = name;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}

	public abstract double withDraw(int amount);
	
	public long depositTake(long deposit) {
		double balance = deposit-wDraw;
		return balance;
	}
	
	
	
	

}
