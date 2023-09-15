package chap_06;

import java.util.Scanner;

public class _02_Dowhile {

	public static void main(String[] args) {
		/* do {
		 * 실행문;
		 * }while (조건식);
		 * 
		 * 실행문을 먼저 실행 후 조건식을 비교하여 반복을 결정
		 * for문이나 while문은 조건식이 false면 한번도 실행이 안될수도 있음
		 * 
		 * 메뉴 생성시 많이 사용
		 */
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("---menu---");
			System.out.println("1.저장하기");
			System.out.println("2.새로만들기");
			System.out.println("3.종료하기");
			System.out.println("------------");
			System.out.println("menu를 입력해주세요.");
			menu = scan.nextInt();
			// 실제 기능 처리구문
			switch (menu) {
			case 1:
				System.out.println("저장 합니다.");
				break;
			case 2:
				System.out.println("새로 만들었습니다.");
				break;
			case 3:
				System.out.println("종료 합니다.");
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		} while (menu != 3);
		System.out.println("프로그램 종료");
		
		scan.close();
	}

}
