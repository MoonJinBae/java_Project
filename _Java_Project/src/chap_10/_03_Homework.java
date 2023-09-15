package chap_10;

import java.util.Scanner;

public class _03_Homework {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리 숫자 생성(각 자리수는 1~9까지의 수) => 배열로 랜덤 저장(중복불가능)
		 * 유저는 3자리의 숫자를 맞추는 게임 => 직접 입력 (중복되지 않게..)
		 * 자리와 숫자가 일치하면 strike => 자리o + 숫자o => strike
		 * 숫자만 맞으면 ball, 아무것도 안맞으면 out => 자리x + 숫자o => ball
		 * ex) 컴퓨터 생성번호 : 1 2 3  // 배열로 생성
		 * 사용자 번호 : 1 7 8 => 1s
		 * 사용자 번호 : 1 3 2 => 1s 2b
		 * 사용자 번호 : 7 8 9 => out
		 * 사용자 번호 : 1 2 3 => 3s 종료
		 */
		Scanner scan = new Scanner(System.in);
		int[] arrCom = new int[3]; // 컴퓨터 번호
		int[] arrUser = new int[3]; // 유저 번호
		
		// arrCom 중복되지 않게 랜덤수 추출 저장
		for (int i = 0; i < arrCom.length; i++) {
			arrCom[i] = (int)(Math.random()*9)+1;
			for (int j = 0; j < i; j++) {
				if (arrCom[i] == arrCom[j]) {
					i--;
					break;
				}
			}
		}
//		// 결과 체크
//		for (int i : arrCom) {
//			System.out.print(i + " ");
//		}
		while (true) {
			int stk = 0;
			int ball = 0;
			System.out.println("숫자 입력 > ");
			// 문자로 입력받기
			String myStr = scan.next(); // 숫자를 문자로 받음
			String[] myNumStr = myStr.split(""); // 한글자씩 잘라서 저장
			for (int i = 0; i < arrUser.length; i++) {
				// 문자를 숫자로 변환해서 myNum에 저장
				arrUser[i] = Integer.parseInt(myNumStr[i]);
			}
			// 숫자 비교
			for (int i = 0; i < arrCom.length; i++) {
				for (int j = 0; j < arrUser.length; j++) {
					if (arrCom[i] == arrUser[j] && i == j) { // 자리수o + 숫자o
						stk++;
					}
					else if (arrCom[i] == arrUser[j] && i != j) { // 자리수x + 숫자o
						ball++;
					}
					
				}
			}
			// 출력
			if (stk == 0 && ball == 0) {
				System.out.println("out!!");
			}
			else {
				System.out.println(stk + "strike, " + ball + "ball");
			}
			if (stk == 3) {
				System.out.println("성공~!! 종료!!");
				break;
			}
		}
		

	}
}
