package chap_15;

// abstract : 추상클래스
abstract class Animal1{
	public String name;
	public String category;
	public String eat;
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("분류 : " + category);
	}
	abstract public void howl(); // 추상메서드
	abstract public void eating(); // 추상메서드
	
}

// 추상클래스 Animal을 상속하는 Dog, Cat 클래스 생성
// 추상클래스를 상속하는 일반 클래스는 반드시 추상메서드를 구현해야한다.
class Dog1 extends Animal1 {
	public Dog1() {}
	public Dog1(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() { // 추상메서드 구현
		System.out.println(name + "[울음소리] : 멍멍~~");
	}
	@Override
	public void eating() {
		super.eat = "개껌";
		System.out.println(name + "[간식] : " + eat);
		System.out.println("--------------");
	}
	
}

class Cat1 extends Animal1 {
	public Cat1() {}
	public Cat1(String name, String category) {
		super.name = name;
		super.category = category;
	}
	@Override
	public void howl() { // 추상메서드 구현
		System.out.println(name + "[울음소리] : 야옹~~");
	}
	@Override
	public void eating() {
		super.eat = "통조림";
		System.out.println(name + "[간식] : " + eat);
		System.out.println("--------------");
	}
}

public class _04_추상클래스1 {

	public static void main(String[] args) {
		 /* 추상 메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상 클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)
		 * 추상 클래스 : 미완성 설계도 => 객체를 생성할 수 없다.
		 * 키워드 : abstract
		 * abstract 클래스명 앞 / abstract 메서드명 앞에 추가
		 * abstract 리턴타입 메서드명(매개변수);
		 * - 인터페이스에서는 생략가능(어차피 추상메서드만 존재가능)
		 * - 추상클래스에서는 생략 불가
		 * - 주로 부모클래스에서 상속받을 때, 특정 메서드가 자식들에게 자주 오버라이딩 되는 상활일 때,
		 * 	해당 메서드를 추상 메서드로 작성
		 * - 상속 받은 클래스에 추상메서드가 있다면, 반드시 구현해야 한다.
		 */
		Dog1 d = new Dog1("말티즈", "개과");
		d.printInfo();
		d.howl();
		d.eating();
		
		Cat1 c = new Cat1("페르시안", "고양이과");
		c.printInfo();
		c.howl();
		c.eating();
	}

}
