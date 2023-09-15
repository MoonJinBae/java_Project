package chap_08;

public class _07_String2 {

	public static void main(String[] args) {
		// 자바의정석.java 파일명과 확장자명을 분리하여 출력
		// 파일명 : 자바의정석
		// 확장자 : java
		String file = "자바의정석.java";
		System.out.println(file.substring(0, file.indexOf(".")));
		System.out.println(file.substring(file.lastIndexOf(".")+1));
		
		// file에서 java가 포함되어 있으면 자바파일 이라고 출력
		if (file.contains("java")) { // 조건식은 true / false
			System.out.println("자바파일");
		}		
		
	}

}
