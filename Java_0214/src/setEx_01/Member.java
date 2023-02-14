package setEx_01;

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 해시코드 재정의
	// name 과 age 값이 같으면 동일한 해시코드가 리턴됨
	// 해시코드가 같으면 equals 메소드가 실행됨 (별도로 호출하지 않아도 Set 객체가 동등객체를 판단하기 위해 자동호출됨)
	@Override
	public int hashCode() {

		return name.hashCode() + age;
	}

	// equals 재정의
	@Override
	public boolean equals(Object obj) {
		//obj : Set에 두 번째로 들어오는 객체의 주소를 담음 (첫 번째는 굳이 비교 X)
		if (obj instanceof Member target) {
			//Member target = (Member) obj; -> 다운캐스팅
			//return target.name.equals(this.name) && target.age == this.age;
			//target.name : 들어올 자료, this.name 이미 들어있는 자료
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
