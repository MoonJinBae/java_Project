package chap_08;

public class _05_MultiArray {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 자료형[][] 배열명 = new 자료형[길이][길이];
		 * 
		 */
		int[][] arr = new int[5][3]; // 행5, 열3
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // i 행의 length
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 행마다 줄바꿈
		}
		
		
	}

}
