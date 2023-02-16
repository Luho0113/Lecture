package comparableEx_01;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// treeset 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		System.out.println("정렬1 > ");
		for(Person person : treeSet) {
			System.out.println(person.name + " : " + person.age);
		}
		
		System.out.println("정렬2 > ");
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.name + " : " + p.age);
		}
		
		
/*		TreeSet<Person> treeSet2 = new TreeSet<Person>();
		treeSet2.add(new Person("홍길동", 45, 1.1));
		treeSet2.add(new Person("감자바", 25, 2.2));
		treeSet2.add(new Person("박지원", 31, 3.3));
		
		System.out.println("정렬 > ");
		for(Person person : treeSet2) {
			System.out.println(person.name + " : " + person.age + " / " + person.score);
		} */

	}

}
