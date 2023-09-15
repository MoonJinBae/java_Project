package chap_08;

import java.util.Arrays;

public class _03_Array_Ex1 {

	public static void main(String[] args) {
		/* 1 ~ 10까지 담고있는 배열을 생성 => 출력
		 */
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		/* 배열 섞는 코드
		 * 랜덤으로 번지를 선택해서 순차적으로 하나씩 교환
		 * int tmp = arr[i];
		 * arr[i] = arr[j];
		 * arr[j] = tmp;
		 * (int)(Math.random()*개수)+시작
		 * 범위를 min = 0, max = arr.length // 10개
		 * 범위로 나오면 min = 1, max = 10까지
		 */
		int min = 0;
		int max = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*arr.length);
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		System.out.println("--섞은 후--");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		// 오름차순정렬 : 작은수부터 정렬
		// 내림차순정렬 : 큰수부터 정렬
		// 3 6 5 7 2 10 8 9 4 1 
		// 0번지를 뒤에 숫자랑 비교해서 더 작은수를 0번지로 교환 -1차
		// 1번지를 뒤에 숫자랑 비교해서 더 작은수를 1번지로 교환 -2차 
		// .....마지막 번지까지 비교해서 종료
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 오름차순 반대는 < 내림차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("--정렬 후--");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
	}

}
