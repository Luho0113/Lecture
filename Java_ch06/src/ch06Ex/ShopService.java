package ch06Ex;

public class ShopService {
	//싱글톤 모습
	
	//1. 필드생성+초기화, s가 참조변수
	private static ShopService s = new ShopService();
	//2. 객체생성(private인 기본생성자)
	private ShopService() { }
	//3. public인 정적 메소드를 선언
	public static ShopService getInstance() { 
		return s;
	}

}
