package nestedEx_01;

public class OutterA {
	//���� ����
	int oa = 10;
	static int soa = 20; //���� �ʵ�, Ŭ���� ���(����)
	
	//�޼ҵ� ����
	void oaM() {
		oa = oa + 1 ;
		soa = soa + 2;
		soaM();
	}
	static void soaM() {
		//�ν��Ͻ� ����(oa) ���Ұ���
		soa = soa + 2;
	}
	
	//��ø Ŭ����
	class InnerA {
		int ia = 3;
		// static int sia = 30;
		void inaM () {
			ia = ia + 3;
			oa = oa + 1;
			soa = soa + 2; 
			oaM();
			soaM();
		}
		// static void siaM() { }
		
	}
	
	//����1
	class ExamA{
		int sum = 0;
		int i = 0;
		void examAM() {
			for (i = 0; i<=100; i++) {
				sum = sum + i;
			}
		}
		void printSum() {
			System.out.println("1~100������ ��: " + sum);
		}
		
	}

}
