package exceptionEx_02;

public class ExcepEx02 {

	public static void main(String[] args) {

		try {
			int[] number = { 10, 20, 30, 40, 50};
			System.out.println(number[5]); //�迭�ε����� ��� ����
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		} finally {
			System.out.println("���� ����");
		}

	}

}
