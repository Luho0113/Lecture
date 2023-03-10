package streamEx_06;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	//score와 o.score이 같을 경우 0리턴, 작을 경우 음수 리턴, 클 경우 양수 리턴
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
		//name.compareTo(o.name); //이름 순으로 정렬하기(오름차순)
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
