package chap_04;

public class _04_Homework {

	public static void main(String[] args) {
		// 구구단 2단 출력
//		int num = 2;
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(num + " x " + i + " = " + num*i);
//		}
		// 구구단 출력
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단 출력!!");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		// 왼쪽 삼각형 별
		for (int l = 0; l < 5; l++) {
			for (int j = 0; j <= l; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("-----------");
		// 다이아몬드 별
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i+1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("★");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 4; j > i; j--) {
				System.out.print("★");
			}
			for (int j = 3; j > i ; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}

}
