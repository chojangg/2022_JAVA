package exception02;

public class Account {
	private int balance;
	
	public Account() {}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족: "+(money-balance)+"가 모자람");
		}
		balance -= money;
	}
}
