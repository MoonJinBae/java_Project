package studentManager;

import java.util.Scanner;

public interface Program {
	void printStudent(); // 학생출력기능
	void insertStudent(Scanner scan); // 학생등록
	void searchStudent(Scanner scan); // 학생검색
	void registerSubject(Scanner scan); // 수강신청
	void deletSubject(Scanner scan); // 수강철회
}
