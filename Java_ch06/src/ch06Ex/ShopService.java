package ch06Ex;

public class ShopService {
	//�̱��� ���
	
	//1. �ʵ����+�ʱ�ȭ, s�� ��������
	private static ShopService s = new ShopService();
	//2. ��ü����(private�� �⺻������)
	private ShopService() { }
	//3. public�� ���� �޼ҵ带 ����
	public static ShopService getInstance() { 
		return s;
	}

}
