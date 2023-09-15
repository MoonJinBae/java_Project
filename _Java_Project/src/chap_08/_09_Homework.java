package chap_08;

import java.util.Scanner;

public class _09_Homework {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 입력 받은 숫자를 거꾸로 출력 ex) 11456 => 65411 => 6+5+4+1+1 => 결과값 출력 힌트) /, %
		 * 이용
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요.");
		long num = scan.nextLong();
		System.out.println("--------split으로 출력--------");
		String num1 = String.valueOf(num); // num을 문자열로 변경해서 num1에 저장
		String[] number = num1.split(""); // num1을 number 배열에 저장
		System.out.print("입력한 숫자 :");
		for (String i : number) {
			System.out.printf("[%s]", i); // number를 향상된 for문으로 출력
		}
		System.out.println();
		System.out.print("거꾸로 숫자 :");
		long sum = 0;
		for (int i = number.length-1; i >= 0; i--) {
			sum += Integer.parseInt(number[i]);
			System.out.printf("[%s]", number[i]);
			if (i > 0) {
				System.out.print("+");
			}
			else {
				System.out.print("=");
			}
		}
		System.out.println(" 총 합 : " + sum);
		
		System.out.println("--------정수 타입으로 출력--------");
		System.out.print("입력한 숫자 :" + num);
		System.out.println();
		System.out.print("거꾸로 숫자 :");
		long sum2 = 0;
		int cnt = 0;
		while (true) {
			long tmp = num % 10; // tmp에 나머지 값 저장
			num /= 10;           // num에 남은 몫 값 저장
			sum2 += tmp;          // sum에 나머지 값 합산
			System.out.printf("[%d]", tmp); // 나머지 값 출력
			if (num > 0) {
				System.out.print("+");
			}
			if (num == 0) { // 몫 값이 0이되면 탈출
				System.out.print("=");
				break;
			}
		}
		System.out.println(" 총 합 : "+ sum2);
		
		scan.close();
	}

}
