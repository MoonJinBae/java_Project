package chap_15;

import java.util.Scanner;

public class _05_HomeworkPrint {

	public static void main(String[] args) {
		/* Product클래스 : 상품을 등록하는 클래스 - 메뉴하나 생성
		 * 상품명, 가격
		 * 상품등록 메서드 => insertProduct()
		 * 출력 메서드 => printProduct()
		 */
		
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
		_05_HomeworkClass p = new _05_HomeworkClass();
		String[] menu = new String[5];
		int[] val = new int[5];
//		_05_HomeworkClass[] m = new _05_HomeworkClass[5];
		int cnt = 0;
		int sum = 0;
		while (true) {
			System.out.println("제품을 등록 하시겠습니까?(y[Y] / n[N]");
			System.out.println("-------------------------------");
			char input = scan.next().charAt(0);
			if (input == 'y' || input == 'Y' && cnt < menu.length) {
				System.out.println("제품을 입력 하세요.");
				String product = scan.next(); // 제품명
				System.out.println("제품의 가격을 입력 하세요.");
				int price = scan.nextInt(); // 가격
				menu[cnt] = product;
				val[cnt] = price;
				p.insertProduct(product, price);
				p.printProduct();
				cnt++;
				sum += price;
			}
			if (input == 'n' || input == 'N' || cnt == menu.length) {
				for (int i = 0; i < cnt; i++) {
					System.out.printf("제품명[%s] => 가격[%s원]%n", menu[i], p.getDf().format(val[i]));
				}
				System.out.printf("등록이 끝났습니다.%n제품 총 가격[%s원]%n", p.getDf().format(sum));
				System.out.println("-------------------------------");
				break;
			}
		}

		
	}

}
