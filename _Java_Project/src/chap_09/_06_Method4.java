package chap_09;

public class _06_Method4 {
	public static boolean isPrime(int num) {
		int cnt = 0; // 약수의 개수가 2개인 소수
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}
		if (cnt == 2) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		/* 정수가 주어지면 이 정수가 소수인지 아닌지 판별(true, false)
		 * 소수 : 1과 자신의 수 외에는 나누어 떨어지지 않는 수
		 * 리턴타입 : boolean
		 * 매개변수 : int num
		 * 메서드명 : isPrime
		 */
		for (int i = 1; i <= 10; i++) {
			if (isPrime(i)) {
				System.out.println(i + "는 소수입니다.");
			}else {
				System.out.println(i + "는 소수가 아닙니다.");
			}
		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100까지 소수의 합 : " + sum);
		
	}

}
