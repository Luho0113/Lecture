package streamEx_08;

public class Student {

	private String name;
	private int score;
	private String gender;

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public String getGender() {
		return gender;
	}
	
}
