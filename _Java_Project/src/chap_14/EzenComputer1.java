package chap_14;

public class EzenComputer1 {
	//멤버 변수 선언
	private String name;
	private String birth;
	private String age;
	private String phone;
	private final String COMPANY = "EZEN"; // final은 대문자로 처리
	private String branch;
	private String[] course = new String[5]; // 수강과목
	private String[] period = new String[5]; // 기간
	private int cnt; // 배열의 index 처리용
	
	// 생성자
	public EzenComputer1() {}
	
	public EzenComputer1(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	public EzenComputer1(String name, String phone, String branch, String birth, String age) {
		this(name, phone, branch);
		this.birth = birth;
		this.age = age;
	}
	// 메서드
	public void printInfo()	{
		System.out.println("--학생정보--");
		System.out.println("이름:"+name+", age:"+age+"세");
		System.out.println("tel:"+phone+", 생년월일:"+birth);
	}
	public void printCompany() {
		System.out.println("==학원정보==");
		System.out.println("학원명:"+COMPANY+", 지점:"+branch);
	}
	
	public void printCourse() { // 배열 -> for 반복하여 출력
		if(course.length == 0 || cnt == 0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		// cnt까지만 출력 => 추가되지 않은 값은 출력x
		for (int i = 0; i < cnt; i++) { // 수강과목 => 1과목
			System.out.println("과정:"+course[i]+"("+period[i]+")");
		}
	}
	// 수강정보 등록 => insertCourse() 한번 호출하면 1과목 등록
	public void insertCourse(String course, String period) {
		// cnt = 0 => 아직 추가값 없음
		if (cnt >= 5) {
			System.out.println("더이상 수강할 수 없습니다.");
			return;
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++; // 1개 담고 번지 증가
	}
	// getter / setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getCOMPANY() {
		return COMPANY;
	}
	
}
