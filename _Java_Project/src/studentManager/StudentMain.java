package studentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Manager m = new Manager();
		/*
		 * --menu-- (main영역) 
		 * 1. 학생등록 
		 * 2. 학생확인(리스트) 
		 * 3. 학생검색(학생정보, 수강정보) 
		 * 4. 수강신청 
		 * 5. 수강철회 
		 * 6. 종료
		 */
		boolean stop = false;
		if (stop == false) {
			do {
				System.out.println("------------menu------------");
				System.out.println("1.학생등록| 2.학생확인| 3.학생검색");
				System.out.println("4.수강신청| 5.수강철회| 6.종료");
				System.out.println("----------------------------");
				int menu = scan.nextInt();
				switch (menu) {
				case 1:
					m.insertStudent(scan);
					break;
				case 2:
					m.printStudent();
					break;
				case 3:
					m.searchStudent(scan);
					break;
				case 4:
					m.registerSubject(scan);
					break;
				case 5:
					m.deletSubject(scan);
					break;
				case 6:
					System.out.println("===종료===");
					stop = true;
					break;
				default:
					System.out.println("다시 입력 하세요.");
					break;
				}
			} while (stop == false);
		}
			
		scan.close();
	}
}
