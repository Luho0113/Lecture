package insufficienEx_01;

public class InsufficientException extends Exception {
	//잔고부족 예외를 사용자 정의 예외 클래스로 선언 (일반예외)

	public InsufficientException() {
		//기본 생성자
	}

	public InsufficientException(String message) {
		//예외 메세지를 입력받아 부모 생성자의 매개값으로 넘겨줄 생성자
		super(message);
	}

}
