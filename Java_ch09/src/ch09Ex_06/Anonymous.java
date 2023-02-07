package ch09Ex_06;

public class Anonymous {
	
	//익명 객체 필드 (field 라는 참조변수를 통해 익명 개체 생성)
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");	
		}
	};
		
	//익명 개체 로컬 변수
	void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		
		localVar.run(); //로컬변수.메소드호출
	}
	
	//익명 객체 매개값 사용
	void method2(Vehicle v) {
		v.run();
	}
	
}
