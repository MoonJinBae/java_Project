package chap_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _08_Stream3 {

	public static void main(String[] args) {
		/* Student 클래스를 리스트로 구성하여 값을 add
		 * 3명만 추가
		 */
		
		ArrayList<Student> st = new ArrayList<>();
		st.add(new Student("길동", 80));
		st.add(new Student("오정", 99));
		st.add(new Student("오공", 78));
		
		// List를 스트림으로 구성하여 콘솔에 출력 예) 홍길동 : 98
		// List를 스트림으로 구성 스트림 객체 s 생성
		Stream<Student> s = st.stream();
		s.forEach(n -> System.out.println(n)); // toString 출력
		st.stream().forEach(n -> System.out.println(n.getName() + " : " + n.getScore()));
		
		
		List<Student> st2 = Arrays.asList(
				new Student("김구", 100),
				new Student("익점", 80),
				new Student("순신", 99)
				);
		
		// 점수합계를 출력
		int sum = st2.stream().mapToInt(n -> n.getScore()).sum();
		System.out.println(sum);
		// 인원수 출력
		long count = st2.stream().count();
		System.out.println(count + "명");
	}

}
