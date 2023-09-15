package chap_10;

import java.util.Scanner;

public class 가위바위보 {
	
	public static String computer(int ran) { // 랜덤수를 문자열 '가위', '바위', '보'로 변경하는 기능
		return (ran == 0 ? "가위" : ran == 1 ? "바위" : " 보");
//		switch (ran) {
//		case 0: return "가위";
//		case 1: return "바위";
//		case 2: return "보";
//		}
//		return null;
	}
	
	public static void result(String user, String com) {
//		if (user.equals("가위")) { // 유저가 가위일때
//			if (com.equals("보")) {
//				System.out.println("결과 : 이겼습니다.");
//			}
//			else if (user.equals(com)) {
//				System.out.println("결과 : 비겼습니다.");
//			}
//			else {
//				System.out.println("결과 : 졌습니다.");
//			}
//		}
//		
//		if (user.equals("바위")) { // 유저가 바위일때
//			if (com.equals("가위")) {
//				System.out.println("결과 : 이겼습니다.");
//			}
//			else if (user.equals(com)) {
//				System.out.println("결과 : 비겼습니다.");
//			}
//			else {
//				System.out.println("결과 : 졌습니다.");
//			}
//		}
//		if (user.equals("보")) { // 유저가 보일때
//			if (com.equals("바위")) {
//				System.out.println("결과 : 이겼습니다.");
//			}
//			else if (user.equals(com)) {
//				System.out.println("결과 : 비겼습니다.");
//			}
//			else {
//				System.out.println("결과 : 졌습니다.");
//			}
//		}
		if(com.equals(user)) {
			System.out.println("무승부");
		}else {
			if(com.equals("가위")) {
				System.out.println(user.equals("바위")? "승" : "패");
			}else if(com.equals("바위")) {
				System.out.println(user.equals("보")? "승" : "패");
			}else {
				//컴선택 = "보"
				System.out.println(user.equals("가위")? "승" : "패");
			}
		}
		
	}
	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택(0=가위, 1=바위, 2=보)
		 * 내가 가위바위보중 하나를 선택해서 입력
		 * 승패무의 결과를 출력
		 * ex)
		 * com = 0(가위)
		 * user = 가위 => 무승부입니다.
		 * com = 1(바위)
		 * user = 가위 => 졌습니다.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 바위 보~!!");
		String user = scan.next(); // 유저 가위 바위 보 입력
		if (!(user.equals("가위") || user.equals("바위") || user.equals("보"))) {
			System.out.println("잘못 입력했습니다.");
		}
		int random = (int)(Math.random()*3); // 0 ~ 2 출력
		String com = computer(random); // 메서드를 호출해서 랜덤수를 '가위', '바위', '보'로 변경
		System.out.println("컴퓨터 : " + com);

		result(user, com); // result 메서드 호출해서 
		
	}
}
