package synchronizedThreadEx_01;

public class User2Thread extends Thread{
	
	private Calculator calculator;
	
	//생성자
	public User2Thread() {
		//스레드 이름 변경 (스레드의 메소드 호출)
		setName("Use2Thread");
	}
	
	//외부에서 공유 객체인 Calculator를 받아 필드에 저장
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	//동기화 메소드 호출
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
	
		
}
