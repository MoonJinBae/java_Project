package chap_09;

import java.util.Scanner;

public class _08_Homework {
	public static void sum(int num1, int num2) {
		System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2); // 덧셈 메서드
	}
	public static void sub(int num1, int num2) {
		System.out.printf("%d - %d = %d%n", num1, num2, num1 - num2); // 뺄셈 메서드
	}
	public static void mul(int num1, int num2) {
		System.out.printf("%d x %d = %d%n", num1, num2, num1 * num2); // 곱셈 메서드
	}
	public static void div(int num1, int num2) {
		System.out.printf("%d / %d = %.2f%n", num1, num2, (double)num1 / num2); // 나눗셈 메서드
	}
	public static void rem(int num1, int num2) {
		System.out.printf("%d %% %d = %d%n", num1, num2, num1 % num2); // 나머지 메서드
	}

	public static void main(String[] args) {
		/* 계산기 만들기
		 * 메뉴
		 * 1.덧셈| 2.뺄셈|3.곱셈| 4.나눗셈| 5.나머지| 6.종료
		 * ==> 메뉴 선택1
		 * ==> 숫자1> 입력받기(5)
		 * ==> 숫자2> 입력받기(3)
		 * 더하기 메서드를 호출하여 연산 (5+3)
		 * 결과 : 5 + 3 = 8
		 * 연산에 따른 switch 구문으로 메서드 호출
		 */
		
		while (true) {
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1.덧셈| 2.뺄셈|3.곱셈| 4.나눗셈| 5.나머지| 6.종료");
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt(); // 메뉴 입력
			if (1 < menu ||menu > 6) { // 1 ~ 6 범위 벗어나면 continue;
				System.out.println("잘못된 메뉴 입니다.");	
				continue;
			}
			if (menu == 6) { // 메뉴 6 종료
				System.out.println("종료 합니다.");
				break;
			}
			System.out.println("첫 번째 숫자 입력");
			int num1 = scan.nextInt();
			System.out.println("두 번째 숫자 입력");
			int num2 = scan.nextInt();
			switch (menu) {
			case 1 : 
				sum(num1, num2);
				break;
			case 2 :
				sub(num1, num2);
				break;
			case 3 :
				mul(num1, num2);
				break;
			case 4 :
				div(num1, num2);
				break;
			case 5 :
				rem(num1, num2);
				break;
			}
			System.out.println();
		}
		
		
		
	}

}
