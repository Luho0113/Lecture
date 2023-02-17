package comparatorEx_04;

import java.util.Set;
import java.util.TreeMap;

public class BusinessExample {

	public static void main(String[] args) {
		// TreeMap
		TreeMap<Department, Business> saleMap = new TreeMap<Department, Business>(new BusinessComparator());
		

		//엔트리 저장
		saleMap.put( new Department("강북영업", "서울본부"), new Business("서울본부", "백화점", 4460));
		saleMap.put( new Department("강서영업", "서울본부"), new Business("서울본부", "쇼핑몰", 6800));
		saleMap.put( new Department("강납영업", "서울본부"), new Business("서울본부", "백화점", 5580));
		saleMap.put( new Department("강동영업", "서울본부"), new Business("서울본부", "쇼핑몰", 3560));
		
		
		//전체 출력
		Set<Department> keySet = saleMap.keySet();
		
		for(Department d : keySet) {
			System.out.println(d.getDepartmentName() + " - " + d.getCentral() + " / " + saleMap.get(d).getStoreLocation() + " / " +  saleMap.get(d).getSales());
		}
		
		//강북영업을 입력하면 매장위치와 소속을 출력
		
		
		//모든 영업소의 판매실적의 합계
		
		
		//판매실적이 가장 높은 영업소 출력

	}

}
