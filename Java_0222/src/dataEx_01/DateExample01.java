package dataEx_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample01 {

	public static void main(String[] args) {
		// ��¥�� �ð�
		
		Date date = new Date();
		System.out.println(date.getDate()); //��¥
		System.out.println(date.getDay()); //��?
		System.out.println(date); 
		
		//SimpleDateFormat Ŭ���� : ���ϴ� ���ڿ� ���·� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		String strDate = sdf.format(date);
		System.out.println(strDate);
		

	}

}
