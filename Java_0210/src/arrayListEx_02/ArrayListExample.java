package arrayListEx_02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// �÷��� ����
		List<Board> list = new ArrayList<>();

		// ��ü �߰�
		// new Board�� ��ü�� �����ϰ� �� �ּҸ� add�� ���� list�� �߰���
		list.add(new Board("����1", "����1", "�۾���1", "2�� 10��")); // 0��
		list.add(new Board("����2", "����2", "�۾���2", "2�� 1��")); // 1��
		list.add(new Board("����3", "����3", "�۾���3", "2�� 5��")); // 2��

		int size = list.size();
		System.out.println("�� ��ü �� : " + size);
		System.out.println("-----------------------------");

		// Ư�� �ʵ常 ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSubject());
			// list.get(i) > �ּҰ� ��µ�
		}
		System.out.println("-----------------------------");
		System.out.println();

		// Ư�� �ε����� ��ü ��������
		Board board = list.get(2);
		System.out.println("2�� �ε��� ���!");
		System.out.println(
				board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter() + "\t" + board.getJoindate());
		System.out.println("-----------------------------");
		System.out.println();

		// ��� ��ü ��������
		System.out.println("��� ��ü ���!");
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);

			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter() + "\t" + b.getJoindate());
		}
		System.out.println("-----------------------------");
		System.out.println();

		// ���� for������ ��� ��ü �ϳ��� ��������
		System.out.println("���� for������ ����ϱ�");
		for (Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getSubject() + "\t" + b.getWriter() + "\t" + b.getJoindate());
		}
		System.out.println("-----------------------------");
		System.out.println();

		// �Խ��� ���� "����2"��� ���� �� ����� �̸��� �ۼ����� �˻�
		System.out.println("1) ����2 �ۼ��� ���?");
		System.out.println("�ۼ���: " + list.get(1).getWriter() + " / �ۼ���: " + list.get(1).getJoindate());
		System.out.println("-----------------------------");
		System.out.println();

		// �Ǵ�
		System.out.println("2) ����2 �ۼ��� ���? ");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSubject().equals("����2")) {
				System.out.println(list.get(i).getWriter() + " / " + list.get(i).getJoindate());
			}
		}
		System.out.println("-----------------------------");
		System.out.println();

		// �ۼ����� 2�� 10���� �Խñ��� ����� ������ ���
		System.out.println("3) 2�� 10�Ͽ� �ۼ��� �Խñ��� ����� ������?");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getJoindate().contains("2�� 10��")) {
				System.out.println(list.get(i).getSubject() + " / " + list.get(i).getContent());
			}
		}

	}

}
