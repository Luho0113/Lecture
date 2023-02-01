package polymoEx_04;

public class InstanceofExample {
	//교재 p.321
	public static void personInfo(Person person) {
		//메인에서 바로 호출하기 위한 정적 메소드 선언
		System.out.println("name: " + person.name);
		person.walk();
		
		
		//person이 참조하는 객체가 Student 타입일 경우
		//student 변수에 대입(타입 변환 발생)
		if (person instanceof Student student) { //Java12부터 사용가능
			//person객체의 주소가 Sudent 클래스를 가르치면 true를 산출
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
		
		//또는
		if(person instanceof Student) {
			//person의 객체 주소가 Student 클래스를 가르치면 true 산출
			Student s = (Student) person;
			System.out.println("다운 캐스팅: " + s.studentNo);
			s.study();
			
		}
	}
	
	

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1); //Person의 주소를 받아감
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10); //자식 클래스의 객체 생성 -> 부모 타입으로 받음
		personInfo(p2);
	}

}
