package comparatorEx_04;

public class Department {
	//�μ���, �ҼӺ��� Ŭ����
	private String departmentName; // �μ���
	private String central; //���� �Ҽ�
	
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

