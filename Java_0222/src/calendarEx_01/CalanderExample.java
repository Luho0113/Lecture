package calendarEx_01;

import java.util.Calendar;
import java.util.TimeZone;

public class CalanderExample {

	public static void main(String[] args) {
		// 캘린더 클래스
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH); //1월부터 나옴
		int day = now.get(Calendar.DATE);
		
		System.out.println(year + "년 " + (month+1) + "월 " + day + "일");
		
		int day2 = now.get(Calendar.DAY_OF_MONTH); //일을 리턴
		int week = now.get(Calendar.DAY_OF_WEEK); //요일에 해당하는 상수를 리턴(일요일=1~)
		
		
		
		String strWeek = null;
		switch(week) {
			case 1: strWeek = "일요일"; break;
			case 2: strWeek = "월요일"; break;
			case 3: strWeek = "화요일"; break;
			case 4: strWeek = "수요일"; break;
			case 5: strWeek = "목요일"; break;
			case 6: strWeek = "금요일"; break;
			case 7: strWeek = "토요일"; break;
			
		}
		
		System.out.println(day2 + "일 / " + strWeek + "(상수는 " + week + "임)");
		
		//타임존
		TimeZone koreaTime = TimeZone.getTimeZone("Asia/Seoul");
		TimeZone americaTime = TimeZone.getTimeZone("America/Los_Angeles");
		TimeZone japanTime = TimeZone.getTimeZone("Asia/Tokyo");
		
		Calendar k = Calendar.getInstance(koreaTime);
		Calendar a = Calendar.getInstance(americaTime);
		Calendar j = Calendar.getInstance(japanTime);
		
		int khour = k.get(Calendar.HOUR);
		int kmin = k.get(Calendar.MINUTE);
		
		int ahour = a.get(Calendar.HOUR);
		int amin = a.get(Calendar.MINUTE);
		
		int jhour = j.get(Calendar.HOUR);
		int jmin = j.get(Calendar.MINUTE);
		
		System.out.println("한국 : " + khour + "시 " + kmin + "분");
		System.out.println("미국 : " + ahour + "시 " + amin + "분");
		System.out.println("일본 : " + jhour + "시 " + jmin + "분");
		
		//사용가능한 타임존
		//String[] avaiId = TimeZone.getAvailableIDs();
		//for (String s : avaiId) {
		//	System.out.println(s);
		//}
		

	}

}
