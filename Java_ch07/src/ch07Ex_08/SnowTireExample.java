package ch07Ex_08;

public class SnowTireExample {

	public static void main(String[] args) {
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; //재정의한 메소드가 수행됨, 객체가 snowTire;
		
		
		snowTire.run();
		tire.run();

	}

}
