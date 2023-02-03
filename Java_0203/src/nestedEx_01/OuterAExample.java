package nestedEx_01;


public class OuterAExample {

	public static void main(String[] args) {
		
		//내부클래스의 메소드를 호출하기
		//1) 외부클래스를 먼저 객체화
		OuterA outerA = new OuterA();
		
		//2) 외부클래스를 객체화한 주소를 가진 참조변수로 내부클래스를 객체화 -> innerA에는 내부클래스의 객체 주소가 대입됨
		OuterA.InnerA innerA = outerA.new InnerA();
		
		//내부클래스를 객체화한 참조변수를 통해 내부클래스의 메소드를 호출
		innerA.innerAMethod();
		
	

	}

}
