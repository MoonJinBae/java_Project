package chap_12;

public class _01_Class3 {

	public static void main(String[] args) {
		Car c = new Car(); // 차의 객체가 만들어지는 상태
		// Car(); : 생성자
		
		System.out.println("메인카");
		c.setName("tiguan");
		c.setYear("2023/6");
		c.setColor("white");
		c.printCar();
		
		c.powerOn();
		c.powerOn();
		c.powerOff();
		c.powerOn();
		System.out.println(c.isPower());
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedUp();
		c.setSpeed(200);
		c.speedUp();
		c.speedDown();
		c.setSpeed(0);
		c.speedDown();
		
		System.out.println("------------------");
		System.out.println("세컨카");
		Car c2 = new Car();
		c2.setName("canival");
		c2.setYear("2020/5");
		c2.setColor("black");
		c2.printCar();
		
		Car c3 = new Car("zeta", "blue", "2021/5");
		c3.printCar();
		
		/*
		 * 객체를 생성할 때 초기값을 초기화(지정)하는 것을 생성자 
		 * 생성자를 이용하면 초기화를 쉽게 할 수 있다 
		 * class를 생성하면 기본 아무것도 없는 생성자를 제공 Car() 
		 * 다른 생성자를 추가하면 기본 생성자는 사라짐 
		 * 다른 생성자를 추가 하더라도 기본 생성자를 같이 추가하여 생성자를 여러개 두는 것이 일반적
		 */
		
		/* 생성자 생성 : 생성자는 반환값(리턴값)이 없지만 void 안붙임
		 * public 클래스명() {
		 *  }
		 */
	}
}
class Car { // 같은 패키지 안에서는 같은 이름의 클래스 생성 안됨
	// 멤버변수 : name, year, color, power, speed
	// final : 변수 앞에 붙이면 변경될 수 없는 값
	private String name;
	private String year;
	private String color;
	private boolean power; // boolean 초기값은 false
	private int speed;
	
	// 생성자 위치
	Car() {
		// 기본 생성자
	}

	// 생성자의 매개변수 값이 다르면 가능
	/* 오버로딩(메서드 오버로딩, 생성자 오버로딩 가능)
	 * 가능조건 : 매개변수의 개수가 다름, 타입이 다름
	 */
	Car(String name, String year, String color) {
		this.name = name;
		this.year = year;
		this.color = color;
	}
	
	// 메서드 : 내 차종의 정보를 출력하는 메서드(name, year, color)
	public void printCar() {
		System.out.printf("차종의 이름 : %s%n차종의 연식 : %s%n차종의 색깔 : %s%n", name, year, color);
		System.out.println("------------------");
	}
	// 시동켜기 : powerOn
	// power = true, 시동이 켜졌습니다.
	public void powerOn() {
		if (power) {
			System.out.println("power ON 상태 입니다.");
		}
		else {
			power = true;
		}
	}
	// 시동끄기 : powerOff
	// power= false, 시동이 꺼졌습니다.
	public void powerOff() {
		if (!power) {
			System.out.println("power OFF 상태 입니다.");
			return;
		}
		else {
			power = false;			
		}
		if (speed != 0) {
			System.out.println("시동을 끌 수 없습니다.");
		}
	}
	// 속도 올리기 : speedUp 10++
	// 최대속도 200 넘어가면 더이상 speed가 올라가지 않는다
	// power가 true인 상태에서만 동작
	public void speedUp() {
		if (power && 0 <= speed && speed < 200) {
				speed += 10;
				System.out.println("현재 속도 : " + speed);
		}
		if (speed >= 200) {
			speed = 200;
			System.out.println("최고 속도 도달");
		}
	}
	// 속도 내리기 : speedDown 10--
	// 속도가 0이되면 더이상 내려가지 않는다
	// power가 true인 상태에서만 동작
	public void speedDown() {
		if (power && 0 < speed && speed <= 200) {
				speed -= 10;
				System.out.println("현재 속도 : " + speed);
		}
		if (speed <= 0) {
			speed = 0;
			System.out.println("정지");
		}
	}
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}