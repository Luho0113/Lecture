package ch06Ex;
//교재 확인문제13번~18번

public class MemberMain {

	public static void main(String[] args) {
		// 13번
		Member user1 = new Member("홍길동", "hong");
		
		MemberService memService = new MemberService();
		boolean result = memService.login("hong", "12345"); //메소드 호출
		if (result) {
			System.out.println("로그인 되었습니다.");
			memService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		//16번 매개값을 콘솔에 출력
		Printer printer = new Printer();
		printer.println(10); //ShopService 클래스의 메소드를 static 으로 변경해서 경고가 생김
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		//17번 클래스명.메소드명(매개변수값);
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		
		//18번 싱글톤
		ShopService obj1 = ShopService.getInstance(); 
		ShopService obj2 = ShopService.getInstance();
		//클래스이름.메소드명();
		//객체 생성 방법으로 알 수 있는 것 = 메소드가 static으로 되어있고 다른 클래스의 메소드임을 알 수 있음!
		
		if (obj1 == obj2 ) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		//obj1, obj2만 출력해보면 같은 주소가 나옴
		
		
		//19번 은행계좌객체
		Account account = new Account();
		account.setBalance(10000); //현재 잔고
		System.out.println("현재 잔고: " + account.getBalance());
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());

	}

}
