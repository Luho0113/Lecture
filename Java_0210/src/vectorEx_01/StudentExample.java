package vectorEx_01;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class StudentExample {

	public static void main(String[] args) {
		// ������ ���α׷����� �̿�Ǵ� ArrayList�� ������ ������ �÷���

		List<Student> vlist = new Vector<Student>();

		vlist.add(new Student("ȫ�浿1", 100));
		vlist.add(new Student("ȫ�浿2", 80));
		vlist.add(new Student("ȫ�浿3", 90));
		vlist.add(new Student("ȫ�浿4", 100));

		// iterator : �׸���� �ϳ��� �������ִ� �ݺ���
		Iterator<Student> it = vlist.iterator();

		// hasNext : ����Ʈ �ȿ� ���� �׸��� ������ true ����
		while (it.hasNext()) {
			Student st = it.next(); // next() : Student�� ù��° �ε����� �ּ� > st�� ����
			System.out.println(st);
		}
		// ù ��° �׸��� ����ٰ� �ִ� ���
		// �� ����ϰ� ���� �����ִ� �׸��� ��� �� while���� ���� �� ���� (exception �߻�)
		// 4�� �ֳ� > 3�� �ֳ� > 2�� �ֳ� > 1�� �ֳ� > 0�� > false!

		// 2�� �ε��� �����ϱ�
		System.out.println("------------------------------------");
		System.out.println("2�� �ε��� ����");
		vlist.remove(2);

		it = vlist.iterator();
		while (it.hasNext()) {
			Student st = it.next(); // next() : Student�� ù��° �ε����� �ּ� > st�� ����
			System.out.println(st);
		}

		System.out.println("------------------------------------");
		System.out.println("isEmpty�� Ȯ��");
		boolean isE = vlist.isEmpty();
		if (isE) {
			System.out.println("�ƹ� �͵� �����ϴ�.");
		} else {
			System.out.println("�׸��� �ֽ��ϴ�.");
		}

	}

}
