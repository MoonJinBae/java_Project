package chap_07;

import java.util.Arrays;

public class _03_Array {

	public static void main(String[] args) {
		/* 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합(참조변수)
		 * 일반적으로 객체 생성 키워드 => new
		 * 배열 선언 방법
		 * 타입[] 배열이름;  
		 * 타입 배열이름[];
		 * 선언 초기화 같이 하는 방법
		 * 타입[] 배열이름 = new 타입[길이]; // 가장 많이 사용
		 * 타입[] 배열이름 = new 타입[] {값1, 값2 .....}
		 * 타입[] 배열이름 = {값1, 값2......} // 연습할 때 선언과 동시에 초기화 가능
		 * -배열의 길이는 0이상이여야 한다.
		 * -배열[5] => 0 1 2 3 4
		 * -배열의 길이 확인 => 배열이름.length 를 이용
		 */
		
		int a = 10; // 지역 변수(일반 변수)
		int arr1[]; // 선언만 한 경우
		arr1 = new int[5]; // 초기화
		int arr2[] = new int[5];
		int[] arr3 = new int[] {1,2,3,4,5,};
		int[] arr4 = {1,2,3,4,5,};
		
		/* 배열 사용 이유
		 * 관리가 편함, 반복문 사용할 수 있기 때문에 많은 양의 데이터도 쉽게 사용 가능.
		 * 배열의 번지는 0부터 시작, 길이는 개수로 표현되기 때문에
		 * 길이가 5라고 할때 0 1 2 3 4
		 * 마지막 번지 길이-1 까지
		 */
		
		// 배열안의 값을 변경
		arr3[0] = 10;
		arr3[1] = 20;
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		System.out.println("-----------");
		
		// arr1 배열에 1 ~ 5까지의 값을 저장하고 출력
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		
	}

}
