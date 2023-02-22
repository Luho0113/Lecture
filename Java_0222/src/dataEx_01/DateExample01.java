package dataEx_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample01 {

	public static void main(String[] args) {
		// 날짜와 시간
		
		Date date = new Date();
		System.out.println(date.getDate()); //날짜
		System.out.println(date.getDay()); //월?
		System.out.println(date); 
		
		//SimpleDateFormat 클래스 : 원하는 문자열 형태로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strDate = sdf.format(date);
		System.out.println(strDate);
		

	}

}
