package streamEx_01;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		//���͸�
		
		List<String> list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("�ſ��");
		list.add("�Ź�ö");
		
		//�ߺ� ��� �����ϱ�
		System.out.print("�ߺ� ��� ���� : ");
		list.stream().distinct().forEach(
				n -> System.out.print(n + " ")
		);
		System.out.println();
		
		//������ �����ϴ� ��Ҹ� ���͸�
		//startWith() : �־��� ���ڿ��� �����ϸ� true ����
		System.out.print("������ �����ϴ� ��� : ");
		list.stream().filter(n->n.startsWith("��")).forEach(n->System.out.print(n + " "));
		System.out.println();
		
		//�ߺ� ��Ҹ� ���� �����ϰ� ������ �����ϴ� ��Ҹ� ���͸�
		System.out.print("�ߺ� ���� + ������ �����ϴ� ��� : ");
		list.stream().distinct().filter(n->n.startsWith("��")).forEach(n->System.out.print(n + " "));

	}

}
