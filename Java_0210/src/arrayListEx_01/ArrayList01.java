package arrayListEx_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// ���ڿ� ����Ʈ �����

		List<String> list1 = new ArrayList<String>();
		// <String> Ÿ���� ��ü�� ���� ��

		list1.add("ȫ�浿"); // 0��
		list1.add("�̼���"); // 1��
		list1.add("������"); // 2��

		list1.add(1, "�ֿ�"); // 1�� �ڸ��� �߰�
		// �ֿ� > �̼��� > ������ ������ ������ �з���

		// �ش� �ε������� �����͸� ������ ���
		System.out.println(list1.get(0));

		// �ݺ������� ������
		System.out.println("--------------------------");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		// �׸� �˻�
		System.out.println("--------------------------");
		System.out.println("ȫ�浿�� �ֽ��ϱ�? > " + list1.contains("ȫ�浿"));

		// �ֿ�(1) �����ϱ�
		System.out.println("--------------------------");
		System.out.println("<�׸� ����>");
		list1.remove(1); // �ε��� ��ȣ�� �����ϱ�
		// �Ǵ� list1.remove("�ֿ�"); -> ��ü�� ���� ������ �� ����
		list1.remove(2); // ������ ����

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		// ���� ����
		System.out.println("--------------------------");
		list1.clear(); // ��� ��ü�� ����
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.err.println("��� �����߽��ϴ�.");
		System.out.println("����Ʈ�� ����ֽ��ϱ�? > " + list1.isEmpty());

	}

}
