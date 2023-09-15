package chap_13;

import javax.xml.validation.SchemaFactoryLoader;

public class _03_Method10 {

	public static void main(String[] args) {
		/* 재귀 메서드 : 메서드 안에서 본인의 메서드를 호출하는 메서드(드물게 사용)
		 * ! : 팩토리얼
		 * 1부터 자신의 수까지 곱하는 값을 표현
		 * 0! = 1
		 * 1! = 1
		 * 2! = 1*2
		 * 3! = 1*2*3
		 * 4! = 1*2*3*4
		 * 5! = 1*2*3*4*5
		 */
		System.out.println(fac(5));
		System.out.println(factorial(5));
		
	}
	/* 기능 : 양수가 주어지면 주어진 양수의 팩토리얼 값을 알려주는 메서드
	 * 리턴타입 : 팩토리얼 값 => int
	 * 매개변수 : 양수 => int num
	 */
	public static int fac(int num) {
		if (num < 0) { // num가 0보다 작은 값이 들어오면
			return 0; // 스택오버플로가 발생
		}
		if(num == 0 || num == 1) {
			return 1;
		}
		int res = 1;
		for (int i = 2; i <= num; i++) {
			res *= i;
		}
		return res;
	}
	
	public static int factorial(int num) {
		if (num < 0) { // num가 0보다 작은 값이 들어오면
			return 0; // 스택오버플로가 발생
		}
		if(num == 0 || num == 1) {
			return 1;
		}
		return num * factorial(num-1);
		
	}
}
