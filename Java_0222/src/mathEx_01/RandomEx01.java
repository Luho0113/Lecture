package mathEx_01;

import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		//Math.random() : ����(��Ģ�� ���� ��)�� ����
		
		//Random Ŭ������ ��� - ��ü �����ؾ� ��� ����
		Random r = new Random();
		
		System.out.println(r.nextBoolean()); //true or false
		System.out.println(r.nextInt());
		System.out.println(r.nextDouble());
		
		System.out.println(r.nextInt(10)); //int bound
		//0<= ���� < N �ȿ��� ���� ����
		
		

	}

}
