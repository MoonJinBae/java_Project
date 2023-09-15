package chap_08;

public class _01_Array4 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 이라는 단어를 담을 배열을 생성 후
		 * 글자를 입력 => 출력
		 */
		String[] arr = new String[3];
		arr[0] = "국어";
		arr[1] = "영어";
		arr[2] = "수학";
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 향상된 for문 (for each)
		// 한번에 하나씩 객체의 전체 탐색시 사용
		for (String str : arr) {
			System.out.print(str + " ");
		}
		
	}

}
