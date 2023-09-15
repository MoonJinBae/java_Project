package chap_07;

import java.util.Scanner;

public class _04_Array2 {

	public static void main(String[] args) {
		// 5개짜리 배열 생성 1 ~ 5까지의 값을 입력하고 출력
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.printf("arr["+"%d"+"] = %-2d%n", arr[i], arr[i]);
		}
		/* 5명의 점수를 입력 받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력
		 */
		Scanner scan = new Scanner(System.in);
		int[] student = new int[5];
		int sum = 0;
		System.out.println("5명의 점수를 입력 하세요.");
		for (int i = 0; i < student.length; i++) {
			student[i] = scan.nextInt();
			sum += student[i];
		}
		double avg = (double)sum / student.length;
		System.out.printf("5명 점수의 합계 : %d%n평균 : %.1f", sum, avg);
		
	}

}
