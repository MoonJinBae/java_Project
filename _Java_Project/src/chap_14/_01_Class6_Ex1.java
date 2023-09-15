package chap_14;

public class _01_Class6_Ex1 {

	public static void main(String[] args) {
		// Car class를 활용한 생성자 연습
		Car c = new Car();
		c.setName("Tiguan");
		c.setColor("White");
		c.setYear("2016/6");
		c.setDoor("4Door");
		c.setAirback("4EA");
		c.printInfo();
		Car c1 = new Car("Zeta", "Blue", "2020/3");
		c1.printInfo();
		Car c2 = new Car("Porsche", "Red", "2023/5", "2Door");
		c2.printInfo();
		Car c3 = new Car("Benz", "Black", "2018/12", "4Door", "4EA");
		Car c4 = new Car("Benz", "Gray", "2022/2", "4Door", "4EA", true, 200);
		System.out.println("--c3--");
		c3.printInfo();
		c3.powerOnOff();
		
		c3.speedUp();
		c3.speedUp();
		c3.speedUp();
		c3.setSpeed(200);
		c3.speedUp();
		c3.speedUp();
		c3.speedDown();
		c3.speedDown();
		c3.setSpeed(0);
		c3.speedDown();
		c3.speedDown();
		System.out.println("--c4--");
		c4.printInfo();
		c4.speedUp();
		c4.speedDown();
		c4.speedDown();
		//toString 호출
		System.out.println("--toString()--");
		System.out.println(c4);
//		System.out.println(c4.toString()); // 위와 동일
	}

}
// Car class 작성 위치
class Car{
	private String name;
	private String color;
	private String year;
	private String door;
	private String airback;
	private boolean power;
	private int speed;
	
	// 멤버변수 : name, color, year, door, airback, power, speed
	// 멤버변수 생성 => getter / setter 생성
	// 생성자 : 기본생성자
	
	
	
	
	public Car() {} // 기본생성자
	// 생성자2 : name, color, year 받는 생성자
	public Car(String name, String color, String year) {
		this.name = name;
		this.color = color;
		this.year = year;
	}
	// 생성자3 : name, color, year, door 받는 생성자
	public Car(String name, String color, String year, String door) {
		// 생성자 호출
		this(name, color, year); // 생성자 호출은 반드시 첫줄에 해야함
//		this.name = name;
//		this.color = color;
//		this.year = year;
		this.door = door;
	}
	// 생성자4 : name, color, year, door, airback  받는 생성자
	public Car(String name, String color, String year, String door, String airback) {
		// 생성자 호출
		this(name, color, year, door); // 생성자 호출은 반드시 첫줄에 해야함
//		this.name = name;
//		this.color = color;
//		this.year = year;
//		this.door = door;
		this.airback = airback;
	}
	// 전체 받는 생성자
	public Car(String name, String color, String year, String door, String airback, boolean power, int speed) {
		//super();  // 상속자가 가지고 있는 생성자
		this.name = name;
		this.color = color;
		this.year = year;
		this.door = door;
		this.airback = airback;
		this.power = power;
		this.speed = speed;
	}
	// 메서드
	// printInfo() : name, color, year, door, airback 출력
	public void printInfo() {
		System.out.printf("Car Info%nname : %s%ncolor : %s%nyear : %s%ndoor : %s%nairback : %s%n", 
				name, color, year, door, airback);
		System.out.println("----------------");
	}
	// toString() : 
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", year=" + year + ", door=" + door + ", airback=" + airback
				+ "]";
	}
	
	// powerOnOff()
	public void powerOnOff() {
		power = !power;
	}

	// speedUp()
	public void speedUp() {
		int max = 200;
		if (power) {
			if (speed == max) {
				System.out.println("SPEED MAX : " + max);
				speed = max;
			} else {
				speed += 10;
				System.out.println("SPEED(+) : " + speed);
			}
		}
	}
	// speedDown()
	public void speedDown() {
		int stop = 0;
		if (power) {
			if (speed == stop) {
				System.out.println("STOP");
				speed = stop;
			} else {
				speed -= 10;
				System.out.println("SPEED(-) : " + speed);
			}
		}
	}
	// getter/setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getAirback() {
		return airback;
	}
	public void setAirback(String airback) {
		this.airback = airback;
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