package stackEx_01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//���� ���α׷�
		
		//Stack ����
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//���� �ֱ�
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//���� �ϳ��� ������
		//System.out.println(coinBox.pop().getValue());
		while(!coinBox.isEmpty()) {
			Coin coinPop = coinBox.pop();
			System.out.println("������ ����: " + coinPop.getValue() + "��");
		}
		
		

	}

}
