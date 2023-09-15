package studentManager;

import java.util.Scanner;

public class Manager implements Program {
	
	private Student[] std = new Student[5];
	private int stdCount;
	
	@Override
	public void printStudent() { // 학생정보 출력
		std[stdCount].toString();
	}
	@Override
	public void insertStudent(Scanner scan) { // 학생등록
		if (stdCount < std.length) {
			System.out.println("학생이름 =>");
			String name = scan.next();
			System.out.println("생년월일 =>");
			String birth = scan.next();
			System.out.println("나이 =>");
			int age = scan.nextInt();
			System.out.println("전화번호 =>");
			String phone = scan.next();
			System.out.println("주소 =>");
			String adress = scan.next();
			Student s = new Student(name, birth, age, phone, adress);
			std[stdCount] = s;
			stdCount++;
			
			System.out.println("------------------");//학원정보
			System.out.println("지점 =>");
			String branch = scan.next();
			System.out.println("과목 =>");
			String subject = scan.next();
			System.out.println("수강기간 =>");
			String period = scan.next();
			System.out.println("수업 요일 =>");
			String courseDate = scan.next();
			System.out.println("강의시간 =>");
			String time = scan.next();
			System.out.println("강사명 =>");
			String teacher =scan.next();
			new School(branch, subject, period, courseDate, time, teacher);

		}
		if (stdCount == std.length) {
			Student[] tmp = new Student[stdCount*2];
			System.arraycopy(std, 0, tmp, 0, stdCount);
			std = tmp;
		}
	}

	@Override
	public void searchStudent(Scanner scan) { // 학생검색
		// 해당학생의 학생정보, 수강정보
		String name = scan.next();
		for (int i = 0; i < stdCount; i++) {
			if (name.equals(std[i].getName())) {
				std[i].toString();
				std[i].getSc()[i].toString();
			}
			
		}
	}

	@Override
	public void registerSubject(Scanner scan) { // 수강등록
		int index = -1;
		String name = scan.next();
		for (int i = 0; i < stdCount; i++) {
			if (name.equals(std[i].getName())) {
				index = i;
				System.out.println("신청과목 =>");
				String subject = scan.next();
				std[index].getSc()[index].setSubject(subject);
			}
		}
		if (index == -1) {
			System.out.println("등록되지 않은 학생입니다.");
		}
	}

	@Override
	public void deletSubject(Scanner scan) { // 수강철회
		int index = -1;
		String name = scan.next();
		for (int i = 0; i < stdCount; i++) {
			if (name.equals(std[i].getName())) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("등록되지 않은 학생입니다.");
		}
		System.out.println("수강철회과목 =>");
		String subject = scan.next();
		if (subject.equals(std[index].getSc())) {
			
		}
		std[index].getSc()[index].setSubject(subject);
	}
	public Student[] getStd() {
		return std;
	}
}
