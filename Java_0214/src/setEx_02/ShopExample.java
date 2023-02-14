package setEx_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ShopExample {

	public static void main(String[] args) {
		// �÷��� ����
		Set<Shop> shopSet = new HashSet<Shop>();

		shopSet.add(new Shop("�̱��", "1234", 100));
		shopSet.add(new Shop("���ູ", "4567", 90));
		shopSet.add(new Shop("����ȭ", "1234", 100));
		shopSet.add(new Shop("�ֱ��", "1234", 100));
		shopSet.add(new Shop("�����", "1234", 100));
		shopSet.add(new Shop("�̱��", "1234", 100)); // �ߺ�!

		// ��ȭ��ȣ�� �̸��� ������ ���ü�� �Ǵ��ϱ�
		System.out.println("�� ��ü�� ��: " + shopSet.size());
		
		// ��ü ����ϱ�
		Iterator<Shop> shopList = shopSet.iterator();
		System.out.print("�� ���: " );
		while (shopList.hasNext()) {
			Shop shopAddr = shopList.next();
			System.out.print(shopAddr.getCustName() + " ");
			
		}
		
		System.out.println(" ");
		System.out.println("---------------------------");
		//�̸��� ��ȭ��ȣ�� ���� ���� ����Ʈ�� ���
		String searchName = "���ູ";
		String searchPhone = "4567";
		
		shopList = shopSet.iterator();
		// boolean searchOk = false;
		while (shopList.hasNext()) {
			Shop shopAddr = shopList.next();
			if (shopAddr.getCustName().equals(searchName) && shopAddr.getCustPhone().equals(searchPhone)) {
				System.out.println(searchName + " ���� ����Ʈ: " + shopAddr.getPoint());
				// searchOk = true;
				break;
			}
		}
		// if(!searchOk) System.out.println(searchName + "���� �����ϴ�.");

	}

}
