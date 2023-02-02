package polymoEx_01;

public class Elementary extends Score {
	//자식클래스: 초등학생
	
	@Override
	void printAll() {
		System.out.println("---------------------");
		System.out.println("초등학교 성적 출력");
		System.out.println("---------------------");
		
		System.out.println("과목명: " + getSubject());
		System.out.println("중간고사: " + getMidExam() + " / " + "기말고사: " + getFinalExam());
		System.out.println("수행평가: " + getPerEvalution());
		System.out.println(">> 이번 학기 점수: " + getScore());
	}
	
	@Override
	public String toString() {
		return "초등학생";
	}

}
