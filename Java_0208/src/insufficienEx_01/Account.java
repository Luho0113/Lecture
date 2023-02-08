package insufficienEx_01;

public class Account {
	
	private long balance;
	
	public Account() { }
	
	public long getBalance() {
		return balance;
	}
	
	//입금 메소드
	public void deposit(int money) {
		balance = balance + money;
	}
	
	//출금 메소드
	public void withdraw(int money) throws InsufficientException {
		                            //호출한 곳으로 발생시킨 예외를 떠넘김
		if ( balance < money ) {
			//예외 지정
			throw new InsufficientException("잔고 부족: " + (money - balance) + "원 모자람");
		}
		balance = balance - money;
	}

}
