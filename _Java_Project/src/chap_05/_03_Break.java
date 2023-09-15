package chap_05;

import java.util.Scanner;

public class _03_Break {

	public static void main(String[] args) {
		/* break문
		 * 반복문에서 조건문(if)를 동반하여 조건에 맞을 때 반복문을 벗어나는 역할
		 * */
		// 1 ~ 10 까지 출력(초기값, 증감식은 있고, 조건식은 생략, break를 이용하여 탈출)
		
		for (int i = 1; ; i++) {
			System.out.print(i + " ");
			if (i == 10) {
				break;
			}
		}
		System.out.println();
		System.out.println("----------------");
		
		// 한 글자를 입력 받아 글자를 출력(반복해서 출력)
		// y를 입력 받으면 종료
		// a를 입력하면 a, b를 입력하면 b ....y입력 전까지
		Scanner scan = new Scanner(System.in);
		System.out.println("한 글자 입력");
		for (;;) {
			char ch = scan.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("종료");
				break;
				}
			else {
				System.out.println(ch + "\n다시 입력해 주세요.");
			}
		}
		
		scan.close();
	}

}
