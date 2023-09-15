package chap_06;

public class _03_For_printf_Ex1 {

	public static void main(String[] args) {
		/* 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * 1 ~ 30까지 짝수만 출력
		 * 5개씩 한줄로 출력
		 */
		
		for (int i = 1; i <= 30; i++) {
			if (i % 2 ==0) {
				System.out.printf("%3d", i); // printf %d(정수) 3개로 출력해서 줄맞춤 가능
				if (i % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("-------------");
		int j = 1;
		while (j <= 30) {
			if (j % 2 == 0) {
				System.out.print(j + " ");
				if (j % 10 == 0) {
					System.out.println();
				}
			}
			j++;
		}
		System.out.println();
		System.out.println("-------------");
		// 출력 구문
		System.out.println("println : 줄바꿈이 있는 출력");
		System.out.println("ptint : 줄바꿈이 없는 출력");
		System.out.println("printf : 지시자를 통해서 값을 표현");
		/* 서식 지정자를 통해 출력 데이터 서식 지정
		 * %n(\n 줄바꿈), %d(정수형), %f(실수형), %c(문자), %s(문자열)
		 * escape sequence
		 * \n(줄바꿈), \r(캐리지리턴), \t(탭)
		 */
		int num1 = 5, num2 = 3;
		// 5 + 3 = 8
		System.out.printf("%d + %d = %d%n", num1, num2 , num1 +  num2);
		
		double num3 = 5, num4 = 12;
		System.out.printf("%.0f / %.0f = %.1f", num3, num4 , num3 /  num4); // 실수형 자리수는 %.0f %.1f ...자리수 지정
	}

}
