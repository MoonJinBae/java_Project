package chap_03;

import java.util.Scanner;

public class _03_If3 {

	public static void main(String[] args) {
		// 정수를 입력 받아서 2의 배수가 되는지 체크 (2의 배수 입니다.)
		// 3의 배수가 되는지 체크 (3의 배수 입니다.)

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요.");
		int num = scan.nextInt();

		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의 공배수 입니다.");
		}
		else if (num % 2 == 0) {
			System.out.println("2의 배수 입니다.");
		}
		else if (num % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("2 또는 3의 배수가 아닙니다.");
		}
		scan.close();
	}

}
