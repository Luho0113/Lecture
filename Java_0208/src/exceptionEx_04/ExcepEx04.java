package exceptionEx_04;

public class ExcepEx04 {

	public static void main(String[] args) {
		
		int a = 10;
		int k = 0;
		
		try {
			//���1
			Class.forName("java.lang.String"); 
			//���2
			a = 10/k; 
			//���3
			int[] number = {10, 20, 30, 40, 50};
			System.out.println(number[5]);
			
		} catch (ArithmeticException e) {
			
			if (k == 0) {
				k = 5;
				System.out.println(a/k);
			}
			//���� ������ ���ܺ��� ó��
			System.out.println("���������� �߻��ϴ� �����Դϴ�.");
			
		} catch (Exception e) { 
			
			//Exception �̶�� ���� Ŭ����
			System.out.println("��� ���ܸ� ó���մϴ�.");
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("�����ϱ�");
		}

	}

}
