package exception02;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: "+account.getBalance());
		
		// ����ϱ�
		try {
			account.withdraw(30000); // ����
		}catch(BalanceInsufficientException be) {
			String message = be.getMessage();
			// Account Ŭ������ BalanceInsufficientException
			System.out.println(message);
			System.out.println();
			be.printStackTrace();
		}
	}

}
