package chap_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 키오스크Oder {
	private int sumPrice; // 총 가격 
	
	private Map<String, Integer> oderMenu = new HashMap<String, Integer>(); // 주문한 메뉴 저장
	private int cntAmericano; // 아메리카노 주문 수량
	private int cntEspresso; // 에스프레소 주문 수량
	private int cntCaffeLatte; // 카페라떼 주문 수량
	private int cntVanillaLatte; // 바닐라라떼 주문 수량
	private int cntIcedTea; // 아이스티 주문 수량
	private int cntStrawberryJuice; // 딸기주스 주문 수량
	
	public 키오스크Oder() {}
	
	/* 	1 menu.put("아메리카노", 2500);
		2 menu.put("에스프레소", 3000);
		3 menu.put("카페라떼", 3500);
		4 menu.put("바닐라라떼", 3500);
		5 menu.put("아이스티", 4000);
		6 menu.put("딸기주스", 4500);
	 */
	// 메뉴 추가
	public void addMneu(int num) {
		switch (num) {
		case 1: oderMenu.put("아메리카노", 2500);
				sumPrice += oderMenu.get("아메리카노");
				cntAmericano++;
				System.out.println("아메리카노 " + cntAmericano + "잔 추가");
			break;
		case 2: oderMenu.put("에스프레소", 3000);
				sumPrice += oderMenu.get("에스프레소");
				cntEspresso++;
				System.out.println("에스프레소 " + cntEspresso + "잔 추가");
			break;
		case 3: oderMenu.put("카페라떼", 3500);
				sumPrice += oderMenu.get("카페라떼");
				cntCaffeLatte++;
				System.out.println("카페라떼 " + cntCaffeLatte + "잔 추가");
			break;
		case 4: oderMenu.put("바닐라라떼", 3500);
				sumPrice += oderMenu.get("바닐라라떼");
				cntVanillaLatte++;
				System.out.println("바닐라라떼 " + cntVanillaLatte + "잔 추가");
			break;
		case 5: oderMenu.put("아이스티", 4000);
				sumPrice += oderMenu.get("아이스티");
				cntIcedTea++;
				System.out.println("아이스티 " + cntIcedTea + "잔 추가");
			break;
		case 6: oderMenu.put("딸기주스", 4500);
				sumPrice += oderMenu.get("딸기주스");
				cntStrawberryJuice++;
				System.out.println("딸기주스 " + cntStrawberryJuice + "잔 추가");
			break;
		default:
			System.out.println("없는 메뉴 입니다.");
			break;
		}
	}
	// 메뉴 삭제
	public void subMenu(int num) {
			switch (num) {
			case 1:
				if (cntAmericano == 0) {
					oderMenu.remove("아메리카노");
				} else {
					sumPrice -= oderMenu.get("아메리카노");
					System.out.println("아메리카노 1잔 취소");
					cntAmericano--;
				}
				break;
			case 2:
				if (cntEspresso == 0) {
					oderMenu.remove("에스프레소");
				} else {
					sumPrice -= oderMenu.get("아메리카노");
					System.out.println("에스프레소 1잔 취소");
					cntEspresso--;
				}
				break;
			case 3:
				if (cntCaffeLatte == 0) {
					oderMenu.remove("카페라떼");
				} else {
					sumPrice -= oderMenu.get("카페라떼");
					System.out.println("카페라떼 1잔 취소");
					cntCaffeLatte--;
				}
				break;
			case 4:
				if (cntVanillaLatte == 0) {
					oderMenu.remove("바닐라라떼");
				} else {
					sumPrice -= oderMenu.get("바닐라라떼");
					System.out.println("바닐라라떼 1잔 취소");
					cntVanillaLatte--;
				}
				break;
			case 5:
				if (cntIcedTea == 0) {
					oderMenu.remove("아이스티");
				} else {
					sumPrice -= oderMenu.get("아이스티");
					System.out.println("아이스티 1잔 취소");
					cntIcedTea--;
				}
				break;
			case 6:
				if (cntStrawberryJuice == 0) {
					oderMenu.remove("딸기주스");
				} else {
					sumPrice -= oderMenu.get("딸기주스");
					System.out.println("딸기주스 1잔 취소");
					cntStrawberryJuice--;
				}
				break;
			default:
				System.out.println("잘못된 메뉴 입니다.");
				break;
			}
		}
	public Map<String, Integer> getOderMenu() {
		return oderMenu;
	}
	public int getCntAmericano() {
		return cntAmericano;
	}
	public int getCntEspresso() {
		return cntEspresso;
	}
	public int getCntCaffeLatte() {
		return cntCaffeLatte;
	}
	public int getCntVanillaLatte() {
		return cntVanillaLatte;
	}
	public int getCntIcedTea() {
		return cntIcedTea;
	}
	public int getCntStrawberryJuice() {
		return cntStrawberryJuice;
	}
	public Integer getSumPrice() {
		return sumPrice;
	}
	
}
