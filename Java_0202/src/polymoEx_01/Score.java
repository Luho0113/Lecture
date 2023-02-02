package polymoEx_01;

public class Score {
	//부모클래스
	//필드 설정
	private String subject; //과목명
	private int score; //점수
	private int midExam; //중간고사
	private int finalExam; //기말고사
	private int perEvalution; //수행평가
	
	//성적을 출력하는 메소드
	void printAll() {
		
	}
	
	
	//settergetter
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getMidExam() {
		return midExam;
	}
	public void setMidExam(int midExam) {
		this.midExam = midExam;
	}
	public int getFinalExam() {
		return finalExam;
	}
	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}
	public int getPerEvalution() {
		return perEvalution;
	}
	public void setPerEvalution(int perEvalution) {
		this.perEvalution = perEvalution;
	}
	
	

}
