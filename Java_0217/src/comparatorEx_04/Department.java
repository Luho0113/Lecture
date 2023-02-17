package comparatorEx_04;

public class Department {
	//부서명, 소속본부 클래스
	private String departmentName; // 부서명
	private String central; //본부 소속
	
	public Department(String departmentName, String central) {
		super();
		this.departmentName = departmentName;
		this.central = central;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getCentral() {
		return central;
	}
	public void setCentral(String central) {
		this.central = central;
	}

	
}

