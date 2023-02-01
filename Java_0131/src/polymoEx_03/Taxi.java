package polymoEx_03;

public class Taxi extends Vehicle{
	//자식 클래스
	//재정의
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}
