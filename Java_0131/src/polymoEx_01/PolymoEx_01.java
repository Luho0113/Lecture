package polymoEx_01;

public class PolymoEx_01 {

	public static void main(String[] args) {
		// 다형성
		
		Animal animal = new Cat();
		//작은 타입의 정수형 자료가 큰 타입의 실수형 자료로 들어가는 것처럼 오류가 나지 않음
		//작은 타입 = 자식 클래스, 큰 타입 = 부모 클래스
		//자식의 주소가 부모로 들어가는 것
		
		
		// Cat cat = new Animal(); 오류발생, 부모 클래스를 인스턴스한 것은 자식의 자료형으로 받을 수 없음

	}

}
