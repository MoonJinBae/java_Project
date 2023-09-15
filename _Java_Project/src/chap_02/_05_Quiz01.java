package chap_02;

public class _05_Quiz01 {

	public static void main(String[] args) {
		// 국어(kor), 영어(eng), 수학(math)
		// 세 값의 합계와 평균을 구하려고 한다.
		// 클럽에 제출
		
		int kor = 99;
		int eng = 81;
		int math = 75;
		int sum = (kor + eng + math);
		double avg = sum / 3; // double avg = sum / 0; (자료형이 double 이고 나누는 값이 0 이면 infinity)
							// 자료형이 int 이고 나누는 값이 0 이면 예외발생
		
		System.out.println("세 과목의 총 합은 : " + sum + " 이고, 평균값은 : " + avg + " 입니다.");
		
		//Math.random : 0과 1사이의 아무값을 출력
		// 0.0 <= Math.random < 1.0
		// (int) (Math.random()*n)+start;
		// (int)0.0 *10 +1  <=   (int) (Math.random()*10)+1   <  (int)1.0*10 +1  : 1 부터 10까지의 랜덤 정수 출력
		int random = (int)(Math.random()*45)+1; // 1부터 45까지의 랜덤 정수 출력
		System.out.println(random);
		System.out.println("\t안녕하세요.");
		System.out.println("\t안녕.");
		System.out.println("\t반가워.\n응 반가워");
		
		
	}

}
