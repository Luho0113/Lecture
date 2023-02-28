package genericEx_02;

public class BoundedEx01 {
	
	//���ѵ� Ÿ�� �Ķ���͸� ������ ���׸� �޼ҵ�
	public static <T extends Number> boolean compare(T t1, T t2) {
		//T�� Ÿ���� ���
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
		
		
		//Number�� �޼ҵ带 ���
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}

	public static void main(String[] args) {
		//���׸� �޼ҵ带 ȣ��
		boolean result1 = compare(10, 20); //T�� Integer Ÿ������ ��ü
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5); //T�� Double Ÿ������ ��ü
		System.out.println(result2);
		
		

	}

}
