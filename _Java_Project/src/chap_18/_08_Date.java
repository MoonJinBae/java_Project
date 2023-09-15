package chap_18;

import java.util.Calendar;
import java.util.Date;

public class _08_Date {

	public static void main(String[] args) {
		/* 날짜 / 시간 클래스
		 * Date 클래스
		 * Calendar 클래스 => 추상클래스
		 * - 직접 객체를 생성할 수 없음(싱글턴 방식)
		 * - 이미 생선된 객체가 있다면 해당 객체를 리턴, 없으면 생성해서 리턴
		 * - getInstance() 메서드를 이용하여 인스턴스를 얻어 옴
		 */
		
//		Date d = new Date();
//		d.getDate(); // depercated : 비권장
//		System.out.println(d.getDate()); // 오늘 일
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);		
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1; // 캘린더에서 month : 0 ~ 11까지 나타냄(+1해줘야함)
		System.out.println(month); // +1
		int day = now.get(Calendar.DAY_OF_MONTH); // 한달중의 몇일
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일(일 ~ 토)
		System.out.println(week);
		System.out.println(year+"-"+month+"-"+day);
		
		// hour, minute, second, am pm
		int hour = now.get(Calendar.HOUR); // 시간
		int minute = now.get(Calendar.MINUTE); // 분
		int second = now.get(Calendar.SECOND); // 초
		int ampm = now.get(Calendar.AM_PM); // 오전 = 0 / 오후 = 1
		System.out.println("--------------");
		// 2023-06-19(월)
		// 오후 7:45
		String weekStr = null;
		switch (week) {
		case 1: weekStr = "(일)";
			break;
		case 2: weekStr = "(월)";
			break;
		case 3: weekStr = "(화)";
			break;
		case 4: weekStr = "(수)";
			break;
		case 5: weekStr = "(목)";
			break;
		case 6: weekStr = "(금)";
			break;
		case 7: weekStr = "(토)";
			
			break;
		}
		String am_pm = null;
		System.out.printf("%d-%d-%d%s%n",year, month, day , weekStr);
		switch (ampm) {
		case 0: am_pm = "오전";
			break;
		case 1: am_pm = "오후";
			break;
		}
		System.out.printf("%s %d:%d",am_pm , hour, minute);
	}

}
