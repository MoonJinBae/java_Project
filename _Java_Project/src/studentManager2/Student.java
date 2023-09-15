package studentManager2;

import java.util.HashMap;

public class Student {
	// 멤버변수 : 이름, 나이, 전화번호, 점수, 합계, 평균
	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> subject = new HashMap<>();
	private int sum;
	private double avg;

	public Student() {
	}

	public Student(String name) {
		this.name = name;
		this.age = 15;
	}

	public void printOne() {
		System.out.println(name + "(" + age + ")");
		if (phone != null) {
			System.out.println(phone);
		}
		printSub();
		calc();
		if (sum != 0) {
			System.out.println("result : " + sum + "[" + avg + "]");
		} else {
			System.out.println("점수가 없습니다.");
		}
		System.out.println("---------------");
	}

	public void printSub() {
		for (String tmp : subject.keySet()) {
			System.out.println(tmp + " : " + subject.get(tmp));
		}
	}

	public void addSubject(String sub, int score) {
		subject.put(sub, score);
		System.out.println("점수 추가 완료~!!");
	}

	public void delSubject(String sub) {

		if (subject.remove(sub) == null) {
			System.out.println("해당과목이 없습니다.~!!");
			return;
		} else {
			subject.remove(sub);
			System.out.println("점수 삭제 완료~!!");
		}

	}

	public void calc() {
		this.sum = 0;
		this.avg = 0;

		for (String sub : subject.keySet()) {
			sum += subject.get(sub);
		}
		avg = (double) sum / subject.size();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public HashMap<String, Integer> getSubject() {
		return subject;
	}

	public void setSubject(HashMap<String, Integer> subject) {
		this.subject = subject;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
