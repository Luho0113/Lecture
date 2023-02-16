package treeSetEx_02;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class BasicSalary {

	public static void main(String[] args) {
		//Ʈ�� ����
		TreeSet<Integer> bs = new TreeSet<>();
		TreeSet<String> rank = new TreeSet<>();
		
		//�⺻ �ݾ�
		bs.add(3500000);
		bs.add(2150000);
		bs.add(2200000);
		bs.add(2700000);
		bs.add(2750000);
		
		//���� (���ٳ������� ���ĵ�)
		rank.add("����"); 
		rank.add("�븮"); 
		rank.add("����"); 
		rank.add("���"); 
		
		
		
		
		//���� ���� �ݾ�
		System.out.println("���� ���� �ݾ�: " + bs.last());
		
		//���� ���� �ݾ�
		System.out.println("���� ���� �ݾ�: " + bs.first());
		
		//�⺻�� ��������
		System.out.print("�������� ����: ");
		for(Integer i : bs) {
			System.out.print(i + " ");
		}
		System.out.println();
		// = System.out.println(rank);
		
		
		//�⺻�� ��������
		System.out.println("�������� ���� 1): " + bs.descendingSet());
		System.out.print("�������� ���� 2): ");
		Iterator<Integer> it = bs.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
		//���̰�
		NavigableSet<Integer> rangeSet = bs.subSet(2500000, true, 3500000, true);
		System.out.print("250���� �̻� 350���� ���� : ");
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		System.out.println("--------------------------------");
		//������ ������?
		System.out.println("������ ����: " + rank.size());
		
		// ���� �ٷ� �Ʒ�
		System.out.println("���� �Ʒ� ����: " + rank.lower("����")); // ���

		// �븮 �ٷ� ��
		System.out.println("�븮 �� ����: " + rank.higher("�븮")); // ����
		
		
		//�������� ����
		System.out.print("�������� ����: ");
		for(String r : rank) {
			System.out.print(r + " ");
		}
		System.out.println();
		
		
		
		//�������� ����
		System.out.println("�������� ���� 1): " + rank.descendingSet());
		System.out.print("�������� ���� 2): ");
		Iterator<String> rankIt = rank.descendingIterator();
		while(rankIt.hasNext()) {
			System.out.print(rankIt.next() + " ");
		}
		System.out.println();
		
		
		
		

	}

}
