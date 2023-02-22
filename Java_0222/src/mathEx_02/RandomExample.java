package mathEx_02;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// ���� ��ȣ
		int[] selectNumber = new int[6]; //���ù�ȣ 6���� ������ �迭
		
		//Random ��ü ����
		Random random = new Random(3); //���ڰ�=3
		System.out.print("���ù�ȣ: ");
		
		//���ù�ȣ 6���� �� �迭�� ����
		for(int i = 0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			//ramdom.nextInt : 0<=N<45 -> 0+1<=N<46
			//1~45 ������ ���� ���ڸ� ����
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//��÷ ��ȣ
		int[] winNumber = new int[6]; 
		
		random = new Random(5); //���ڰ�=5
		//���� ��ȣ�� ���ڰ��� �ٸ��� ������ �ٸ� ������ ����(������ ������ ������ ����)
		
		System.out.print("��÷ ��ȣ: ");
		for(int i = 0; i<6; i++) {
			winNumber[i] = random.nextInt(45)+1;
			System.out.print(winNumber[i] + " ");
		}
		System.out.println();
		
		//��÷ ����
		//�迭�� ����
		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);
		
		boolean result = Arrays.equals(selectNumber, winNumber);
		System.out.print("��÷ ����: ");
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
		

	}

}
