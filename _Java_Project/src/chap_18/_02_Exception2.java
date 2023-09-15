package chap_18;

public class _02_Exception2 {

	public static void main(String[] args) {
		/* 0으로 나누었을 때 Exception // ArithmeticException
		 * num1, num2, 연산자를 입력하여 메서드를 실행
		 * 
		 */
		try {
			System.out.println(operater(10, 0, "+"));
			System.out.println(operater(5, 10, "-"));
			System.out.println(operater(10, 0, "*"));
			System.out.println(operater(10, 0, "/"));
			System.out.println(operater(10, 0, "%"));
			System.out.println(operater(10, 0, "&"));
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 리턴 String
			e.printStackTrace();
		}
		System.out.println("계산기 종료");
//		System.out.println(operater(10, 0, "-"));
//		System.out.println(operater(10, 0, "*"));
//		System.out.println(operater(5, 0, "+"));
//		System.out.println(operater(5, 0, "-"));
	}
	
	// 기능 : 두 수를 입력 받고, 연산자를 입력 받아 4칙연산의 결과를 리턴하는 메서드
	// throw를 발생시키기 => 예외 발생시키기
	// throw를 발생 시키게 되면 예외를, 메서드를 호출하는 객체에게 넘기는 현상이 발생됨
	// 메서드 선언부 끝에 throws를 적고, 발생할 수 있는 예외를 반드시 적어줘여 함
	// throws는 RuntimeException은 예외적으로 생략가능
	public static double operater(int num1, int num2, String op) throws RuntimeException { // RuntimeException만 생략가능
		double result = 0; // 결과를 담을 변수
		// 예외가 발생할 수 있는 부분은 미리 처리해 주는 것이 좋음.
		if ((op == "/" || op == "%") && num2 == 0) { // 예외가 발생하는 상황
			// 미리 예외 발생시키기
			throw new RuntimeException("num2는 0이 될수 없습니다.");
		}
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			if (num2 > num1) {
				result = num2 - num1;
			} else {
				result = num1 - num2;
			}
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 > num1) {
				result = (double) num2 / num1;
			} else {
				result = (double) num1 / num2;
			}
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			throw new RuntimeException(op + "는 산술연산자가 아닙니다.");
		}
		return result;
	}
}
