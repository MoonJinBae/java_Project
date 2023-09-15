package chap_21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Sale_Manager {

	// Sale 클래스의 처리를 위한 클래스
	private ArrayList<_02_Sale_Generic<String, Integer>> menu = new ArrayList<>();
	private ArrayList<_02_Sale_Generic<String, Integer>> order = new ArrayList<>();
	
	// 메뉴
	public void printMenu() {
		System.out.println(">>menu<<");
		System.out.println("1. 제품추가 |2. 제품리스트보기 |3. 제품주문");
		System.out.println("4. 주문내역보기 |5. 종료");
	}

	public void add(Scanner scan) {
		// 제품 추가
		System.out.println("제품명 : ");
		String menu = scan.next();
		System.out.println("가격 : ");
		int price = scan.nextInt();
		// 클래스 객체 생성한 후 add
		_02_Sale_Generic<String, Integer> p = new _02_Sale_Generic(menu, price);
		this.menu.add(p);
	}

	public void menu() {
		// 제품 리스트보가
		for (_02_Sale_Generic<String, Integer> tmp: menu) {
			System.out.println(tmp); // toString 반영하여 출력
		}
		
	}

	public void orderPick(String name, int count) {
		// 주문하기
		for (int i = 0; i < menu.size(); i++) {
			String productMenu = menu.get(i).getMenu(); // 주문가격
			int productPrice = menu.get(i).getPrice();
			if (productMenu.equals(name)) {
				_02_Sale_Generic p = new _02_Sale_Generic(productMenu, productPrice*count);
				order.add(p);
			}
		}
	}

	public void printOrder() {
		// 주문내역 보기
		int sum = 0;
		for (_02_Sale_Generic tmp: order) { // _02_Sale_Generic<String, Integer>타입을 지정 안했기 때문에
			System.out.println(tmp); // toString 반영하여 출력
			sum += (Integer)tmp.getPrice(); // (Integer)형변환 해줘야함
			// 제네릭 타입의 멤버 값으로 직접 접근하게 되면 형변환 후 저장해야 함.
		}
		System.out.println("총 지불금액 : " + sum);
	}
}
