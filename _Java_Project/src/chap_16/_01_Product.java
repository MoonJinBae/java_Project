package chap_16;

public class _01_Product {
	/* Product클래스 : 상품을 등록하는 클래스 - 메뉴하나 생성
	 * 상품명, 가격
	 * 상품등록 메서드 => insertProduct()
	 * 출력 메서드 => printProduct()
	 * 
	 * 1. 메뉴를 등록하고자 하는 배열
	 * 2. 메뉴(음식 + 가격) => class생성 => product class
	 * 3. 하나의 product 객체를 생성(new)해서 menu 배열에 등록
	 */
	private String name;
	private int price;
	
	public _01_Product() {}
	public _01_Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//추가 메서드
	public void insertProduct(String name, int price) {
		this.name = name;
		this. price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "menu= [" + name + "], price= [" + price + "원]";
	}
	
	
}
