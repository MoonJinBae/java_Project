package chap_05;

import java.util.Scanner;

public class _05_For5 {

	public static void main(String[] args) {
		/* 최소공배수 구하기(Least Common Multiple)
		 * 공배수 : 두 수의 정수에서 공통적으로 있는 배수
		 * 10 : 10, 20, 30, 40, 50....
		 * 15 : 15, 30, 45, 60, 75....
		 * 10, 15 최소공배수 : 30
		 */
		// num1 과 num2 를 입력받아 최소공배수 출력
		// i * num
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력 하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		for (int i = num1; ;i+=num1) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(num1 + " 과(와) " + num2 + " 의 최소공배수 : " + i);
				break;
			}
			
		}
		scan.close();
	}

}
