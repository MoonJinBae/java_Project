package chap_18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _10_LocalDateTimeEx1 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today); // date 객체에서는 추출 불가
		System.out.println(today.getYear());
		String curr = today.toString();
		System.out.println(curr); // String 객체는 추출 가능
		
		String date = curr.substring(0, curr.indexOf("T")); //endIndex 포함x
		System.out.println(date);
		String time = curr.substring(curr.indexOf("T")+1,curr.indexOf(".")); // startIndex 포함o
		System.out.println(time);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 30);
		System.out.println(sDate.format(dtf));
		
	}

}
