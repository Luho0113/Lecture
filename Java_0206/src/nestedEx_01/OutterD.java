package nestedEx_01;

public class OutterD {
	
	static int sid = 1;
	
	static void sdM() {
		final int ss = 10;
		
		class InnerD {
			int sid2 = 2;
			void siM() {
				System.out.println("�޼ҵ� ���� InnerDŬ������ siM():" + sid2 + " /  " + sid);
			}
		}
		
		// Ŭ���� ��üȭ
		InnerD id = new InnerD();
		id.siM();
	}

}
