package lambdaEx_01;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		//객체 생성
		Person person = new Person();
		
		
		//익명형 구현 클래스의 참조변수 
		Member m1 = person.getMember1(new Creatable1() {
			@Override
			public Member create(String id) {
				
				return new Member(id);
			}
		});
		
		//람다식 1번 (타입과 return 생략 가능)
		Member ml1 = person.getMember1( (String id) -> { return new Member(id); } );
		System.out.println();
		
		//람다식 2번 : 생성자 참조 ( 클래스명 :: new )
		Member ml2 = person.getMember1(Member::new);
		System.out.println(ml2);
		System.out.println();
		
		Member ml3 = person.getMember2(Member::new);
		System.out.println(ml3);
		

	}

}
