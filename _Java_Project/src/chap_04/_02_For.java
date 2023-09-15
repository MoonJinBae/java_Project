package chap_04;

import java.util.Iterator;

public class _02_For {

	public static void main(String[] args) {
		// 반복문 : 규칙적인 작업을 반복적으로 사용할 때(for, while, do while)
		// for문과 while문은 동작 방식이 같다. (조건이 일치하지 않으면 실행이 안됨)
		// do while문은 두방식과 조금 다름 (반드시 한번은 동작 하고 조건확인)
		// for (1.초기화 ; 2.5.8.조건식; 4.7.증감연산) {
		//     3.6.실행문 }
		// 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화 처음 실행시 한번만 수행 / 생력가능
		// 조건식 : 반복횟수를 결정하는 식 (true => 반복, false => 종료) / 생략가능
		// 증감연산식 : 조건식에서 사용하는 변수가 증가 / 감소되어 반복횟수를 조절 /생략가능
		
		// 1 ~ 10 까지 출력하는 예제
		// 초기화 : 사용할 변수 (i) 1부터 => int i = 1;
		// 조건식 : 변수가 10이 될 때 까지 => i <= 10 (1부터 10까지)
		// 증감식 : 1씩 증가 i++
		// 실행문 : i 출력
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n--------------------");
		// 10 ~ 1 까지 출력
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n--------------------");
		// 2 ~ 10 까지 2씩증가 (2의 배수 출력)
		for (int i = 2; i <= 10; i += 2) {
				System.out.print(i + " ");
		}
		System.out.println("\n--------------------");
		// 지역변수의 범위 { 선언     소멸 }
		
		// 1 ~ 10 까지 (짝수만 출력)
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			else {
				System.out.print("홀수 ");
			}
		}
		System.out.println("\n--------------------");
		// 1 ~ 10 까지의 합계 (1 + 2 + 3 + 4 ...10)
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print((sum += i) + " ");
		}
		System.out.println("\n1 ~ 10 까지의 총 합은 : " + sum);
		
	}

}
