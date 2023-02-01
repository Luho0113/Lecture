package InterfaceEx_01;

public class InterfaceEx {

	public static void main(String[] args) {
		
		//인터페이스 객체 생성 = '구현 클래스'를 객체화, 인스턴스화 해야 함!
		//인터페이스를 직접 객체화(오류 발생) - A a new A(); 
		AImpl aimpl = new AImpl();
		CCImpl ccimple = new CCImpl();

	}

}
