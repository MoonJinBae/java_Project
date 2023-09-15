package chap_06;

import java.util.Scanner;

public class _05_Homework {

	public static void main(String[] args) {
		/* 주사위 게임
		 * 주사위를 던져서 총 30칸을 이동
		 * 주사위를 랜덤으로 생성(1 ~ 6까지 생성)
		 * ex) 주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 21칸 남았습니다.
		 * ...도착!! 총 이동횟수 : 00번 => 주사위를 던진 횟수
		 */
		Scanner scan = new Scanner(System.in);
		int end = 30; // 최종 목적지 값
		int sum = 0; // 거리 누적
		int count = 0; // 이동 횟수
		while (true) { // sum < end 사용하여 else 생략가능
			scan.nextLine();  // 엔터 사용 한번씩 끊어서 사용가능
			int random = (int)(Math.random()*6)+1; // 1부터 6까지 랜덤으로 생성
			sum += random; // 거리 합산
			count++;
			System.out.println("주사위를 던지세요.");
			if (end > sum) {
				System.out.println("주사위 : " + random + "칸 전진\n" + (end - sum) + "칸 남았습니다.");
				System.out.println("이동 횟수 : " + count);
				System.out.println();
			}
			else {
				System.out.println("주사위 : " + random + "칸 전진\n도착~!! 총 이동 횟수 : " + count);
				break;
			}
		}
	}

}
