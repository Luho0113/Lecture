package exceptionEx_07;

public class ExcepEx07 {

	public static void main(String[] args) {
		
		try {
			B b = new B();
			b.b1();
		} catch (Exception e) {
			if (e instanceof ArithmeticException) {
				System.out.println("�������� ���� �߻�");
				System.out.println(e.getMessage());
			}else if (e instanceof ClassNotFoundException) {
				System.out.println("Ŭ���� ���� �߻�");
				System.out.println(e.getMessage());
			}
			
			
		} finally {
			System.out.println("���α׷� ����");
		}
		

	}

}
