package chap_02;

import java.net.Socket;

public class _02_TypeCasting {

	public static void main(String[] args) {
		// 자료형변환 : TypeCasting
		// 자료형 (변수의 타입)
		// a = b 저장하려고 할때 a자료형과 b의 자료형이 맞지 않는다면 오류
		// 자료형 변환을 통해서 양쪽의 자료형을 맞춰주는 역할
		
		// 자동 자료형 변환 : 자료형 변환시 생략해도 문제가 없는 경우
		// 크기가 큰자료형 > 크기가 작은 자료형
		
		// 명시적 형변환 : 에러가 발생하거나, 필요에 의해 형변환이 필요한 경우
		// 리터럴 값 앞에 (타입)
		byte num1 = 1;
		int num2 = num1; // 자동 형변환
		
		double num3 = 10;
		int num4 = (int)num3; // 명시적 형변환
		int num5 = (int)1.2; // 실수를 정수로 변환하면 소수점은 날아감
		System.out.println(num5); // 1
		
		String val = "100";
		int a;
		a = 100 + Integer.parseInt(val); // 문자열 타입 val 을 정수형으로 변경
		System.out.println("인트 값을 바꿔볼까? " + (String.valueOf(a) + 100)); // 변수 a 는 문자열 타입으로 형변환 되서 문자로 인식
		
	}

}
