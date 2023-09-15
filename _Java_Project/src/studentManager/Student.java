package studentManager;

import java.util.Arrays;

public class Student {
	private String name; // 이름
	private String birth; // 생년월일
	private int age; // 나이
	private String phone; // 전화번호
	private String adress; // 주소
	private School[] sc = new School[5]; // 학생의 학원정보 저장배열
	private int scCount; // 저장배열 인덱스 카운트
	
	public Student() {} // 기본생성자
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, String birth) {
		this(name);
		this.birth = birth;
	} 
	public Student(String name, String birth, int age) {
		this(name, birth);
		this.age = age;
	} 
	public Student(String name, String birth, int age, String phone) {
		this(name, birth, age);
		this.phone = phone;
	} 
	public Student(String name, String birth, int age, String phone, String adress) {
		this(name, birth, age, phone);
		this.adress = adress;
	}
	
	public void insertSubject(School sName) {
		if (scCount == sc.length) {
			School[] tmp = new School[scCount*2];
			System.arraycopy(sc, 0, tmp, 0, scCount);
			sc = tmp;
		}
		sc[scCount] = sName;
		scCount++;
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public School[] getSc() {
		return sc;
	}
	public void setSc(School[] sc) {
		this.sc = sc;
	}
	
	@Override
	public String toString() {
		return "이름[" + name + "], 생년월일[" + birth + "], 나이[" + age + "세], 전화번호[" + phone + "], 주소[" + adress
				+ "]";
	}
	
}
