package chap_08;

public class _04_Array_Ex2 {

	public static void main(String[] args) {
		/* 1 ~ 50까지의 랜덤수를 10개 생성하여 배열에 저장하고, 출력
		 * 오름차순 정렬하여 한번더 출력
		 */
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*50)+1;
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--오름차순정렬--");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 정렬 로직
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
