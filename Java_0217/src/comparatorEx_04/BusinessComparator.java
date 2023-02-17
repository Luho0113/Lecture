package comparatorEx_04;

import java.util.Comparator;

public class BusinessComparator implements Comparator<Department>{
	//비교자, 정렬의 기준 = 부서명
	@Override
	public int compare(Department o1, Department o2) {
		
		return o1.getDepartmentName().compareTo(o2.getDepartmentName());
	}

}
