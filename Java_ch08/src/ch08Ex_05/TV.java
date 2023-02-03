package ch08Ex_05;

public class TV implements Remocon{
	//구현 클래스
	// TV 클래스로 "TV를 켰습니다"라고 출력하기
	
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}

	public static void main(String[] args) {
		Remocon r = new TV(); //자식의 객체를 부모 타입(인터페이스)으로 받은 것
		r.powerOn(); 
	}

}
