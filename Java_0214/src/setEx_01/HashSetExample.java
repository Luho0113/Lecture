package setEx_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet �÷��� ����
		Set<Member> member = new HashSet<Member>();

		// Member ��ü ����
		member.add(new Member("ȫ�浿", 30));
		// �Ʒ� ȫ�浿�̶� ��ü ������ �ּҰ� �ٸ� -> ��ǻ�ʹ� �ٸ� ��ü�� �ν���
		// �̸��� ���̰� ������ ���� ��ü��� �����������
		member.add(new Member("ȫ�浿", 30)); //���̰� ���� ������ equals()���� �ɷ���
		member.add(new Member("�̼���", 25)); 
		member.add(new Member("�̼���", 35)); //���̰� �ٸ��� ������ �ٸ� ��ü�� �Ǵ�!
		

		// ����� ��ü �� ���
		System.out.println("�� ��ü ��: " + member.size());

		Iterator<Member> it = member.iterator();

		while (it.hasNext()) {
			Member memberAddr = it.next(); // �ּҸ� ������ ����
			System.out.println(memberAddr.getName() + " " + memberAddr.getAge());
		}
		
		
		
		System.out.println("---------------------------------");
		Set<Animal> animal = new HashSet<Animal>();
		animal.add(new Animal("������", 20));
		animal.add(new Animal("������", 20));
		animal.add(new Animal("�����", 20));
		
		System.out.println("�� ��ü ��: " + animal.size());
		Iterator<Animal> animalList = animal.iterator();

		while (animalList.hasNext()) {
			Animal animalAddr = animalList.next(); // �ּҸ� ������ ����
			System.out.println(animalAddr.getAnimalName() + " " + animalAddr.getLife());
		}
		

	}

}
