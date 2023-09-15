package chap_07;

public class _05_Array3 {

	public static void main(String[] args) {
		int[] arr = new int[] {12, 15, 25, 60, 70, 88, 90};
		// arr 배열의 합계, 평균, 최대값, 최소값 출력
		
		int sum = 0;
		int max = arr[0];	
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//			else {
//				min = arr[i];
//			}
			max = Math.max(max,arr[i]);
			min = Math.min(min,arr[i]);
		}
		double avg = (double)sum / arr.length;
		System.out.printf("합계 : %d%n평균 : %.1f%n최대값 : %d%n최소값 : %d%n",sum,avg,max,min);
		
		
	}

}
