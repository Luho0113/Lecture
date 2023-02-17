package comparatorEx_01;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// treeset ����
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
		//�޼ҵ带 �������� ���ڸ� ����
		
		//��ü ����
		treeSet.add(new Fruit("����", 3000)); //Comparable ���� ��ü�� ����
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 6000));
		treeSet.add(new Fruit("��", 3000)); //���� �����̶� ������
		treeSet.add(new Fruit("���θӽ�Ĺ", 8000));
		
		//��ü ��������
		for(Fruit fruit : treeSet) {
			System.out.println(fruit.name + " : " + fruit.price);
		}

	}

}
