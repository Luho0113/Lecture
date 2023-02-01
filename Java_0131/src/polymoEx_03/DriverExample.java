package polymoEx_03;

public class DriverExample {
	//교재 p.318
	public static void main(String[] args) {
		//Driver 객체 생성
		Driver myDriver = new Driver();
		
		//매개값으로 Bus객체를 제공하고 driver()메소드 호출
		Bus bus = new Bus();
		myDriver.drive(bus);  //bus의 주소가 
		// myDriver.drive(new Bus()); 와 동일
		// 출력 : 버스가 달립니다
		
		//매개값으로 Taxi객체를 제공하고 driver()메소드 호출
		Taxi taxi = new Taxi();
		myDriver.drive(taxi);
		// myDriver.drive(new Taxi());
		// 출력 : 택시가 달립니다.
		
		
		
	
	}

}
