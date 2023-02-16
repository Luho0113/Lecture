package comparableEx_01;

public class Person implements Comparable<Person>{
	public String name;
	public int age; //�⺻ �ڷ���
	public Double score; //Ŭ���� �ڷ���
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, Double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	//Comparable�� �߻� �޼ҵ�
	@Override
	public int compareTo(Person o) {
		//if(age < o.age) return -1;
		//else if(age == o.age) return 0;
		//else return 1;
		
		//���� ���� ���
		if (o.age < age) return -1;
		else if(o.age == age) return 0;
		else return 1;

		//�̸����� ���ϰ� ���� ��
		//return name.compareTo(o.name);
		//String Ŭ������ ���� compareTo �޼ҵ带 ������
		
		//�̸��� �������� ���ϰ� ���� ��
		//return o.name.compareTo(name);
		
		//���� ������� ����
		// return score.compareTo(o.score);
	}
	
	
}
