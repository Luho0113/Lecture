package comparatorEx_01;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// treeset 생성
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
		//메소드를 재정의한 비교자를 제공
		
		//객체 저장
		treeSet.add(new Fruit("포도", 3000)); //Comparable 비구현 객체를 저장
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		treeSet.add(new Fruit("배", 3000)); //같은 가격이라 생략됨
		treeSet.add(new Fruit("샤인머스캣", 8000));
		
		//객체 가져오기
		for(Fruit fruit : treeSet) {
			System.out.println(fruit.name + " : " + fruit.price);
		}

	}

}
