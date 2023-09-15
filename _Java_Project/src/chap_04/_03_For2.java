package chap_04;

public class _03_For2 {

	public static void main(String[] args) {
		// 1 ~ 10 홀수의 합과 짝수의 합을 출력
		int even = 0; // 짝수
		int odd = 0; // 홀수
		for (int i = 1; i <= 10; i++) {
			if (i % 2 ==0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		System.out.println("홀수의 합 : " + odd);
		System.out.println("짝수의 합 : " + even);
		
		// 오른쪽 삼각형
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 왼쪽 삼각형
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
