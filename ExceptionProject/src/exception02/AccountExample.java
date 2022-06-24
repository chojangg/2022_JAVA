package exception02;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(30000); // 인출
		}catch(BalanceInsufficientException be) {
			String message = be.getMessage();
			// Account 클래스의 BalanceInsufficientException
			System.out.println(message);
			System.out.println();
			be.printStackTrace();
		}
	}

}
