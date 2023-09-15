package chap_09;

public class _04_Method2 {
	
	public static void sum(int num1, int num2) { // +
		System.out.println(num1 + num2);
	}
	public static void sub(int num1, int num2) { // -
		System.out.println(num1 - Math.abs(num2));
	}
	public static int mul(int num1, int num2) { // *
		return num1 * num2;
	}
	public static double div(double num1, double num2) { // /
		return (double)num1 / num2;
	}
	public static int rem(int num1, int num2) { // %
		int rem = num1 % num2;
		return rem;
	}
	
	
	public static void main(String[] args) {
		// + - * / % 의 결과를 알려주는 메서드를 생성
		// main에서 호출하여 확인
		
		sum(20, 30);
		sub(30, 20);
		System.out.println(mul(10,10));
		double d = div(20, 3);
		System.out.printf("%.2f%n", d);
		System.out.println(rem(20, 3));
	}

}
