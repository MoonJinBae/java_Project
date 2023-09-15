package chap_09;

public class _03_Method {
	
	// 메서드 작성 위치
	public static int sum(int num1, int num2) { 
		return num1 + num2;
		// 두 정수를 입력 받아 두 정수의 합을 알려주는(리턴하는) 메서드
		// 리턴타입 : int (합계)
		// 메서드명 : sum
		// 매개변수 : int num1, int num2 (두 정수)
		
		// 매개변수 = (자료형 변수명, 자료형 변수명)
	}
	public static int sub(int num1, int num2) {
		if (num1 < num2) { // num2가 num1보다 크면 num2에서 num1을 빼주는 조건
			return num2 - num1;
		}
		return num1 - num2;
	}
	// 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	// 리턴타입 : 없음
	// 매개변수 : 두 정수(int num1, int num2)
	// 메서드명 : sum1
	public static void sum1(int num1, int num2) {
		System.out.println(num1 + num2); // 메서드 안에 출력문 포함
	}

	public static void main(String[] args) {
		/* method(메서드) : 기능(함수), function
		 * 메서드 선언 및 구현
		 * 접근제한자 리턴타입 메서드명(매개변수) {
		 * 기능 구현; }
		 * 
		 * - 접근제한자 : 접근할수 있는 주체의 제한범위
		 * - 리턴타입 : 반환값 (메서드 실행 후 결과로 알려주는 값의 자료형)
		 * - 메서드명 : 소문자로 작석
		 * - 매개변수 : 기능을 수행하기 위해 필요한 값
		 * - void : 리턴할 것이 없는 경우
		 * 
		 * - 메서드의 위치
		 *  - 클래스 안, 다른 메서드 밖
		 *  - 메서드의 순서는 아무 상관 없음
		 *  - 메서드는 순서대로 실행되지 않음, 호출이 되어야 실행
		 */
		int a = sum(10, 20);
		System.out.println(sum(10, 20)); // 30
		System.out.println(a); // 30
		
		int b = sub(30, 10);
		System.out.println(b); // 20
		
		sum1(20,30); // 50
		// System.out.println(sum1); //error

	}
	// 메서드 작성 위치

}
