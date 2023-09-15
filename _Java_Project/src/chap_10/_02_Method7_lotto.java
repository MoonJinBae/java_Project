package chap_10;

import java.util.Arrays;
import java.util.Iterator;

public class _02_Method7_lotto {
	/*
	 * 1. 번호를 랜덤으로 생성하는 기능 1 ~ 45까지 랜덤생성 
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : random
	 */
	public static int random() { // 메서드호출해서 작동
		return (int)(Math.random()*45)+1;
	}

	/*
	 * 2. 배열에 1번의 랜덤번호를 저장하는 기능 
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : randomArray
	 */
	public static void randomArray(int[]arr) { // 정수형 배열을 입력받아 작동
		int cnt = 0;
		while(cnt < arr.length) {
			int r = random();
			if (!isContain(arr, r)) { // true = 중복된다.
				arr[cnt] = r;
				cnt++;
			}
		}
		Arrays.sort(arr); // 오름차순 정렬
	}

	/*
	 * 3. 배열을 콘솔에 출력하는 기능 
	 * 매개변수 : 
	 * 리턴타입 : void 
	 * 메서드명 : printArray
	 */
	public static void printArray(int[] arr) { // 정수형 배열을 입력받아 작동
		System.out.print("생성 번호 : ");
		for (int i : arr) {
			System.out.printf("[%2d]", i);
		}
	}

	/*
	 * 4. 같은 값이 있는지 확인하는 기능 
	 * 매개변수 : 배열, 랜덥값
	 * 리턴타입 : boolean
	 * 메서드명 : isContain
	 */
	public static boolean isContain(int[] arr, int num) { // 정수형 배열과 정수형 숫자를 입력받아 작동
		for (int i = 0; i < arr.length; i++) {
				if (arr[i] == num) {
				return true; // for문과 상관없이 메서드 종료
				}
			}
		return false;
	}

	/*
	 * 5. 등수를 알려주는 메서드 
	 * 매개변수 : 
	 * 리턴타입 : int => 등수를 리턴
	 * 메서드명 : lottoRank 
	 * --당첨기준-- 
	 * 6개 일치 : 1등 
	 * 5개 + 보너스번호 : 2등 
	 * 5개 일치 : 3등 
	 * 4개 일치 : 4등 
	 * 3개 일치 : 5등 
	 * 나머지 :꽝
	 */
	public static int lottoRank(int[] lotto, int[]user) { // 정수형 배열 2개를 입력받아 작동
		// lotto = 7개, user = 6개
		// lotto와 user는 개수가 다르기 때문에 바뀌어서 들어오면 erorr
		if (lotto.length <= user.length) {
			return -1;
		}
		int cnt = 0; // 일치 개수(보너스 제외)
		for (int i = 0; i < user.length; i++) { // 보너스를 제외시키기 위해서
			if (isContain(user, lotto[i])) {
				cnt++;
			}
		}
		// cnt : 보너스 제외 맞춘개수
		switch (cnt) {
		case 6 :return 1;
		case 5 :
			if (isContain(user, lotto[lotto.length-1])) {
				return 2;
			}else {
				return 3;
			}
		case 4 : return 4;
		case 3 : return 5;
		default:
			return -1;
		}
	}

	public static void main(String[] args) {
		/*
		 * 로또 번호 생성(1 ~ 45 랜덤으로 생성) 당첨확인
		 */
		int[] lotto = new int[7]; // 당첨번호 + 보너스번호 => 랜덤생성
		int[] user = new int[6]; // 사용자번호

		randomArray(lotto); // 번호생성
		randomArray(user); // 번호생성
		
		System.out.println("로또");
		printArray(lotto);
		
		System.out.println();
		
		System.out.println("유저");
		printArray(user);
		
		// 매개변수의 자리에 다른 값이 들어가도 자료형만 맞으면 에러가 나지 않음.
		System.out.println();
		int rank = lottoRank(lotto, user);
		if (rank == -1) {
			System.out.println("꽝 입니다.");
		}else {
			
			System.out.println(rank + "등 입니다.");
		}
		
	}

}
