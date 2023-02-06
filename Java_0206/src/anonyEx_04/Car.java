package anonyEx_04;

public class Car {
	//익명 구현 클래스
	
	Tire t1 = new Tire() {
		//인터페이스 부모를 구현함
		@Override
		public void roll() {
			System.out.println("일반 타이어가 굴러갑니다.");
			
		}
	};
	
	Tire t2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("금호타이어가 굴러갑니다.");
			
		}
	};
	
}
