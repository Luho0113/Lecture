package ch15Ex_10;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// last() 메소드를 호출했을 때 가장 높은 score의 Student 객체가 리턴되도록
		
		TreeSet<Student> treeSet = new TreeSet<Student>();
		
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		Student student = treeSet.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);

	}

}
