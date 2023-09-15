package chap_05;

public class _04_Continue {

	public static void main(String[] args) {
		// Continue : pass, skip 의 개념
		// 1 ~ 10 중 5만 빼고 출력
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------");
		
		// 1 ~ 10 중 홀수는 pass continue 사용
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
	}	

}
