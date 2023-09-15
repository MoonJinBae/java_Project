package chap_21;

public class _02_Sale_Generic<K, V> {
	
	// 멤버변수 menu, price
	private K menu;
	private V price;
	
	public _02_Sale_Generic() {}
	public _02_Sale_Generic(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "_02_Sale_Generic [menu=" + menu + ", price=" + price + "]";
	}
}
