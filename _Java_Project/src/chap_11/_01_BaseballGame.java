package chap_11;

import java.util.Arrays;
import java.util.Scanner;

import chap_10._02_Method7_lotto;

public class _01_BaseballGame {

	public static void main(String[] args) {
		/* 야구게임 메서드화
		 * 사용자번호는 직접 입력
		 * 컴퓨터번호는 랜덤생성(1 ~ 9, 중복x)
		 */
		Scanner scan = new Scanner(System.in);
		int[] comNum = new int[3];
		int[] myNum = new int[3];
		int max = 9, min = 1;
		int s = 0, b = 0;
		
		random(max, min);
		isContain2(comNum, min, max);

		while (true) {
			System.out.println("숫자 입력 > ");
			// 문자로 입력받기
			String myStr = scan.next(); // 숫자를 문자로 받음
			String[] myNumStr = myStr.split(""); // 한글자씩 잘라서 저장
			for (int i = 0; i < myNum.length; i++) {
				// 문자를 숫자로 변환해서 myNum에 저장
				myNum[i] = Integer.parseInt(myNumStr[i]);
			}
			s = Strike(myNum, comNum);
			b = ball(myNum, comNum);
			if (s == 3) {
				System.out.println("성공!! 정답~!!");
				array(myNum, comNum);
				break;
			}
			else if (s == 0 && b == 0) {
				System.out.println("out!!");
			}
			else {
				System.out.printf("[%d]STRIKE[%d]BALL", s, b);
			}
			System.out.println();
		}
		

	}
	/* 랜덤 수 생성 메서드
	 * 범위를 주지 않고 max, min 을 이용하여 범위 설정
	 * max = 9, min = 1
	 * (int)(Math.random()*개수)+시작;
	 * (int)(Math.random()*(max-min+1))+min;
	 */
	public static int random(int max, int min) {
		if (max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	/* 랜덤 배열 중복되지 않게 생성
	 * isContain을 _02_Method7_lotto 가져와서 사용
	 * 매개변수 : 배열, int min, int max
	 * 리턴x : void
	 */
	public static void isContain2(int[] comNum, int min, int max) {
		for (int i = 0; i < comNum.length; i++) {
			int r = random(max, min);
			if(!(_02_Method7_lotto.isContain(comNum, r))) { // 다른 클래스의 메소드 호출해서 사용
				comNum[i] = r;
			}
			else {
				i--;
			}
		}
	}
	/* strike 개수 카운트 메서드
	 * comNum, myNum 주고, 번호와 자리가 일치하면 count하는 메서드
	 * 리턴타입 : int
	 */
	public static int Strike(int[] myNum, int[] comNum) { // strike 카운트
		int s = 0;
		for (int i = 0; i < myNum.length; i++) {
			if (myNum[i] == comNum[i]) {
				s++;
			}
		}
		return s;
	}
	/* ball 개수 카운트 메서드
	 * comNum, myNum 주고, 번호가 일치하면 count하는 메서드
	 */
	public static int ball(int[] myNum, int[] comNum) { // ball 카운트
		int b = 0;
		for (int i = 0; i < comNum.length; i++) {
			for (int j = 0; j < comNum.length; j++) {
				if (myNum[i] != comNum[i] && myNum[i] == comNum[j]) {
					b++;
				}
			}
		}
		return b;
	}
	/* 배열 출력 메서드
	 */
	public static void array(int[] myNum, int[] comNum) {
		System.out.println("Computer > ");
		for (int i : comNum) {
			System.out.printf("[%d]", i);
		}
		System.out.println();
		System.out.println("User > ");
		for (int i : myNum) {
			System.out.printf("[%d]", i);
		}
	}
	
}
