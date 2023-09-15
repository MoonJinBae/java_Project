package chap_21;

import java.util.HashMap;

public class _05_Lambda2 {

	public static void main(String[] args) {
		/* Map을 구성하여 forEach를 이용하여 출력
		 * number.forEach((n)->{
		 * 	System.out.println(n + " );
		 * });
		 */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("철수", 80);
		map.put("영희", 90);
		map.put("길동", 80);
		map.put("철이", 100);
		map.put("영수", 88);
		
		map.forEach((x, y) -> System.out.println(x + ": " + y));
		
		Number add = (a, b) -> { // 함수구현
			return a + b;
		};
		System.out.println(add.add(10, 20)); // 결과 체크
		
		Number max = (a, b) -> (a >= b)? a : b;
		System.out.println(max.add(10, 20));
		
	}

}
// 람다식에서 사용할 함수형 인터페이스
// 메서드가 1개여야 함. 어노테이션 필수
@FunctionalInterface
interface Number{
	int add(int a, int b);
}
