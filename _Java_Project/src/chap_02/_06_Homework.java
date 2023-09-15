package chap_02;

public class _06_Homework {

	public static void main(String[] args) {
		// 매일 끝나는 시간에 출제 (클럽에 제출)
		/* 국어 , 영어, 수학 점수의 합계와 평균을 출력
		 * 평균이 80이상이면 결과 : 합격, 아니면 결과 : 불합격 (if문 이용 출력)
		 */
		
		int kor, eng, math;
		kor = 80;
		eng = 70;
		math = 88;
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		avg = Math.round(avg);
		System.out.println("합계 : " + sum + " 평균 : " + avg);
		
		if (avg > 100 || avg < 0) {
			System.out.println("잘못된 결과 입니다.");
		}
		else if (avg >= 80) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
//		if (avg >= 80) {
//			System.out.println("결과 : 합격");
//		}else {
//			System.out.println("결과 : 불합격");
//		}
//		// 평균이 80점 이상이면 상, 60점 이상이면 중, 나머지는 하
//		if (avg >= 80) {
//			System.out.println("등급 : 상");
//		}	
//		else if (avg >= 60) {
//			System.out.println("등급 : 중");
//			}
//			else {
//				System.out.println("등급 : 하");
//			}
		
	}

}
