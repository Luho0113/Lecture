package mathEx_01;

import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		//Math.random() : 난수(규칙이 없는 수)를 얻음
		
		//Random 클래스를 사용 - 객체 생성해야 사용 가능
		Random r = new Random();
		
		System.out.println(r.nextBoolean()); //true or false
		System.out.println(r.nextInt());
		System.out.println(r.nextDouble());
		
		System.out.println(r.nextInt(10)); //int bound
		//0<= 난수 < N 안에서 난수 리턴
		
		

	}

}
