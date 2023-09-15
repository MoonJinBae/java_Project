package studentManager2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StdManager implements StdProgram {
	private List<Student> student = new ArrayList<Student>();
	
	public void add() {
		student.add(new Student("홍길동"));
		student.add(new Student("김영이"));
		student.add(new Student("이순이"));
	}
	@Override
	public void printStd() {
		for(int i=0; i< student.size(); i++) {
			student.get(i).printOne();
		}
		
		
	}
	@Override
	public void addStd(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		student.add(new Student(name));
		System.out.println("추가완료~!!");
	}
	@Override
	public void delStd(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		int index = -1;
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				index = i;
				student.remove(i);
				System.out.println("삭제완료~!!");
				return;
			}
		}
		if(index == -1) {
			System.out.println("존재하지 않습니다.");
		}
	}
	@Override
	public void modStd(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		int index = -1;
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				index = i;
				System.out.println("수정할 정보 >");
				String op = scan.next();
				switch(op) {
				case "이름" : 
					System.out.println("수정할 값 > ");
					String modName = scan.next();
					student.get(i).setName(modName);
					break;
				case "나이" : 
					System.out.println("수정할 값 > ");
					int modAge = scan.nextInt();
					student.get(i).setAge(modAge);
					break;
				case "전화번호" : 
					System.out.println("수정할 값 > ");
					String modPhone = scan.next();
					student.get(i).setPhone(modPhone);
					break;
				default:
					System.out.println("존재하지 않습니다.");
				}
				
			}
		}
		if(index == -1) {
			System.out.println("존재하지 않습니다.");
		}
	}
	@Override
	public void addSub(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		System.out.println("과목>");
		String sub = scan.next();
		System.out.println("점수>");
		int score = scan.nextInt();
		int index = -1;
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				index = i;
				student.get(i).addSubject(sub, score);
			}
		}
		
	}
	@Override
	public void delSub(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		System.out.println("과목>");
		String sub = scan.next();
				int index = -1;
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				index = i;
				student.get(i).delSubject(sub);
			}
		}
		
	}
	@Override
	public void modSub(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		System.out.println("과목>");
		String sub = scan.next();
		System.out.println("점수>");
		int score = scan.nextInt();
		int index = -1;
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				index = i;
				//student.get(i).delSubject(sub);
				student.get(i).addSubject(sub, score);
			}
		}
		
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public void searchStd(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		int index = -1;
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				index = i;
				student.get(i).printOne();
			}
		}
	}
}
