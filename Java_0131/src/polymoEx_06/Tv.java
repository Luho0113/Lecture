package polymoEx_06;

public class Tv extends Product{
	//자식 클래스
	//생성자
	public Tv() {
		super(100); //부모생성자 호출, price값을 받아감 
	}
	
	@Override
	public String toString() {
		// Object클래스의 toString메소드를 재정의
		return "티비";
	}

}
