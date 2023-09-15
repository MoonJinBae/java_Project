package chap_05;

import java.util.Scanner;

public class _01_For3 {

	public static void main(String[] args) {
		/* num을 입력 받아 num의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 12의 약수 : 12/(1~12) = 나머지가 0이 되는 수(1, 2, 3, 4, 6, 12)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요.");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		scan.close();
	}

}
