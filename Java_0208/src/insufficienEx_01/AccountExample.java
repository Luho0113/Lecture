package insufficienEx_01;

public class AccountExample {

	public static void main(String[] args) {

		Account account = new Account();
		
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: " + account.getBalance());
		
		//����ϱ�
		try {
			int money = 30000;
			account.withdraw(money);
			System.out.println("���� ��� �ݾ��� " + money + "�� �Դϴ�.");
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}

	}

}
