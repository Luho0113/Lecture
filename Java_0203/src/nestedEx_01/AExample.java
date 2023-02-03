package nestedEx_01;

public class AExample {

	public static void main(String[] args) {
		
		// A클래스 객체 생성
		A a = new A();
		
		//A클래스 메소드 호출
		a.method();
	
		//B라는 클래스를 다른 클래스에서 사용해보기
		//방법1) 외부 클래스인 A를 객체화하고 B클래스를 객체화하기
		A.B b =  a.new B(); //참조변수 a를 통해 B라는 객체를 생성하는데 리턴타입은 A안에 있는 B(A.B)이다
		b.bMethod(); //내부 클래스 B의 메소드 호출
		

	}

}
