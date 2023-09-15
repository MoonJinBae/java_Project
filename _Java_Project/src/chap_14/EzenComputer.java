package chap_14;

import java.util.Iterator;

public class EzenComputer {
	/* - 학생 정보를 관리하기 위한 클래스
	 * - 학생 기본정보 : 이름, 생년월일(나이), 전화번호
	 * - 학원 정보 : 학원명 = "EZEN", 지점
	 * - 수강 정보 : 수강과목, 기간 => 한 학생이 여러과목을 수강하기 위해서는 배열로 처리 5과목
	 * 예) 홍길동 인천지점 자바 6개월(2023-05-23 ~ 2023-11-20)
	 * 	홍길동 인천 파이썬 1개월(2023-07-01 ~ 2023-08-01)
	 *  홍길동 990101, 010-000-00000, 24
	 * 	학원명 : EZEN, 지점 : 인천
	 * 	수강과목 : 자바 6개월(~), 파이썬 1개월(~)
	 * 
	 * 기능
	 * - 학생의 기본정보를 출력하는 기능
	 * - 학생의 학원정보를 출력하는 기능
	 * - 학생의 수강정보를 출력하는 기능
	 * - 학생의 수강정보를 추가하는 기능
	 */
	private String name; //이름
	private String birthDate; //생년월일
	private String age; //나이
	private String phoneNumber; //전화번호
	private String school = "EZNE"; //학원명
	private String branch; //지점
	private String[] classes = new String[5]; // 수강과목
	private String[] duration = new String[5]; // 기간
	
	
	public EzenComputer() {}
	
	public void studentInfo() {
		System.out.printf("이름 :[%s], 생년월일 :[%s], 나이 :[%s], 전화번호 :[%s]%n",name,birthDate,age,phoneNumber);
		System.out.println("---------------------------------------");

	}
	public void schoolInfo() {
		System.out.printf("학원명 :[%s], 지점 :[%s]%n",school,branch);
		System.out.println("---------------------------------------");
	}
	public void classesInfo() {
		for (int i = 0; i < classes.length; i++) {
			if (classes[i] != null) {
				System.out.println("수강과목 : [" + classes[i] + "] 기간 : [" + duration[i] + "]");
			}
		}
	}
	public void addClasses(String a, String b) {
		for (int i = 0; i < classes.length; i++) {
			if (classes[i] == null && duration[i] == null) {
				classes[i] = a;
				duration[i] = b;
				return;
			}
		}
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getClasses() {
		return classes;
	}

	public void setClasses(String[] classes) {
		this.classes = classes;
	}

	public String[] getDuration() {
		return duration;
	}

	public void setDuration(String[] duration) {
		this.duration = duration;
	}
	
	
}
