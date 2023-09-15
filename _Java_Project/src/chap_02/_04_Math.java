package chap_02;

public class _04_Math {

	public static void main(String[] args) {
		int kor = 90, eng = 80, math = 87;
		double avg = (kor + eng + math) / 3;
		// Math.method
		// (Math.round : 반올림
		System.out.println(Math.round(avg));
		
		// (Math.ceil) : 올림
		System.out.println(Math.ceil(5.1234));
		
		// (Math.floor) : 버림
		System.out.println(Math.floor(5.1234));
		
		// (Math.max), (Math.min) : 큰값, 작은값을 찾는 메소드
		System.out.println(Math.max(10, 30));
		System.out.println(Math.min(10, 30));
		
		// Math.pow : 거듭제곱 (x, y) => x의 y승
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.log(10));
		
		// Math.sqrt : 제곱근
		System.out.println(Math.sqrt(81)); // 81의 제곱근은 9
		
		// Math.abs : 절대값으로 변경
		System.out.println(Math.abs(-1004)); // 1004
		
		// Math.random : 0과 1사이의 아무값을 출력
		// 0.0 <= Math.random < 1.0
		// (int) (Math.random()*n)+start;
		// (int)0.0 *10 +1 <= (int) (Math.random()*10)+1 < (int)1.0*10 +1 : 1 부터 10까지의
		// 랜덤 정수 출력
		int random = ((int)(Math.random()*45)+1); // 1부터 45까지의 랜덤 정수
	}

}
