package studentManager2;

import java.util.Scanner;

public interface StdProgram {
	void printStd(); //학생정보출력
	void addStd(Scanner scan); //학생추가
	void delStd(Scanner scan); //학생삭제
	void modStd(Scanner scan); //학생수정
	void searchStd(Scanner scan);
	void addSub(Scanner scan); //점수추가
	void delSub(Scanner scan); //점수삭제
	void modSub(Scanner scan); //점수수정
}
