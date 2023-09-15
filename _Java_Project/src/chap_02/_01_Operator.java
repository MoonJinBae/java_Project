package chap_02;

public class _01_Operator { // 연산자

	public static void main(String[] args) {
		// 대입 연산자 : = , +=, -=
		// = 을 기준으로 오른쪽에 있는 값을 왼쪽에 저장
		// a = b : b를 a에 넣어라(저장해라, 덮어써라) a는 반드시 변수여야만 한다
		// a += b : 기존 a의 값과 현재 b를 더해서 a에 저장(a + b = a)
		int a = 10;
		System.out.println("a : " + a); // 10
		
		int b = 20;
		a = b;
		System.out.println("a : " + a); // 20
		
		int c = 1;
		c += a; 
		System.out.println("c : " + c); // 1 + 20 = 21
		c += a;
		System.out.println("c : " + c); // 21 + 20 = 41
		c -= a;
		System.out.println("c : " + c); //21
		//증감연산자
		c++;
		System.out.println("c : " + c); //22
		
		// 산술연산자 : + - * / %(나머지)
		// 정수 / 정수 = 정수 ( 10 / 3 = 3) 소수점 버림
		// 정수 / 실수 = 실수
		// 실수 / 정수 = 실수
		// 실수 / 실수 = 실수
		// 값 / 0 = 예외발생
		System.out.println("3 + 2 = " + (3 + 2)); // 빼기, 곱하기, 나누기 동일
		System.out.println("3 / 2 = " + (3 / 2.0)); // 실수로 출력
		//System.out.println("3 / 0 = " + (3 / 0));  // 예외 발생
		// 나머지 연산자 : % 배수나 약수를 구할때 사용
		System.out.println("3 % 2 = " + (3 % 2));
		// 비교연산자 : 비교연산자의 결과는 true || false
		// >= (이상) <= (이하) > (초과) < (미만) == (같다) != (같지않다)
		// && : and 둘다 true 여야 true 리턴
		// || : or 하나만 true 여도 true 리턴
		System.out.println("3 > 2 ? " + (3 > 2));
		System.out.println("3 < 2 ? " + (3 < 2));
		System.out.println("3 >= 2 ? " + (3 >= 2));
		System.out.println("3 >= 2 ? " + (3 >= 2));
		
		System.out.println("&& 연산자 결과 : "+ (3 > 2 && 3 < 2));
		System.out.println("|| 연산자 결과 : "+ (3 > 2 || 3 < 2));
		
		// 조건선택 연산자 : 삼항연산자
		// (조건식) ? true : false
		// 짝수랑 2로 나누어서 나머지가 0인 값
		System.out.println((3<2) ? "참입니다." : "거짓입니다.");
		
		// 문제 : num가 홀수인지 짝수인지 출력 (조건선택 연산자를 이용하여 출력)
		int num = 10;
		System.out.println((num % 2 == 0) ? "짝수" : "홀수");
		// 문자열을 저장하는 자료형 String
		String result = (num % 2 == 1) ? "짝수" : "홀수";
		System.out.println(result);
		
		// 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 아니면 F
		int score = 70;
		char grade;
		grade= (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >=70) ? 'C' : 'F'; // if 문처럼 사용가능
		System.out.println(grade);
	}

}
