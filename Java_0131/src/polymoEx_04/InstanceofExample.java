package polymoEx_04;

public class InstanceofExample {
	//���� p.321
	public static void personInfo(Person person) {
		//���ο��� �ٷ� ȣ���ϱ� ���� ���� �޼ҵ� ����
		System.out.println("name: " + person.name);
		person.walk();
		
		
		//person�� �����ϴ� ��ü�� Student Ÿ���� ���
		//student ������ ����(Ÿ�� ��ȯ �߻�)
		if (person instanceof Student student) { //Java12���� ��밡��
			//person��ü�� �ּҰ� Sudent Ŭ������ ����ġ�� true�� ����
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
		
		//�Ǵ�
		if(person instanceof Student) {
			//person�� ��ü �ּҰ� Student Ŭ������ ����ġ�� true ����
			Student s = (Student) person;
			System.out.println("�ٿ� ĳ����: " + s.studentNo);
			s.study();
			
		}
	}
	
	

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		personInfo(p1); //Person�� �ּҸ� �޾ư�
		
		System.out.println();
		
		Person p2 = new Student("��浿", 10); //�ڽ� Ŭ������ ��ü ���� -> �θ� Ÿ������ ����
		personInfo(p2);
	}

}
