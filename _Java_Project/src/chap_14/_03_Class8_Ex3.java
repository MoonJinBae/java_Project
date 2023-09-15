package chap_14;

public class _03_Class8_Ex3 {

	public static void main(String[] args) {
		/* 클래스 생성시 값을 초기화하는 방법
		 * - 기본값, 명시적 초기값, 초기화블럭, 생성자
		 * 1. 기본값 : 기본적으로 지정된 값 int => 0, String => null, boolean => false
		 * 2. 명시적 초기값 : 멤버변수 선언과 동시에 값을 지정하는 방법
		 *	private String name = "홍길동";
		 * 3. 초기화 블럭 : {  } 멤버변수의 초기화
		 * 4. 생성자 : 객체를 생성할 때 초기화 해서 생성
		 * - 초기값들의 우선순위
		 * 기본값(우선순위 낮음) -> 명시적 초기값 -> 초기화 블럭 -> 생성자(우선순위 높음)
		 */
		EzenStudent e = new EzenStudent();
		e.setName("홍길동");
		e.setClassroom("JAVA class");
		e.setPhoneNumber("010-123-4567");
		System.out.println(e);
	}

}
class EzenStudent {
	// 멤버변수 : 지점="incheon", 이름, 반, 전화번호
	private String branch = "incheon"; // 명시적 초기값
	private String name; // 기본값 : null
	private String classroom;
	private String phoneNumber;
	
	{
		// 초기화 블럭 영역
		branch = "인천";
		classroom = "미정";
	}
	
	
	// 생성자
	public EzenStudent() {}
	// using fields 사용 생성자
	public EzenStudent(String branch, String name, String classroom, String phoneNumber) {
		super();
		this.branch = branch;
		this.name = name;
		this.classroom = classroom;
		this.phoneNumber = phoneNumber;
	}

	// print 메서드(toString 가능)
	@Override
	public String toString() {
		return "EzenStudent [branch : " + branch + ", name : " + name + ", classroom : " + classroom + ", phoneNumber : "
				+ phoneNumber + "]";
	}
	// getter / setter

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}