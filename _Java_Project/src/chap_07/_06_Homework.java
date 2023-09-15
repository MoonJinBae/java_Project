package chap_07;

public class _06_Homework {

	public static void main(String[] args) {
		/*
		 * 10개짜리 배열 생성 후 1 ~ 50사이의 랜덤수를 생성한 후 배열에 저장 배열을 출력 합계, 평균, 최대, 최소 값을 출력
		 */
		int size = 10;
		int[] arr = new int[size];
		int sum = 0;
		int max = arr[0];
		int min = 50;
		System.out.println("1 ~ 50 까지의 랜덤수를 배열에 저장 하세요.");
		// 배열을 완성하는 중
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 50) + 1;
			System.out.printf("arr[" + "%d" + "]=%2d, ", i, arr[i]);
		}
		// 완성된 배열에서 합계, 최대값, 최소값 구하기
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
//			max = Math.max(max, arr[i]);
//			min = Math.min(min, arr[i]);
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			System.out.println();
			double avg = (double) sum / arr.length;
			System.out.printf("합계 : %d%n평균 : %.1f%n최대값 : %d%n최소값 : %d%n", sum, avg, max, min);
		}
		
		
	}

}
