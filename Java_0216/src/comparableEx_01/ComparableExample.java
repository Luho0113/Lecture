package comparableEx_01;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// treeset ����
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));
		
		System.out.println("����1 > ");
		for(Person person : treeSet) {
			System.out.println(person.name + " : " + person.age);
		}
		
		System.out.println("����2 > ");
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.name + " : " + p.age);
		}
		
		
/*		TreeSet<Person> treeSet2 = new TreeSet<Person>();
		treeSet2.add(new Person("ȫ�浿", 45, 1.1));
		treeSet2.add(new Person("���ڹ�", 25, 2.2));
		treeSet2.add(new Person("������", 31, 3.3));
		
		System.out.println("���� > ");
		for(Person person : treeSet2) {
			System.out.println(person.name + " : " + person.age + " / " + person.score);
		} */

	}

}
