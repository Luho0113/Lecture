package exceptionEx_01;

public class ExcepEx01 {

	public static void main(String[] args) {
		
		try { //���ܰ� �߻��� �� �ִ� �ڵ带 �ۼ�
			System.out.println(10 / 0);
		} catch (ArithmeticException e) { //���ܿ� ���� Ŭ������ + ����
			// ���ܹ߻��ϸ� ó���� �ڵ带 �ۼ�
			System.out.println(e.getMessage());
			System.out.println("���ܰ� �߻��߽��ϴ�.");
			
		} finally {
			//���ܿ� ������� ������ ó���Ǵ� �κ�
			System.out.println("�����ͺ��̽� �ݱ� / �����ϱ�");
		}
		
	}
}
