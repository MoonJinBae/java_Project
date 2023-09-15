package chap_01;

public class _01_Variable {
	public static void main(String[] args) {
		int num1;
		int num2, num3, num4; //같은 자료형은 같이 선언가능
		num1 = 123; //선언된 변수에 값을 지정
		System.out.println(num1);
		// = 대입연산자 : 왼쪽에 있는 리터럴 값이 오른쪽의 변수로 저장
		num1 = 345; // 기존 값은 지워지고 현재 값으로 덮어씀
		System.out.println(num1);
		
		int num5 = 111;  //선언과 저장을 동시에 처리 가장 많이 사용하는 형태
		int num6=1, num7=2, num8=3;
		//중복 변수는 선언 불가능.
		// 8개의 자료형 변수는 지역변수 범위(scope) { }
		
		int a;
		//명령문(구문) { }
		if(true) {
			a = 11;
		}
		System.out.println(a);
		
		char ch = 'a';  //(char 자료형에서만 사용) 한글자만 저장시 ''
		double dou = 1.5;
		byte b = 1;
		boolean bool = false; //true / false만 저장가능.
		
		int appleCount;  //변수명은 의미있게 짓는것을 추천
		//중복선언 불가능.
		//long(L), float(f F)  두개는 접미사가 붙어야 인식됨.
		long l = 123456L;
		float f = 1.2f;
		
		num2 = 010; //8진수로 인식
		num3 = 0x10; //16진수로 인식
		
		// 국어점수(kor), 영어점수(eng), 수학점수(math) 변수를 선언하고, 값을 저장
		// 세 점수의 합을 콘솔에 찍어보기
		// + - *  / %(나머지)
		int kor = 90;
		int eng = 89;
		int math = 23;
		int sum = kor+eng+math;
		// System.out.println(kor + eng + math);
		System.out.println(sum);
		
		
		String eq1 = "<";
		String eq2 = "=";
		int eq3 = Integer.valueOf(eq1);
		System.out.println(1+ eq3+ 2);
		
		
		
		
		
		
		
		
		
		
	}
}
