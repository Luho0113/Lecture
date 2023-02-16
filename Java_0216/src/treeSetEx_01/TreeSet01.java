package treeSetEx_01;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		//TreeSet ��ü ����
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(4);
		ts.add(7);
		ts.add(4);
		ts.add(0);
		ts.add(8);
		ts.add(9);
		ts.add(2);
		
		//Ʈ���� �ߺ� ��带 ���� ����
		System.out.println("Ʈ���� ��� ����: " + ts.size()); //6
		
		//��� ��� ���
		Iterator<Integer> it = ts.iterator();
		System.out.print("iterator() Ʈ�� ��ü ���: ");
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(" ");
		System.out.print("���� for�� ���: ");
		for(Integer i : ts) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		//TreeSet �޼ҵ�
		System.out.println("���� ���� ��ü ���: " + ts.first()); //0
		System.out.println("���� ���� ��ü ���: " + ts.last()); //9
		System.out.println("�־��� ��ü(7)�� �ٷ� �Ʒ� ��ü: " + ts.lower(7)); //4
		System.out.println("�־��� ��ü(7)�� �ٷ� �� ��ü: " + ts.higher(7)); //8
		
		//���� ��ü�� �ִٸ� ����, ���ٸ� �ٷ� �Ʒ��� ��ü�� ����
		System.out.println("4�� ���� ��ü�� ����: " + ts.floor(4)); //4
		System.out.println("5�� ���� ��ü�� ����(floor): " + ts.floor(5)); //�����ϱ� 4
		
		//���� ��ü�� �ִٸ� ����, ���ٸ� �ٷ� ���� ��ü�� ����
		System.out.println("4�� ���� ��ü�� ����: " + ts.ceiling(4)); //4
		System.out.println("5�� ���� ��ü�� ����(ceiling): " + ts.ceiling(5)); //7
		
		//�������� �����ϱ�
		System.out.println("���� ���� ��ü�� ������ ����: " + ts.pollFirst()); //0
		System.out.println("���� ���� ��ü ���: " + ts.first()); //0->2
		System.err.println("���� ���� ��ü�� ������ ����: " + ts.pollLast()); //9
		
		
		
		//����
		Iterator<Integer> iterator = ts.descendingIterator();
		System.out.print("Iterator �������� ����: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.print("NavigableSet �������� ����: " + ts.descendingSet());
		System.out.println();
		
	

		NavigableSet<Integer> ns = ts.descendingSet();
		System.out.println("���ĵ� ��?: " + ns.first());
		
		
		//�־��� ��ü���� ���� ��ü���� ����
		SortedSet<Integer> s1 = ts.headSet(10);
		System.out.println("�־��� ��ü(10)���� ���� ��ü ����: " + s1);
		SortedSet<Integer> s2 = ts.tailSet(0);
		System.out.println("�־��� ��ü(0)���� ���� ��ü ����: " + s2);
		
		//���̰� ���
		SortedSet<Integer> s3 = ts.subSet(2, true, 9, true);
		System.out.println("2�̻� 9������ ��ü ����: " + s3);
		

	}

}
