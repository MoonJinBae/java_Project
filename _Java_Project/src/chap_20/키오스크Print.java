package chap_20;

import java.util.ArrayList;
import java.util.List;

public class 키오스크Print {
	
	public void printMenu(키오스크Oder o) {
		System.out.println("--주문하신 메뉴--");
		for (String s : o.getOderMenu().keySet()) {
			System.out.print("메뉴: " + s);
		}
		System.out.println();
		System.out.println("결제금액: " + o.getSumPrice());
	}
	
}
