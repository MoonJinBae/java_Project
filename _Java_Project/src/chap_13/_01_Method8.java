package chap_13;

public class _01_Method8 {

	public static void main(String[] args) {
		/* 메서드 오버로딩
		 * - 동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 * - 오버로딩 조건
		 * 1. 매개변수의 개수가 다르면 가능
		 * 2. 매개변수의 종류(자료형) 다르면 가능
		 * - 리턴타입과는 상관없음, 매개변수의 이름과도 상관없음
		 */
		_01_Method8 m = new _01_Method8(); // 객체를 생성
		System.out.println(m.sum(30,40));
		
		System.out.println(m.sum(10, 20, 30));
		System.out.println(m.sum(1.5,2.2));
		
	}

	// num1과 num2를 매개변수로 받아서 합을 돌려주는 메서드
	public int sum(int num1, int num2) { // static이 붙지 않았기 때문에 호출하려면 객체를 생성
		return num1 + num2;
	}
	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public double sum(double num1, double num2) {
		return num1 + num2;
	}
	// 리턴타입 상관x, 매개변수 이름 상관x
//	public int sum(double num1, double num2) { 
//		return num1 + num2;
//	}
}
