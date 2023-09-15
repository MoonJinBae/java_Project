package chap_09;

public class _01_Array_Ex3 {

	public static void main(String[] args) {
		/* 1 ~ 45까지 숫자를 랜덤으로 6개 추출하는 로또번호 추출
		 * 오름차순 정렬 되도록 출력
		 */
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) { // 0번지 부터 끝번지까지 값을 저장
			arr[i] = (int)(Math.random()*45)+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("----정렬 후----");
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 오름차순정렬
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}

}
