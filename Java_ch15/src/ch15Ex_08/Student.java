package ch15Ex_08;

public class Student {
	
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	//학번이 같으면 동일객체로 판단하고 중복 저장X
	@Override
	public int hashCode() {
		//Integer i = Integer.valueOf(studentNum);
		//return i.hashCode(); -> int를 Integer로 바꿀 수 있음
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			//Student target = (Student) obj;
			return target.studentNum == studentNum;
		} else {
			return false;
		}
		
//		if(!(obj instanceof Student)) return false;
//		Student student = (Student) obj;
//		if(studentNum != student.studentNum) return false;
//		return true;
	}
}
