package polymoEx_06;

public class PolyArgumentTest {

	public static void main(String[] args) {
		// 객체 생성
		Buyer b = new Buyer();
		b.buy(new Tv()); //Tv라는 객체의 주소를 buy 메소드로 보내는 것
		//1. new Tv의 주소가 Product p로 전달됨 -> Tv클래스의 생성자를 통해 Product 클래스를 수행!
		//2. 참조변수의 주소를 담아서 갔지만 오버라이딩한 toString이 자동으로 실행되면서 p.toString으로 컴파일됨
		//syso(p); --> syso(p.toString);
		
		b.buy(new Computer());
		b.buy(new Audio());
		
		//제품 품목을 늘려보기 : 핸드폰 150만원, 아이패드 170만원
		b.buy(new Phone());
		b.buy(new IPad());
		b.summary();

	}

}
