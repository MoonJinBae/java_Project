package chap_17;
// 다형성(Polymorphism)

/* 객체지향프로그램의 4가지 특징 
 * - 프록램을 독립된 단위의 객체들을 모아서 처리하는 모임.
 * - 각각의 객체는 메세지를 주고 받으면서 데이터를 처리
 * - 추상화, 캡슐화(정보은닉), 상속, 다형성
 * 
 * 1. 추상화(Abstraction) : 핵심적인 코드만 보여주기
 *   - 인터페이스와 구현은 분리한다.
 *   - 불필요한 부분은 숨겨준다.
 * 2. 캡슐화(encapsulation) : 데이터 보호(정보 은닉)
 *   - 멤버변수(필드)는 숨기고 메서드로 접근
 *   - 멤버변수와 메서드를 하나로 묶는 것
 *   - 은닉화 : 객체의 내부의 정보는 숨기고 외부로 드러나지 않게 함, 외부에서 데이터 직접 접근 방지
 * 3. 상속(inheritance) : 코드 재사용(확장)
 *   - 클래스를 상속받아 수정하여 사용하면 중복 코드를 줄이 수 있음.
 *   - 유지보수가 편함
 * 4. 다형성(polymorphism) : 객체 형변환 용이
 *   - 하나의 코드가 여러 자료(객체)형으로 구현되어 실행되는 것
 *   - 코드는 같은데 들어오는 객체에 따라 다른 결과를 얻을 수 있음.
 *   - 다형성을 잘 활용하면 유연하고, 확장성있는, 유지보수가 편리한 프로그램을 만들수 있음.
 */
class Animal { // 조상 클래스
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal {// Animal상속받은 자손 Human

	@Override
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal {// Animal상속받은 자손 Tiger
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal { // Animal상속받은 자손 Eagle
	@Override
	public void move() {
		System.out.println("독수가가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리는 날수 있습니다.");
	}
}
class Dog {
	public void move() {
		System.out.println("강아지가 귀엽기 걷습니다.");
	}
}
public class _01_Polymorphism { // 다형성

	public static void main(String[] args) {
//		Human a = new Animal(); // 불가능
		// 조상에서 제공하는 값만 자식이 구현해서 사용하는 형태
		Human h = new Human();
		Animal hAnimal = new Human(); // 조상의 클래스로 자식의 객체 생성가능.
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		Dog d = new Dog();
		
		hAnimal.move();
		tAnimal.move();
		eAnimal.move();
		
		_01_Polymorphism test = new _01_Polymorphism();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		test.moveAnimal(h); // 객체 형변환이 이루어져 출력 가능.
		// tset.moveAnimal(d); // animal을 상속받은 객체가 아니기 때문에 불가능.
		System.out.println("-----------------");
		Animal[] aniList = new Animal[3];
		int cnt = 0;
		aniList[cnt] = hAnimal;
		cnt++;
		aniList[cnt] = tAnimal;
		cnt++;
		aniList[cnt] = eAnimal;
		cnt++;
		
		for (int i = 0; i < cnt; i++) {
			aniList[i].move();
		}
		System.out.println("-------------------");
		// Human을 담을 수 있는 자료형객체에 = Human클래스의 객체를 담은것.
		Human human = (Human)hAnimal; // 다운 캐스팅(down casting)
		human.readBook();
		
		System.out.println("--instaceof--");
		// instanceof : 객체가 해당 클래스의 형이 맞는지 체크하는 연산자
		Animal downCastingTest = eAnimal; // Animal클래스의 move기능만 가지는 Eagle객체를 저장
		if (downCastingTest instanceof Human) {
			Human hu = (Human)downCastingTest;
			hu.readBook();
		}
		else if (downCastingTest instanceof Tiger) {
			Tiger ti = (Tiger)downCastingTest;
			ti.hunting();
		}
		else if (downCastingTest instanceof Eagle) {
			Eagle ea = (Eagle)downCastingTest;
			ea.flying();
		}
		else {
			System.out.println("error");
		}
		
	}
	public void moveAnimal(Animal animal) { // 다형성의 예(upCasting : 자동형변환)
		animal.move();
	}
}
