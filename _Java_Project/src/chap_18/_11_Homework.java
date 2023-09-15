package chap_18;

import java.util.Scanner;

public class _11_Homework {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 총 합을 구하는 프로그램 작성
		 *  입력 : 45, 78, 89, 65, 95 => String 타입으로 입력
		 *  입력받은 문자를 배열에 넣고, 합계를 출력
		 *  1. 총합
		 *  2. 70점 이상 합계
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요.");
		String s = scan.next();
		String[] num = s.split(",");
		int sum = 0; // 숫자 총 합
		int sum2 = 0; // 70점 이상 총 합
		int e = 0; // 전체 인원
		int e2 = 0; // 70점 이상 인원
		System.out.println("입력한 점수 출력");
		for (int i = 0; i < num.length; i++) {
			if (Integer.parseInt(num[i]) >= 70) {
				sum2 += Integer.parseInt(num[i]);
				e2++;
			}
			sum += Integer.parseInt(num[i]);
			System.out.printf("[%3s]",num[i]);
			e++;
		}
		System.out.println();
		System.out.println("전체 인원 [" + e + "명]의 총 합: " + sum);
		System.out.println("70점 이상 [" + e2 + "명]의 총 합: " + sum2);
		
	}

}
