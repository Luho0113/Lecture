package comparatorEx_04;

import java.util.Comparator;

public class BusinessComparator implements Comparator<Department>{
	//����, ������ ���� = �μ���
	@Override
	public int compare(Department o1, Department o2) {
		
		return o1.getDepartmentName().compareTo(o2.getDepartmentName());
	}

}
