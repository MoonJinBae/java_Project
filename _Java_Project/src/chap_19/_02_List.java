package chap_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class _02_List {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 List 생성
		 * 
		 * 출력을 for문 / 향상된for문 / Iterator 사용하여 출력
		 */
		List<String> routines = new ArrayList<String>();
		routines.add("아침 기상");
		routines.add("아침 식사");
		routines.add("오전 공부");
		routines.add("점심 식사");
		routines.add("학원 등원");
		routines.add("오후 수업");
		routines.add("저녁 식사");
		routines.add("저녁 수업");
		routines.add("집으로 귀가");
		routines.add("취침");
		
		// for문
		System.out.println("         -----------for문---------");
		for (int i = 0; i < routines.size(); i++) {
			System.out.printf("%d.[%s] ",i+1,routines.get(i));
		}
		System.out.println();
		
		// 향상된 for문
		System.out.println("         --------향상된 for문------");
		int i = 1;
		for (String s : routines) {
			System.out.printf("%d.[%s] ", i, s);
			i++;
		}
		System.out.println();
		
		// Iterator
		System.out.println("         ---------Iterator-------");
		Iterator<String> it = routines.iterator();
		i = 1;
		while (it.hasNext()) {
			String s = it.next();
			System.out.printf("%d.[%s] ", i,  s);
			i++;
		}
		System.out.println();
		
//		Collections.sort(routines);
//		System.out.println(routines);
		
//		routines.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// 숫자는 - 크다, 작다를 이용 가능
//				// 문자는 compareTo 메서드를 활용하여 정렬
//				return o2.compareTo(o1);
//			}
//			
//		});
		routines.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});
		
		System.out.println(routines);
	}

}
