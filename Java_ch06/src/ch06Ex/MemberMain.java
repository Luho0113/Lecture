package ch06Ex;
//���� Ȯ�ι���13��~18��

public class MemberMain {

	public static void main(String[] args) {
		// 13��
		Member user1 = new Member("ȫ�浿", "hong");
		
		MemberService memService = new MemberService();
		boolean result = memService.login("hong", "12345"); //�޼ҵ� ȣ��
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		//16�� �Ű����� �ֿܼ� ���
		Printer printer = new Printer();
		printer.println(10); //ShopService Ŭ������ �޼ҵ带 static ���� �����ؼ� ��� ����
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
		//17�� Ŭ������.�޼ҵ��(�Ű�������);
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("ȫ�浿");
		
		//18�� �̱���
		ShopService obj1 = ShopService.getInstance(); 
		ShopService obj2 = ShopService.getInstance();
		//Ŭ�����̸�.�޼ҵ��();
		//��ü ���� ������� �� �� �ִ� �� = �޼ҵ尡 static���� �Ǿ��ְ� �ٸ� Ŭ������ �޼ҵ����� �� �� ����!
		
		if (obj1 == obj2 ) {
			System.out.println("���� ShopService ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
		}
		//obj1, obj2�� ����غ��� ���� �ּҰ� ����
		
		
		//19�� ������°�ü
		Account account = new Account();
		account.setBalance(10000); //���� �ܰ�
		System.out.println("���� �ܰ�: " + account.getBalance());
		account.setBalance(-100);
		System.out.println("���� �ܰ�: " + account.getBalance());
		account.setBalance(2000000);
		System.out.println("���� �ܰ�: " + account.getBalance());
		account.setBalance(300000);
		System.out.println("���� �ܰ�: " + account.getBalance());

	}

}
