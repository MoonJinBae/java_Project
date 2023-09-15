package chap_02;

public class _03_If { // 조건문

	public static void main(String[] args) {
		// if(조건식) { 실행문; }
		// 실행문이 한줄일 경우 {} 생략 가능하나 권장하지 않음
		// 조건식이 참이면 실행문을 실행
		
		int num = 10;
		// num > 0 양수 입니다.
		if (num > 0) {
			System.out.println("양수 입니다.");
		}
		num = -10;
		// nunm > 0 양수 입니다.
		if (num > 0) {
			System.out.println("양수 입니다.");
		}
		else {
			System.out.println("음수 입니다.");
		}
		num = 15;
		// num이 10이하의 정수 중 0보다 크면 양수, 0과 같으면 0, 0보다 작으면 음수
		if (num > 10) {
			System.out.println("10보다 큽니다.");
		}
		else if (num > 0) {
			System.out.println("양수");
		}
		else if (num == 0) 	{
			System.out.println("0");
		}
		else if (num < 0) {
			System.out.println("음수");
		}
		
		// num2 변수에 값을 지정하고, num2가 짝수면 짝수, 아니면 홀수로 출력
		int num2 = 5;
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
	}

}
