package polymoEx_01;

public class Middle extends Score {
	//자식클래스: 중학생
	
	private String teacher; //담당교사명
	private int attendance; //출석점수
	private int volunteer; //봉사점수
	
	@Override
	void printAll() {
		System.out.println("---------------------");
		System.out.println("중학교 성적 출력");
		System.out.println("---------------------");
		
		System.out.println("과목명: " + getSubject());
		System.out.println("담당교사: " + getTeacher());
		System.out.println("중간고사: " + getMidExam() + " / " + "기말고사: " + getFinalExam());
		System.out.println("수행평가: " + getPerEvalution());
		System.out.println("출석: " + getAttendance());
		System.out.println("봉사: " + getVolunteer());
		System.out.println(">> 이번 학기 점수: " + getScore());
	}
	
	@Override
	public String toString() {
		return "중학생";
	}


	
	
	//settergetter
	public String getTeacher() {
		return teacher;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	public int getAttendance() {
		return attendance;
	}


	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}


	public int getVolunteer() {
		return volunteer;
	}


	public void setVolunteer(int volunteer) {
		this.volunteer = volunteer;
	}
	
	
}
