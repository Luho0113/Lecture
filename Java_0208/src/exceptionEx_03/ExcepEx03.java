package exceptionEx_03;

public class ExcepEx03 {

	public static void main(String[] args) {
		
		try {
			//����1
			Class.forName("java.lang.String"); 
			//����2
			int a = 10/0; 
			//����3
			int[] number = {10, 20, 30, 40, 50};
			System.out.println(number[5]);
			
		} catch (ClassNotFoundException e) {
			//����1�� �߻��ϸ� �����
			System.out.println("class�� ���� �����Դϴ�.");
			
		} catch(ArithmeticException e){
			//����2�� �߻��ϸ� �����
			System.out.println("���������� �߸��� �����Դϴ�.");
			
		} catch(ArrayIndexOutOfBoundsException e){
			//����3�� �߻��ϸ� �����
			System.out.println("�迭�ε����� ��� �����Դϴ�.");
			
		} finally {
			System.out.println("�����ϱ�");
		}
	}

}
