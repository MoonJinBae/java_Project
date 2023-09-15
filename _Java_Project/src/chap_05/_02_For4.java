package chap_05;

import java.util.Scanner;

import javax.security.sasl.SaslException;

import org.w3c.dom.css.CSSFontFaceRule;

public class _02_For4 {

	public static void main(String[] args) {
		/* 최대공약수 구하기(Greatest Common Divisor)
		 * 공약수 : 두 정수의 약수 중 공통적으로 있는 약수
		 * 최대 공약수 : 공약수 중 가장 큰 값
		 * 8, 12 의 공약수
		 * 8 : 1, 2, 4, 8
		 * 12 : 1, 2, 3, 4, 6, 12
		 * 최대 공약수 : 4
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력 해주세요.");
		int num1 = scan.nextInt();
		System.out.println("두 번째 정수를 입력 해주세요.");
		int num2 = scan.nextInt();
		
		int gcd = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i; // 공약수가 더 있다면 이전 값은 사라지고 뒤에 나오는(더 큰 공약수)를 저장
			}
		}
		System.out.println(num1 + " 과(와) "+ num2 + "의 최대 공약수 : " + gcd);
		
		System.out.println("------------------");
		/* break : 반복문에서 조건이 맞다면 (반복문)을 빠져나오는 문구
		 * if문의 가장 가까운 for문만 벗어날수 있음
		 */
		for (int i = num1; ; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("두 수의 최대 공약수 : " + i);
				break;
			}
		}
		// break : 반복문에서 for문에 이름표를 붙여 (반복문)을 빠져나오는 문구
		 
		int i = 10;
		a: for (;;) {
			for (;;) {
				for (;;) {
					if (i == 10) {
						i++;
						break a; // 지정된 a: for문 까지 빠져 나갈 수 있음
					}
				}
			}
		}
		
		scan.close();
	}

}
