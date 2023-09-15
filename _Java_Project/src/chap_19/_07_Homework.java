package chap_19;

import java.util.HashMap;
import java.util.Iterator;

public class _07_Homework {
	String product; // 제품명
	Integer price; // 제품가격
	HashMap<String, Integer> map = new HashMap<>(); // 제품명,가격 배열에 저장
	int sum; // 가격 합산
	public _07_Homework() {}
	public _07_Homework(String product, int price) {
		this.product = product;
		this.price = price;
	}
	
	public void productInput(String product, Integer price) {
		this.product = product;
		this.price = price;
		map.put(product, price);
		sum += price;
	}
	public void printPeoduct(_07_Homework p) {
		System.out.println(p.map + " 총 가격 : " + sum + "원");
	}
	
	public static void main(String[] args) {
		/* Map을 이용하여 상품과 가격을 추가하여 합계를 구하시오.
		 * 상품을 Map에 추가하는 값은 메서드로 작업
		 * 1. Map은 main에 만들어 놓고, 메서드로 추가만(매개변수로 받기)
		 * 2. Map을 메서드에서 만들어서 main으로 리턴
		 * 가위, 2500
		 * 크레파스, 3000
		 * 합계 : 5500
		 */
		_07_Homework p = new _07_Homework();
		p.productInput("사과", 5000);
		p.productInput("귤", 3000);
		p.productInput("포도", 4000);
		p.productInput("바나나", 7000);
		p.printPeoduct(p);
		Iterator<String> it = p.map.keySet().iterator();
		System.out.println("-----------------------------------------");
		while (it.hasNext()) {
			String key = it.next();
			int value = p.map.get(key);
			System.out.print(key + ": " + value + "원 ");
		}
		System.out.println(" 총 가격: " + p.sum  + "원");
		
	}
	
}
