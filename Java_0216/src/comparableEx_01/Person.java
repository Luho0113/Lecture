package comparableEx_01;

public class Person implements Comparable<Person>{
	public String name;
	public int age; //기본 자료형
	public Double score; //클래스 자료형
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, Double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	//Comparable의 추상 메소드
	@Override
	public int compareTo(Person o) {
		//if(age < o.age) return -1;
		//else if(age == o.age) return 0;
		//else return 1;
		
		//나이 역순 출력
		if (o.age < age) return -1;
		else if(o.age == age) return 0;
		else return 1;

		//이름으로 비교하고 싶을 때
		//return name.compareTo(o.name);
		//String 클래스로 가서 compareTo 메소드를 실행함
		
		//이름을 역순으로 비교하고 싶을 때
		//return o.name.compareTo(name);
		
		//점수 순서대로 정렬
		// return score.compareTo(o.score);
	}
	
	
}
