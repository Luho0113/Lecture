package arrayListEx_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// ���� ����Ʈ �����

		List<Integer> list2 = new ArrayList<Integer>();

		// 1~10���� �׸� �߰�
		for (int i = 1; i <= 10; i++) {
			list2.add(i);
		}

		System.out.println("1���� 10���� ���");
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		System.out.println();

		// 5�� �ε��� ��ġ�� 50���� ��ü�ϱ�
		System.out.println("------------------------");
		System.out.println("5���� 50�߰��ϱ�");
		list2.set(5, 50);
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}

	}

}
