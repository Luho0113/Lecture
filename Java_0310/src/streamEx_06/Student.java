package streamEx_06;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	//score�� o.score�� ���� ��� 0����, ���� ��� ���� ����, Ŭ ��� ��� ����
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
		//name.compareTo(o.name); //�̸� ������ �����ϱ�(��������)
	}
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	

}
