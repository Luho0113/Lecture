package setEx_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ShopExample {

	public static void main(String[] args) {
		// 컬렉션 생성
		Set<Shop> shopSet = new HashSet<Shop>();

		shopSet.add(new Shop("이기쁨", "1234", 100));
		shopSet.add(new Shop("김행복", "4567", 90));
		shopSet.add(new Shop("박평화", "1234", 100));
		shopSet.add(new Shop("최기쁨", "1234", 100));
		shopSet.add(new Shop("정기쁨", "1234", 100));
		shopSet.add(new Shop("이기쁨", "1234", 100)); // 중복!

		// 전화번호와 이름이 같으면 동등객체로 판단하기
		System.out.println("총 객체의 수: " + shopSet.size());
		
		// 전체 출력하기
		Iterator<Shop> shopList = shopSet.iterator();
		System.out.print("고객 명단: " );
		while (shopList.hasNext()) {
			Shop shopAddr = shopList.next();
			System.out.print(shopAddr.getCustName() + " ");
			
		}
		
		System.out.println(" ");
		System.out.println("---------------------------");
		//이름과 전화번호가 같은 고객의 포인트를 출력
		String searchName = "김행복";
		String searchPhone = "4567";
		
		shopList = shopSet.iterator();
		// boolean searchOk = false;
		while (shopList.hasNext()) {
			Shop shopAddr = shopList.next();
			if (shopAddr.getCustName().equals(searchName) && shopAddr.getCustPhone().equals(searchPhone)) {
				System.out.println(searchName + " 고객의 포인트: " + shopAddr.getPoint());
				// searchOk = true;
				break;
			}
		}
		// if(!searchOk) System.out.println(searchName + "고객이 없습니다.");

	}

}
