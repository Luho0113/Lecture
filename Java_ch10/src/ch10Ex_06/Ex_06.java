package ch10Ex_06;

public class Ex_06 {

	public static void main(String[] args) {
		//

		String[] strArray = { "10", "2a" };
		
		int value = 0;
		
		for (int i = 0; i <= 2; i++) {
			//i<=2 ������ 0��, 1��, 2���� ���ư��� �ε��� �ʰ�
			
			try {
				//���������� �ٲ��� -> 2a�� ������ �ȵ�
				value = Integer.parseInt(strArray[i]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("�ε����� �ʰ�����");
				
			} catch (NumberFormatException e) {
				
				System.out.println("���ڷ� ��ȯ�� �� ����");
				
			} finally {
				
				System.out.println(value);
			}
		}

	}

}
