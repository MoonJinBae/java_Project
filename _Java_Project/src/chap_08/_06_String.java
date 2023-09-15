	package chap_08;

public class _06_String {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루는 클래스(참조 변수)
		 * String str = new String(); // 정석
		 * String str = "홍길동"; // 일반 자료형처럼 사용가능.
		 */

		String str = "Hello World~!!"; // 한 글자마다 배열처럼 이용가능
		System.out.println(str);
		
		// length : 전체 글자의 길이
		System.out.println("--length--");
		System.out.println(str.length()); // 14글자
		
		// charAt(index) : index번지에 있는 문자열을 반환
		System.out.println("--charAt()--");
		System.out.println(str.charAt(0));
		
		// subString : 문자열 추출
		System.out.println("--substring--");
		System.out.println(str.substring(3)); // 3번지부터 끝까지
		System.out.println(str.substring(3, 10)); // 3번지부터 10번지 직전까지
		System.out.println(str.substring(3, 10+1)); // 3번지부터 10번지까지

		// str.compareTo(str1) : str문자열과 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a")); // 1
		System.out.println("a".compareTo("c")); // -2 (앞에 있는 칸만큼)
		System.out.println("a".compareTo("a")); // 0
		
		// concat : 이어붙이기(+연산자와 같은 의미)
		System.out.println("--concat--");
		System.out.println("Hello".concat(" Apple~!!"));
		System.out.println("Hello " + "Apple~!!");
		
		// equals : 두 문자열이 같은지 확인(대소문자 구분) 같으면 true
		// 문자는 == 연산자로 비교가 안됨
		// 참조변수를 == 로 비교하면 주소가 같은지 비교
		System.out.println("--equals--");
		System.out.println("A".equals("a")); // false
		System.out.println("abc".equals("abc")); // true
		
		// indexOf : 문자의 위치를 찾아주는 기능, 찾는 문자가 없으면 -1을 리턴
		// lastIndexOf : 문자의 위치를 뒤에서 부터 찾아주는 기능
		System.out.println("--indexOf--");
		System.out.println(str.indexOf("W")); // 6번째 index위치(0부터)
		System.out.println(str.lastIndexOf("l"));
		
		String email = "hello1234@naver.com";
		// 아이디를 추출 => 출력 (처음부터 @전까지)
		System.out.println(email.indexOf("@"));
		System.out.println(email.substring(0, email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));
		
		// 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("    Hello   ". trim());
		
		// toLowerCase(), toUpperCase() 대소문자 변환
		System.out.println("--toLowerCase--");
		System.out.println("--toLowerCase--".toLowerCase());
		System.out.println("--toUpperCase--".toUpperCase());
		
		// isEmpty() : 객체가 비어있는지 체크(비어있으면 true)
		System.out.println("--isEmpty--");
		System.out.println(str.isEmpty()); // false
		
		// replace : 글자를 치환(변환)
		System.out.println("--replace--");
		System.out.println("Hello World".replace("World", "Java"));
		
		// split : 특정 값을 기준으로 나누기(배열로 리턴)
		System.out.println("--split--");
		String str1 = "dog,cat,tiger";
		String[] arr = str1.split(",");
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		String[] arr2 = str1.split(""); // ""한글자씩
		for (String string : arr2) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		String num1 = "1";
		String num2 = "2";
		String sum = num1 + num2;
		System.out.println(sum); // 12
		// parseInt : 문자를 숫자로
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3 + num4); // 3
		// String.valueOf() : 숫자를 문자로 
		// instanceof : 객체의 자료형이 일치하는지 체크(기본자료형은 체크x)
		int a = 12345;
		String s = String.valueOf(a);
		System.out.println(s instanceof String);
		
		// contains : 해당 글자가 포함되어 있는지를 체크 (리턴값 boolean)
		System.out.println(str.contains("Hello"));
		
	}

}
