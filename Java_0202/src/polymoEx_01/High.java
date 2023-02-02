package polymoEx_01;

public class High extends Middle{
	//자식클래스: 고등학생
	
	private double standardDevi; //표준편차
	
	@Override
	void printAll() {
		System.out.println("---------------------");
		System.out.println("고등학교 성적 출력");
		System.out.println("---------------------");
		
		System.out.println("과목명: " + getSubject());
		System.out.println("담당교사: " + getTeacher());
		System.out.println("중간고사: " + getMidExam() + " / " + "기말고사: " + getFinalExam());
		System.out.println("수행평가: " + getPerEvalution());
		System.out.println("출석: " + getAttendance());
		System.out.println("봉사: " + getVolunteer());
		System.out.println(">> 이번 학기 점수: " + getScore() + " / 표준편차: " + getStandardDevi());
	}
	
	@Override
	public String toString() {
		return "고등학생";
	}

	
	
	//settergetter
	public double getStandardDevi() {
		return standardDevi;
	}

	public void setStandardDevi(double standardDevi) {
		this.standardDevi = standardDevi;
	}
	
	
}
