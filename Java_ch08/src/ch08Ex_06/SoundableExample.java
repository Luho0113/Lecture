package ch08Ex_06;

public class SoundableExample {
	//printSound()를 호출할 때 Cat과 Dog 객체를 주고 실행하면 각각 "야옹"과 "멍멍"이 출력되도록 클래스를 작성
	
	public static void printSound ( Soundable soundable ) {
		//매개변수 타입 = 인터페이스
	
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
