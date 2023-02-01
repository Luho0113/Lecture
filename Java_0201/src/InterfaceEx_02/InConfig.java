package InterfaceEx_02;

public interface InConfig {
	//인터페이스에 넣을 수 있는 것
	
	//1. 메소드
	void i1();
	//2. 상수
	static final double PI = 3.14;
	static final boolean OK = true;
	//3. default 메소드 - {실행부}를 사용할 수 있게 자바에서 허용해주는 것
	default void defaultM() { }
	//4. 정적 메소드 (static)
	static void staticM() { }
	//5. private - 인터페이스 안에서만 사용 가능
	private void privateM() { }

}
