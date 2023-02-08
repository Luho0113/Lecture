package exceptionEx_05;

public class ExcepEx05 {

	public static void main(String[] args) {
		
		try {
			A a = new A();
			a.a1();
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | ClassNotFoundException e) {
			
			if( e instanceof ArithmeticException) {
				System.out.println("�������� ���ܰ� �߻��߽��ϴ�.");
			} else if ( e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("�迭�� �ε������� ���ܰ� �߻��߽��ϴ�.");
			} else if (e instanceof ClassNotFoundException ) {
				System.out.println("Ŭ�������� ������ �߻��߽��ϴ�.");
			}
			
		} catch ( Exception e ) {
			System.out.println("��� ���ܸ� ó���߽��ϴ�.");
		} finally {
			System.out.println("���ܿ� ������� ó���ؾ� �ϴ� �ڵ� �κ�");
		}
		

	}

}
