package chap_13;

public class _02_Method9 {

	public static void main(String[] args) {
		/* 가변인자 메서드
		 * - 매개변수의 개수가 고정되어 있지 않은 경우
		 */
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6));
		System.out.println(sum(1,2,3,4,5,6,7,8,9));
		
	}

	public static int sum(int...num) { // num을 배열처럼 사용
		int result = 0;
		for (int tmp : num) {
			result += tmp;
		}
		return result;
	}
}
