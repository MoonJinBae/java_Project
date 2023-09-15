package chap_06;

import java.util.Scanner;

public class _04_Quiz01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자신만 존재하는 수를 소수
		 * 소수 : 3, 5, 7, 11, 13, 17....
		 * 소수는 약수가 2개인 수(1, 나자신)
		 */
		// num 입력받아 num가 소수인지 아닌지 판별
		// ex) num = 13 : 소수입니다.
		// ex) num = 12 : 소수가 아닙니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		switch (count) {
		case 2:
			System.out.println("num = " + num + " : 소수입니다." );
			break;

		default:
			System.out.println("num = " + num + " : 소수가 아닙니다." );	
			break;
		}
		
		// 2 ~ 100까지 소수를 출력
		
		for (int i = 2; i <= 100; i++) { // 2 ~ 100
			count = 0; // 다음 수의 약수 개수를 구하기 위한 초기화
			for (int j = 1; j <= 100; j++) { // 나누는 수
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}

		scan.close();
	}

}
