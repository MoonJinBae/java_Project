package chap_18;

public class _03_Exception3 {

	public static void main(String[] args) {
		/* 자주 발생하는 예외 코드들
		 * ArithmeticException : 0으로 나누었을 때 발생하는 예외
		 * ArrayIndexOutOfBoundsException : 배열의 index가 범위를 벗어났을 경우
		 * ClassCastException : 클래스의 다운 캐스팅이 잘못되었을 때(형변환 오류)
		 * NullPointerException : 객체가 생성되지 않은 경우
		 * */
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		int arr2[]=null;
//		for(int i=0; i<5; i++) {
//			System.out.println(arr2[i]);
//		}

		P p = null;
		System.out.println(p.num);
	}
}

class P {
	int num = 10;
}