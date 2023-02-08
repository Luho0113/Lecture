package insufficienEx_01;

public class AccountExample {

	public static void main(String[] args) {

		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금하기
		try {
			int money = 30000;
			account.withdraw(money);
			System.out.println("현재 출금 금액은 " + money + "원 입니다.");
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}

	}

}
