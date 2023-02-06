package anonyEx_02;

import java.util.Scanner;

public class Calculator {
	
	Scanner sc;
	
	Shape sa = new Shape();
	// Calculator ca = new Calculator();
	
	void input() {
		sc = new Scanner(System.in);
		System.out.print("가로 입력 > " );
		sa.setWidth(sc.nextInt());
		System.out.print("세로 입력 > ");
		sa.setLength(sc.nextInt());
	}
	
	void print() {
		sa.printS();
	}
	
	
	//익명 자식 객체 생성
	Shape ca1 = new Shape() {

		@Override
		void calc() {
			int result;
			input();
			result = sa.getWidth() * sa.getLength();
			print();
			System.out.println("넓이: " + result);
			
		}
	};
	
	Shape ca2 = new Shape() {
		
		@Override
		void calc() {
			int volume; //부피
			int result;
			input();
			System.out.print("높이 입력> ");
			sa.setHeight(sc.nextInt()); 
			result = sa.getWidth() * sa.getLength() * sa.getHeight();
			print();
			System.out.println("부피: " + result);
			
		}
		
	};
	
	Shape ca3 = new Shape() {
		@Override
		void calc() {
			int volume; //부피
			int result;
			
			input();
			System.out.print("높이 입력> ");
			sa.setHeight(sc.nextInt()); 
			result = (sa.getWidth()*sa.getLength() + sa.getLength()*sa.getHeight() + sa.getWidth()*sa.getHeight() ) *2;
			print();
			System.out.println("겉넓이: " + result);
		}
	};
	
	


}
