package ch09Ex_05;

public class ActionExample {

	public static void main(String[] args) {
		// Action�� �͸� ���� ��ü�� ����� �����ϱ�
		
		//�ʵ忡 �͸� ���� ��ü ����
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
				
			}
		};
		
		action.work();
		


	}

}
