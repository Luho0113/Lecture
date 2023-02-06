package anonyEx_01;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car car = new Car();
		//메소드 호출 (익명 자식 객체가 대입된 필드 사용)
		car.run1();
		car.run2();
		
		car.run3(new Tire(){
			@Override
			public void roll() {
				System.out.println("익명 자식 객체 3이 굴러갑니다.");
			}
		});
		
		car.run4();

	}

}
