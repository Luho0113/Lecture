package nestedEx_01;

public class OutterExample {

	public static void main(String[] args) {
		// 1) OtterA(�ν��Ͻ� �ɹ� Ŭ����) ��üȭ (����Ŭ������ �ν��Ͻ�)
		OutterA oa = new OutterA(); //�ܺ�Ŭ���� ��üȭ
		OutterA.InnerA ia = oa.new InnerA(); //����Ŭ���� ��üȭ
		
		
		// 2) OtterB(���� ��� Ŭ����) ��üȭ (����Ŭ������ ����)
		OutterB.InnerB oi = new OutterB.InnerB();
		oi.ib = 100;
		oi.inbM();
		OutterB.InnerB.sib = 200;
		//Ŭ�������.������� �Ǵ� Ŭ������.�޼ҵ��
		
		
		// 1)������� �ν��Ͻ���� Ŭ������ 1~100���� ���� ����ϱ�
		OutterA ea = new OutterA();
		OutterA.ExamA exa = ea.new ExamA();
		exa.examAM(); //��� �޼ҵ� ȣ��
		exa.printSum(); //��� �޼ҵ� ȣ��
		System.out.println("-----------------------");
		
		
		
		// 2)������� ������� Ŭ������ ***** ����ϱ�
		OutterB.examB eb = new OutterB.examB(); //��ü ����
		OutterB.examB.examBM(); //��ü ���� ���ϰ� ���� ȣ�� ����?
		System.out.println("-----------------------");
		OutterB.examB.examBM2();
		// eb.examBM2();
		
		
		//�ν��Ͻ� �޼ҵ� ���� Ŭ����
		OutterC oc = new OutterC();
		oc.icM(); //�޼ҵ� ȣ��
		//icM()�� ���� ȣ������ ���� -> ���� �޼ҵ带 ȣ���ؾ� ���� Ŭ������ ����� �� ����
		
		
		//���� �޼ҵ� ���� Ŭ����
		OutterD.sdM();

	}

}
