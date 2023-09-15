package chap_19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class _05_Map2 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아(Scanner) 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올때 까지 반복(0 == 종료)
		 * 과목과 점수를 입력해 주세요.
		 * 국어 89, 수학 78, 0 종료
		 * Map으로 출력 후 합계, 평균 출력
		 */
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		int sum = 0;
		double avg = 0;
		while (true) {
			System.out.println("과목과 점수를 입력해 주세요.[0 => 종료]");
			System.out.println("과목 입력 =>");
			String subject = scan.next();
			if (subject.equals("0")) { break; }
			System.out.println("점수 입력 =>");
			int score = scan.nextInt();
			map.put(subject, score);
			sum += score;
			avg = (double)sum / map.size();
		}
		System.out.println(map + " 총 합: " + sum + ", 평균: " + avg);
		System.out.println(map.entrySet() + " 총 합: " + sum + ", 평균: " + avg);
		
		System.out.println("----Iterator 출력----");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String subject = it.next();
			System.out.print(subject + " : " + map.get(subject));
		}
		System.out.println(" 총 합: " + sum + ", 평균: " + avg);
		
		System.out.println("----향상된 for문 출력----");
		for (String s : map.keySet()) {
			System.out.print(s + " : " + map.get(s));
		}
		System.out.println(" 총 합: " + sum + ", 평균: " + avg);
		
		
		scan.close();
	}

}
