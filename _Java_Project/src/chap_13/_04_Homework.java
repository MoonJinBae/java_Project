package chap_13;

import java.util.Iterator;

public class _04_Homework {

	public static void main(String[] args) {
		/* 두 정수 a, b가 주어졌을 때 a와 b사이에 속한 모든 정수의 합을 리턴하는 메서드
		 * 예) a = 3, b = 5  => 3 + 4 + 5
		 * 예) a = 5, b = 1  => 1 + 2 + 3 + 4 + 5
		 * 예) a = 3, b =3  => 3
		 */
		_04_Homework add = new _04_Homework();
		System.out.println(add.sum(4, 1));
		System.out.println(add.sum(5, 7));
		System.out.println("---------");
		System.out.println(add.sum2(4, 1));
		System.out.println(add.sum2(5, 7));
		
		

	}
	public int sum(int a, int b) { // a작은수, b큰수 라고 가정하면
		int sum = 0; // 두 정수 사이의 합 저장
		if (a > b) { // a가 b보다 크면 값을 교환
			int tmp = a;
			a = b;
			b = tmp;
		}
		for (int i = a; i <= b; i++) { // a부터 b까지의 합을 sum에 저장
			sum += i;
		}
		return sum;
	}
	public int sum2(int a, int b) {
		int sum = 0;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		for (int i = min; i <= max; i++) { // a부터 b까지의 합을 sum에 저장
			sum += i;
		}
		return sum;
	}
}
