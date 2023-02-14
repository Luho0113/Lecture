package setEx_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<Member> member = new HashSet<Member>();

		// Member 객체 저장
		member.add(new Member("홍길동", 30));
		// 아래 홍길동이랑 객체 생성된 주소가 다름 -> 컴퓨터는 다른 객체로 인식함
		// 이름과 나이가 같으면 같은 객체라고 정의해줘야함
		member.add(new Member("홍길동", 30)); //나이가 같기 때문에 equals()에서 걸러짐
		member.add(new Member("이순신", 25)); 
		member.add(new Member("이순신", 35)); //나이가 다르기 때문에 다른 객체로 판단!
		

		// 저장된 객체 수 출력
		System.out.println("총 객체 수: " + member.size());

		Iterator<Member> it = member.iterator();

		while (it.hasNext()) {
			Member memberAddr = it.next(); // 주소를 변수에 담음
			System.out.println(memberAddr.getName() + " " + memberAddr.getAge());
		}
		
		
		
		System.out.println("---------------------------------");
		Set<Animal> animal = new HashSet<Animal>();
		animal.add(new Animal("강아지", 20));
		animal.add(new Animal("강아지", 20));
		animal.add(new Animal("고양이", 20));
		
		System.out.println("총 객체 수: " + animal.size());
		Iterator<Animal> animalList = animal.iterator();

		while (animalList.hasNext()) {
			Animal animalAddr = animalList.next(); // 주소를 변수에 담음
			System.out.println(animalAddr.getAnimalName() + " " + animalAddr.getLife());
		}
		

	}

}
