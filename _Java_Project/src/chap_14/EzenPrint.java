package chap_14;

import java.util.Arrays;
import java.util.Scanner;

public class EzenPrint {

	public static void main(String[] args) {
//		EzenComputer e = new EzenComputer();
//		e.setName("홍길동");
//		e.setBirthDate("880820");
//		e.setAge("36");
//		e.setPhoneNumber("010-123-4567");
//		e.studentInfo();
//		
//		e.setBranch("인천");
//		e.schoolInfo();
//
//		e.addClasses("자바", "2023-01 ~ 2023-04");
//		e.addClasses("파이썬", "2023-04 ~ 2023-05");
//		e.addClasses("자바스크립트", "2023-04 ~ 2023-08");
//		e.addClasses("자바", "2023-07 ~ 2023-10");
//		e.classesInfo();
		
		EzenComputer1 ec = new EzenComputer1();
		ec.setName("철수");
		ec.setAge("36");
		ec.setBirth("880101");
		ec.setPhone("010-111-1111");
		ec.setBranch("인천");
//		ec.printCompany();
//		ec.printInfo();
		ec.insertCourse("java", "1개월");
		ec.insertCourse("python", "1개월");
		ec.insertCourse("js", "1개월");
		ec.insertCourse("html", "1개월");
		ec.insertCourse("css", "1개월");
//		ec.printCourse();
//		System.out.println("-----------------------");
		EzenComputer1 ec2 = new EzenComputer1("영희","010-222-2222","인천","890202","35");
//		ec2.printInfo();
		ec2.insertCourse("python", "2개월");
//		ec2.printCourse();
//		System.out.println("-----------------------");
		EzenComputer1 ec3 = new EzenComputer1("순식","010-333-3333","인천","900202","34");
//		ec3.printInfo();
		ec3.insertCourse("java", "3개월");
//		ec3.printCourse();
//		System.out.println("-----------------------");
		EzenComputer1 ec4 = new EzenComputer1("홍식","010-444-4444","서울","910202","33");
//		ec4.printInfo();
		ec4.insertCourse("java", "4개월");
		ec4.insertCourse("python", "4개월");
//		ec4.printCourse();
//		System.out.println("-----------------------");
		EzenComputer1 ec5 = new EzenComputer1("영순","010-555-5555","서울","920202","32");
//		ec5.printInfo();
		ec5.insertCourse("js", "5개월");
		ec5.insertCourse("html", "5개월");
		ec5.insertCourse("css", "5개월");
//		ec5.printCourse();
//		System.out.println("-----------------------");
		EzenComputer1 ec6 = new EzenComputer1("희철","010-666-6666","서울","930202","31");
//		ec6.printInfo();
		ec6.insertCourse("js", "6개월");
		ec6.insertCourse("html", "6개월");
		ec6.insertCourse("css", "6개월");
//		ec6.printCourse();
//		System.out.println("-----------------------");
		EzenComputer1 ec7 = new EzenComputer1("정숙","010-777-7777","서울","940202","30");
//		ec7.printInfo();
		ec7.insertCourse("java", "7개월");
		ec7.insertCourse("python", "7개월");
//		ec7.printCourse();
//		System.out.println("-----------------------");
		
		
		/* 숙제
		 * 배열로 5명의 학생 등록 후  // 마음대로 등록
		 * - 이름으로 검색(어느 지점(학원정보)의 무슨과목(수강정보)을 듣고 있는지 출력)
		 * - 지점으로 검색(지점(학원정보)에 있는 학생(학생정보)들 모두 출력)
		 */
		EzenComputer1[] std = {ec, ec2, ec3, ec4, ec5, ec6, ec7};
		
		Scanner scan = new Scanner(System.in);
		// 이름 : 철수, 영희, 순식, 홍식, 영순, 희철, 정숙 // 지점 : 인천, 서울
		System.out.println("---학생이름으로 검색---");
		String val = scan.next();
		// 이름으로 검색
		System.out.println("학생이름 : " + val);
		int cnt = 0;
		for (EzenComputer1 ez : std) {
			if (ez.getName().equals(val)) { // String은 ==로 비교할 수 없음
				ez.printCompany(); // 학원정보
				ez.printInfo(); // 학생정보
				ez.printCourse(); // 수강정보
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("등록되지 않은 학생입니다.");
		}
		System.out.println("------------------------");
		
		// 지점으로 검색
		System.out.println("---지점으로 검색---");
		val = scan.next();
		System.out.println("지점 : " + val);
		cnt = 0;
		for (EzenComputer1 ez : std) {
			if (ez.getBranch().equals(val)) {
				ez.printCompany(); // 학원정보
				ez.printInfo(); // 학생정보
				ez.printCourse(); // 수강정보
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("등록되지 않은 지점입니다.");
		}
		
		// 수강과목으로 검색
		System.out.println("---수강과목 검색---");
		val = scan.next();
		System.out.println("과목 : " + val);
		cnt = 0; // 학생의 번지
		while (cnt < std.length) {
			for (int i = 0; i < std[cnt].getCourse().length; i++) { // 수강과목의 번지
				if (std[cnt].getCourse()[i] != null) {
					if (val.equals(std[cnt].getCourse()[i])) {
						std[cnt].printCompany();
						std[cnt].printInfo();
						std[cnt].printCourse();
						System.out.println("-------------------------");
					}
				}
			}
			cnt++;
		}
		
	}

}
