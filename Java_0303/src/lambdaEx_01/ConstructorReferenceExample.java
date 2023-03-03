package lambdaEx_01;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		//��ü ����
		Person person = new Person();
		
		
		//�͸��� ���� Ŭ������ �������� 
		Member m1 = person.getMember1(new Creatable1() {
			@Override
			public Member create(String id) {
				
				return new Member(id);
			}
		});
		
		//���ٽ� 1�� (Ÿ�԰� return ���� ����)
		Member ml1 = person.getMember1( (String id) -> { return new Member(id); } );
		System.out.println();
		
		//���ٽ� 2�� : ������ ���� ( Ŭ������ :: new )
		Member ml2 = person.getMember1(Member::new);
		System.out.println(ml2);
		System.out.println();
		
		Member ml3 = person.getMember2(Member::new);
		System.out.println(ml3);
		

	}

}
