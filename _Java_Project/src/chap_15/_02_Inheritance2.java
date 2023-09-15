package chap_15;

class Animal {
	private String name; // 이름
	private String category; // 종
	
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	// printInfo
	public void printInfo() {
		System.out.printf("이름 : %s%n분류 : %s%n",name, category);
	}
	// 울음소리 howl()
	public void howl() {
		System.out.println("== " + name + " 울음소리 ==");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}

class Dog extends Animal {
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("멍멍~~");
		System.out.println("--------------");
	}
	
}

class Cat extends Animal {
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("야옹~~");
		System.out.println("--------------");
	}
}

class Tiger extends Animal {
	public Tiger(String name, String category) {
		// 생성자 호출
		super(name, category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("어흥~~");
	}
	
	
}
public class _02_Inheritance2 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모클래스에게 물려받은 메서드를 재정의 하는 것
		 * - 부모클래스의 메서드와 선언부가 일치해야 한다.
		 * - 접근제한자 변경은 더 넓은 범위로만 가능 => 접근제한자 축소는 안됨
		 */
		Dog d = new Dog();
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("페르시안", "고양이과");
		c.printInfo();
		c.howl();
		
		Tiger t = new Tiger("호랑이", "고양이과");
		t.printInfo();
		t.howl();
	}

}
