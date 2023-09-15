package chap_15;

import java.text.DecimalFormat;

public class _05_HomeworkClass {
	/* Product클래스 : 상품을 등록하는 클래스 - 메뉴하나 생성
	 * 상품명, 가격
	 * 상품등록 메서드 => insertProduct()
	 * 출력 메서드 => printProduct()
	 */
	private String product; // 상품명
	private int price; // 가격
	DecimalFormat df = new DecimalFormat("###,###");
	public _05_HomeworkClass() {}

	public void insertProduct(String product, int price) {
		this.product = product;
		this.price = price;
	}
	public void printProduct() {
		String money = df.format(price);
		System.out.printf("등록제품[%s] => 가격[%s원]%n", product, money);
		System.out.println("-------------------------------");
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public DecimalFormat getDf() {
		return df;
	}

	public void setDf(DecimalFormat df) {
		this.df = df;
	}
}
