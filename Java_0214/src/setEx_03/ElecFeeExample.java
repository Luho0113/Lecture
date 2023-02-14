package setEx_03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ElecFeeExample {

	public static void main(String[] args) {
		// 호수가 동일하면 동등객체로 판단하고 호수를 입력하면 전기 사용량이 나오게
		
		//생성
		Set<ElecFee> elecSet = new HashSet<ElecFee>();
		
		//추가
		elecSet.add(new ElecFee("502", 1, 423, 25000));
		elecSet.add(new ElecFee("303", 7, 724, 35000));
		elecSet.add(new ElecFee("403", 2, 222, 40000));
		elecSet.add(new ElecFee("503", 2, 438, 25000));
		elecSet.add(new ElecFee("503", 3, 171, 35000));
		
		
		System.out.println("총 객체 수: " + elecSet.size());
		
		
		Scanner sc = new Scanner(System.in);
		String search;
		//호수를 입력하면 전기사용량 출력
		Iterator<ElecFee> elecList = elecSet.iterator();
		System.out.print("호수 입력 > ");
		String searchHouse = sc.nextLine();
		
		while(elecList.hasNext()) {
			ElecFee elecAddr = elecList.next();
			if (elecAddr.getHouseNum().equals(searchHouse)) {
				System.out.println(searchHouse + "호의 전기 사용량: " + elecAddr.getElecUse());
				break;
			} 
		}
		
		
		System.out.println(" ");
		System.out.println("----------------------------");
		//전기 사용량이 가장 많은 가구를 찾고 호수와 가족수를 출력
		elecList = elecSet.iterator(); 
		int max = 0; //최대 사용량을 담을 변수
		ElecFee maxAddr = null; //전기 사용량이 제일 큰 객체의 주소
		while(elecList.hasNext()) {
			ElecFee elecAddr = elecList.next();
			
			if (max < elecAddr.getElecUse()) {
				max = elecAddr.getElecUse();
				maxAddr = elecAddr; //max의 객체 주소를 넣어줌
				
			} 
			
		}
		System.out.println("최대 전기사용량 호수: " + maxAddr.getHouseNum());
		System.out.println(maxAddr.getHouseNum()+ "의 가족수: " + maxAddr.getFamilyNum());
		
		
		
		System.out.println(" ");
		System.out.println("----------------------------");
		//공동요금이 제일 적은 호수를 찾고 500원 추가
		elecList = elecSet.iterator(); 
		int min = Integer.MAX_VALUE;
		ElecFee[] minAddr = new ElecFee[10]; //주소를 담을 배열을 생성
		int index = 0; //관리비 배열의 인덱스 변수
		
		while(elecList.hasNext()) {
			ElecFee elecAddr = elecList.next();
			
			if (min > elecAddr.getElecFee()) {
				min = elecAddr.getElecFee();
				minAddr[index] = elecAddr; //minAddr[0]에 min이 들어감
			} else if (min == elecAddr.getElecFee()) { //요금이 같다면!!
				index++; //minAddr[1]로 늘리고
				minAddr[index] = elecAddr; //1번에 주소를 넣음
			}
		}
		//500원 추가
		for (int i =0; i<minAddr.length; i++) {
			if(minAddr[i]==null) break;
			else {
				minAddr[i].setElecFee(minAddr[i].getElecFee() + 500);
			}
		}
		
		System.out.println("최소 전기사용량 호수: " + minAddr[index].getHouseNum());
		System.out.println(minAddr[index].getHouseNum() + "의 요금: " + minAddr[index].getElecFee());
		
		

		
		
		
		System.out.println(" ");
		System.out.println("----------------------------");
		//전기 사용량의 평균, 공동요금의 평균을 구해서 전체 출력에 추가
		elecList = elecSet.iterator(); 
		int sumElecUse = 0;
		int sumElecFee = 0;
		
		while(elecList.hasNext()) {
			ElecFee elecAddr = elecList.next();
			sumElecUse += elecAddr.getElecUse();
			sumElecFee += elecAddr.getElecFee(); 
		}
		System.out.println("전체 전기사용량의 평균: " + (sumElecUse)/elecSet.size());
		System.out.println("전체 공동요금의 평균: " + (sumElecFee)/elecSet.size());
		

		
		
		

	}

}
