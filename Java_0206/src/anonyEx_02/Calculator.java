package anonyEx_02;

import java.util.Scanner;

public class Calculator {
	
	Scanner sc;
	
	Shape sa = new Shape();
	// Calculator ca = new Calculator();
	
	void input() {
		sc = new Scanner(System.in);
		System.out.print("���� �Է� > " );
		sa.setWidth(sc.nextInt());
		System.out.print("���� �Է� > ");
		sa.setLength(sc.nextInt());
	}
	
	void print() {
		sa.printS();
	}
	
	
	//�͸� �ڽ� ��ü ����
	Shape ca1 = new Shape() {

		@Override
		void calc() {
			int result;
			input();
			result = sa.getWidth() * sa.getLength();
			print();
			System.out.println("����: " + result);
			
		}
	};
	
	Shape ca2 = new Shape() {
		
		@Override
		void calc() {
			int volume; //����
			int result;
			input();
			System.out.print("���� �Է�> ");
			sa.setHeight(sc.nextInt()); 
			result = sa.getWidth() * sa.getLength() * sa.getHeight();
			print();
			System.out.println("����: " + result);
			
		}
		
	};
	
	Shape ca3 = new Shape() {
		@Override
		void calc() {
			int volume; //����
			int result;
			
			input();
			System.out.print("���� �Է�> ");
			sa.setHeight(sc.nextInt()); 
			result = (sa.getWidth()*sa.getLength() + sa.getLength()*sa.getHeight() + sa.getWidth()*sa.getHeight() ) *2;
			print();
			System.out.println("�ѳ���: " + result);
		}
	};
	
	


}
