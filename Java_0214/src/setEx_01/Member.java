package setEx_01;

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// �ؽ��ڵ� ������
	// name �� age ���� ������ ������ �ؽ��ڵ尡 ���ϵ�
	// �ؽ��ڵ尡 ������ equals �޼ҵ尡 ����� (������ ȣ������ �ʾƵ� Set ��ü�� ���ü�� �Ǵ��ϱ� ���� �ڵ�ȣ���)
	@Override
	public int hashCode() {

		return name.hashCode() + age;
	}

	// equals ������
	@Override
	public boolean equals(Object obj) {
		//obj : Set�� �� ��°�� ������ ��ü�� �ּҸ� ���� (ù ��°�� ���� �� X)
		if (obj instanceof Member target) {
			//Member target = (Member) obj; -> �ٿ�ĳ����
			//return target.name.equals(this.name) && target.age == this.age;
			//target.name : ���� �ڷ�, this.name �̹� ����ִ� �ڷ�
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
