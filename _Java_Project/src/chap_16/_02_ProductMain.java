package chap_16;

import java.util.Scanner;

public class _02_ProductMain {

	public static void main(String[] args) {
		/* main
		 * Product 클래스를 이용 객체를 생성
		 * 상품등록[] => 여러개의 메뉴를 등록
		 * 메뉴는 스캐너를 통해 입력받아 등록
		 * 상품 등록 후 배열의 내용을 출력
		 * 
		 * 예) 상품을 등록하시겠습니까(y/n)?
		 * y => 상품등록 반복
		 * 상품의 이름과 가격을 등록받아 상품 배열에 등록
		 * n => 등록 멈추고 리스트 출력
		 */
		Scanner scan = new Scanner(System.in);
		_01_Product[] menu = new _01_Product[10];
		
		char c = 'y'; // 반복 키워드
		int cnt = 0; // menu 객체를 핸들링 하기 위한 변수 (index 역할)
		
		while (cnt < menu.length) {
			System.out.println("상품을 등록 하시겠습니까?(y[Y] / n[N]");
			c = scan.next().charAt(0);
			if (c == 'y' || c == 'Y') {
				System.out.println("상품명 => ");
				String name = scan.next();
				
				System.out.println("가격");
				int price = scan.nextInt();
				
				// menu에 등록 (객체를 생성해서 등록)
				// _01_Product p = new _01_Product(name, price); // 생성자로 등록
				// menu[cnt] = p;
				
				// _01_Product p = new _01_Product();
				// p.insertProduct(name, price); // 메서드를 사용하여 등록
				// menu[cnt] = p;
				
				menu[cnt] = new _01_Product(name, price);
				cnt++;
			}
			else {
				if (c == 'n' || c == 'N') {
					System.out.println("상품등록 종료");
					break;
				}
				else {
					System.out.println("y / n 만 가능합니다.");
				}
			}
		}
		System.out.println("--등록된 상품 리스트--");
		for (int i = 0; i < cnt; i++) {
			// toString 사용하는 경우
			System.out.println(menu[i].toString());
			// print 메서드를 사용하는 경우
			// menu[i].출력메서드명;
		}
		
		scan.close();
	}

}
