package chap_18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _09_DateFormatEx1 {

	public static void main (String[] args) throws ParseException{
		/* 날짜를 문자열로 format 설정
		 */

		Date date = new Date();
		System.out.println(date); // date 객체로 리턴
		// mm => 분, MM => 월
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		// 문자열을 날짜로
		String dateStr = "2009-09-30 08:30:50";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2 = sdf2.parse(dateStr);
		System.out.println(date2);
		
	}

}
