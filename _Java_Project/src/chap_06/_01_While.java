package chap_06;

public class _01_While {

	public static void main(String[] args) {
		/* 반복문 중 하나 while문
		 * while (조건식) {  // 조건식이 true일 때 반복
		 * 실행문;
		 * 증감식;
		 * }
		 */
		
		// for문을 이용 1 ~ 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		int i = 1; // 반복변수 선언
		while (i <= 10) { // 조건식
			System.out.print(i + " "); // 실행문
			i++;
		}
		
		System.out.println();
		System.out.println("--------------------");
		// 1 ~ 10 짝수만 출력
		i = 1;
		while (i <= 10) { // 조건식
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
	}

}
