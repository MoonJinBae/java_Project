package chap_20;

import java.util.Scanner;

public class 키오스크Main {

	public static void main(String[] args) {
		/* 키오스크 확장판
		 * --메뉴판--
		 * 1 피자 15000
		 * 2 햄버거 10000
		 * 3 콜라 2000
		 * 4 아이스크림 500
		 * 
		 * 주문 하시겠습니까?
		 * 피자 2개 주문
		 * 콜라 2개 주문
		 * 계산하기
		 * 15000 * 2 = 30000
		 * 2000 * 2 = 4000
		 * 총 지불 금액 34000원 입니다.
		 * 
		 * --메뉴추가 : 메뉴판에 메뉴를 추가할 수 있음.
		 * --메뉴삭제 : 메뉴판에 메뉴를 삭제할 수 있음
		 * --가격변경 : 기존 메뉴의 가격을 변경
		 * --계산 : 주문한 금액을 계산하여 총 지불금액을 확인
		 * 
		 * --메뉴--
		 * 1.주문하기
		 * 2.메뉴추가
		 * 3.메뉴삭제
		 * 4.가격변경
		 * 5.종료
		 * 
		 * 1.주문하기 => 메뉴 보여주고, 주문받기(while) => 주문완료 => 금액계산
		 */
         
		/* menu.put("아메리카노", 2500);
			menu.put("에스프레소", 3000);
			menu.put("카페라떼", 3500);
			menu.put("바닐라라떼", 3500);
			menu.put("아이스티", 4000);
			menu.put("딸기주스", 4500);
		 */
		키오스크Oder o = new 키오스크Oder();
		키오스크Print p = new 키오스크Print();
		Scanner scan = new Scanner(System.in);
		
		
		int exit = 1;
		int continued = 1;
		// 주문
		do {
			System.out.println("---메뉴---");
			System.out.println("1.아메리카노[가격]: 2500원");
			System.out.println("2.에스프레소[가격]: 3000원");
			System.out.println("3.카페라떼[가격]: 3500원");
			System.out.println("4.바닐라라떼[가격]: 3500원");
			System.out.println("5.아이스티[가격]: 4000원");
			System.out.println("6.딸기주스[가격]: 4500원");
			System.out.println("주문 하시겠습니까? [1 => 주문], [0 => 종료]");
			exit = scan.nextInt();
			if (exit == 0 || continued == 0) {
				break;
			}else {
				System.out.println("--추가할 메뉴--");
				int addNum = scan.nextInt();
				o.addMneu(addNum);
				System.out.println("계속 주문 하시겠습니까? [1 => 계속], [2 => 메뉴삭제], [0 => 종료]");
				continued = scan.nextInt();
				if (continued == 2) {
					System.out.println("--제거할 메뉴--");
					int subNum = scan.nextInt();
					o.subMenu(subNum);
				}
			}
		} while (exit != 0);
		p.printMenu(o);
		
		
	}

}
