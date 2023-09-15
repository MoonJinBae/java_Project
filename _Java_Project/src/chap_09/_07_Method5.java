package chap_09;

public class _07_Method5 {
	/* 최대공약수 두 정수를 매개변수로 받아, 최대공약수를 리턴하는 메서드 매개변수 : 두정수(int num1, int num2) 리턴타입 :
	 * 최대공약수(int) 메서드명 : gcd
	 */

	public static int gcd(int num1, int num2) {
		for (int i = num1; ; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
	}

	/*
	 * 최소공배수 두 정수를 메개변수로 받아, 최소공배수를 리턴하는 메서드 매개변수 : 두정수(int num1, int num2) 리턴타입 :
	 * 최소공배수(int) 메서드명 : lcm
	 */
	public static int lcm(int num1, int num2) {
		for (int i = num1; ; i+=num1) {
			if (i % num1 == 0 && i % num2 == 0) {
				return i; // 메서드에서 return만나면 값을 반환하고 종료~!!
			}
		}
	}
	
	public static int lcm2(int num1, int num2) { // num1과 num2의 최대공약수로 나누기
		return num1 * num2 / gcd(num1, num2); 
	}
	
	public static void main(String[] args) {

		System.out.println(gcd(6,12));
		System.out.println(lcm(15, 30));
		System.out.println(lcm2(15, 36));
		
	}

}
