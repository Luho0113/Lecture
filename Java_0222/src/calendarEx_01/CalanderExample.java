package calendarEx_01;

import java.util.Calendar;
import java.util.TimeZone;

public class CalanderExample {

	public static void main(String[] args) {
		// Ķ���� Ŭ����
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH); //1������ ����
		int day = now.get(Calendar.DATE);
		
		System.out.println(year + "�� " + (month+1) + "�� " + day + "��");
		
		int day2 = now.get(Calendar.DAY_OF_MONTH); //���� ����
		int week = now.get(Calendar.DAY_OF_WEEK); //���Ͽ� �ش��ϴ� ����� ����(�Ͽ���=1~)
		
		
		
		String strWeek = null;
		switch(week) {
			case 1: strWeek = "�Ͽ���"; break;
			case 2: strWeek = "������"; break;
			case 3: strWeek = "ȭ����"; break;
			case 4: strWeek = "������"; break;
			case 5: strWeek = "�����"; break;
			case 6: strWeek = "�ݿ���"; break;
			case 7: strWeek = "�����"; break;
			
		}
		
		System.out.println(day2 + "�� / " + strWeek + "(����� " + week + "��)");
		
		//Ÿ����
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
		
		System.out.println("�ѱ� : " + khour + "�� " + kmin + "��");
		System.out.println("�̱� : " + ahour + "�� " + amin + "��");
		System.out.println("�Ϻ� : " + jhour + "�� " + jmin + "��");
		
		//��밡���� Ÿ����
		//String[] avaiId = TimeZone.getAvailableIDs();
		//for (String s : avaiId) {
		//	System.out.println(s);
		//}
		

	}

}
