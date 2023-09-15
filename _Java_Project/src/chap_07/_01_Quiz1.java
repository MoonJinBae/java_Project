package chap_07;

public class _01_Quiz1 { // 별찍기

	public static void main(String[] args) {
		/*  *****
		 *  *****
		 *  *****
		 *  *****
		 *  *****
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */   
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		/*      *
		 *     ***
		 *    ***** 
		 *   *******
		 *  *********  
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i-1; j++) {
				System.out.print("*");
			}
			System.out.println(); // 여기까지 피라미드
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			for (int j = 3; j > i; j--) {
				System.out.print("*");
			}
			System.out.println(); // 다이아몬드
		}
		
		/* 1 2 3 
		 * 4 5 6
		 * 7 8 9
		 * 이중for문을 이용하여 나타내보기 
		 */
		int sum = 3; // 3의 배수
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%-3d", sum);
				sum += 3;
			}
			System.out.println();
		}
		
		
	}

}
