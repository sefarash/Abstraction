package abstraction;

public class CreditCard extends BankCard {

	

	public CreditCard(String name, long cardNumber, double balance) {
		super(name, cardNumber, balance);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public double withDraw(int amount) {
		// TODO Auto-generated method stub
		return balance-amount*1.1;
		
	}
	
	public static void main(String[] args) {
		
		//BankCard b =new BankCard("Rashad`s card",1237289, 100);
		CreditCard c = new CreditCard("Rashad`s card",1237289, 100 );
		System.out.println(c.balance);
		System.out.println(c.withDraw(30));
		
	}
	

}
