package chap_14;

public class _02_Class7_Ex2 {

	public static void main(String[] args) {
		/* static이 붙은 멤버변수/메서드를 클래스 멤버변수/메서드 라고 한다
		/* static이 붙지 않음 멤버변수/메서드를 인스턴스(객체) 멤버변수/메서드 라고 한다
		 * - 객체 멤버변수/메서드는 객체를 통해 사용되고, 생성된다.
		 * - 각 객체마다 독립적인 변수/메서드가 된다.
		 * 
		 * - 클래스 멤버변수/메서드는 클래스를 통해 사용된다. (클래스명.메서드(변수))
		 * - 객체를 통해 호출되는 것이 가능하나 일반적으로 사용하지 않는다.
		 * - 클래스 멤버변수는 하나의 멤버변수를 모든 객체가 공유(사용)한다.
		 * 
		 * - 클래스 / 객체는 생성 시점이 달라서 메서드에 사용될수 있는 환경이 다르다.
		 * - 객체 멤버는 이미 클래스가 생성되고 난 후 객체를 생성해야 생성
		 * - 클래스 멤버는 클래스를 생성할 시점에 메모리에 생성
		 * - 클래스 멤버는 클래스의 멤버(변수&메서드) / 객체의 멤버(변수/메서드)에서 모두 사용할수 있다.
		 * - 객체의 멤버는 객체에서만 사용될수 있다.
		 * 
		 * final : 최종의. 마지막의, 더이상 변경할 수 없는
		 * - final은 클래스, 변수, 메서드에 붙일 수 있다.
		 * - final 멤버 변수 : 상수(수정할수 없는 값)
		 * - final 멤버 메서드 : 오버라이딩(재정의)할 수 없다.
		 * - final 클래스 : 상속(확장)할 수 없다.
		 */
		Tv t = new Tv();
		// 객체 멤버 메서드 접근 방식 : 객체 생성 후 객체명.메서드명();
		t.printPower();
		System.out.println("-------------");
		
		// 클래스명으로 직접 접근(클래스 멤버들은 객체를 생성해서 접근하지 않음)
		// 클래스 멤버 메서드 접근 방식 : 클래스명.메서드명();
		Tv.printBrand();
		

	}

}
class Tv {
	private boolean power;
	private final static String brand = "Apple";
	
	public void printPower() {
		if(power) {
			System.out.println("TV가 켜졌습니다.");
		}
		else {
			System.out.println("TV가 꺼졌습니다.");
		}
		// 인스턴스 메서드에서 클래스 변수를 사용한 경우
		System.out.println("브랜드 : " + brand);
	}
	public static void printBrand()	{
		// 메서드에 static을 붙이는 경우는 인스턴스 멤버를 사용할 일이 없는 경우
		System.out.println("브랜드 : " + brand); // 가능한 경우
		// 클래스 메서드에서 인스턴스 변수를 사용한 경우 error
//		System.out.println("전원상태 : " + power); // 불가능한 경우
	}
}