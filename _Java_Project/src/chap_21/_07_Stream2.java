package chap_21;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_Stream2 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬) 중복되는 값 제거
		 */
		int[] arr = {5,7,4,1,2,3,6,5,4,8,9,5,1,4,};
		// 배열 => stream : Arrays.stream(배열명)
		Arrays.stream(arr).filter(n -> n % 2 == 0).distinct().sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 배열로 리턴(홀수만)
		int[] arr2 = Arrays.stream(arr).filter(n -> n % 2 != 0).distinct().sorted().toArray(); // 홀수만 출력
		
		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}

}
