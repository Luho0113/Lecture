package nestedEx_01;

public class OutterC {
	
	int ic = 1;
	static int sic = 2;
	
	void icM() {
		class InnerC {
			int ic2 = 2;
			
			void icM() {
				ic = ic + 1;
				ic2 = ic2 + 2;
				System.out.println("�޼ҵ� �ȿ� ����ִ� Ŭ������ �޼ҵ� ����");
			}
			
			// static int sic = 2;
			// static void icsM() { }
		}
		
		//�޼ҵ� �ӿ��� ���� Ŭ������ ��üȭ -> �޼ҵ尡 Ŭ������ ����
		InnerC excM = new InnerC();
		excM.icM();

	} //icM() end
	
	static void sicM() {
		
	}
	

}
