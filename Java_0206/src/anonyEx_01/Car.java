package anonyEx_01;

public class Car {
	//비즈니스 클래스
	
	//필드(tire1)에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	//익명 자식 객체 대입
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 객체1이 굴러갑니다.");
		}
	};
	
	//메소드 호출
	public void run1() {
		tire1.roll(); //출력: 일반 타이아
		tire2.roll(); //출력: 익명 자식
	}
	
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	
	
	
	//예시
	private Tire tire4 = new Tire() {
		@Override
		public void roll() {
			System.out.println("금호 타이어가 굴러갑니다.");
		}
	};
	
	public void run4() {
		tire4.roll();
	}
	
	

}
