package stackEx_02;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// ������
		
		//Stack ����
		Stack<Park> park = new Stack<Park>();
		
		//����
		park.push(new Park("K5"));
		park.push(new Park("Ƽ��"));
		park.push(new Park("�׷���"));
		park.push(new Park("����"));
		park.push(new Park("�ҳ�Ÿ"));
		
		//�ϳ��� ������
		while(!park.isEmpty()) {
			Park parkOut = park.pop();
			System.out.println("������ ��: " + parkOut.getCar());
		}
		

	}

}
