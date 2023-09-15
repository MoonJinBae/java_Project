package chap_22;

import java.io.File;

public class _05_File5 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\UserK\\Desktop\\Eclipse2021-09(4.21)\\JavaWorkspace\\Ezen_Java_Project\\out2.txt");
		String fileName = f.getName(); // 파일의 경로 빼고 이름만 출력
		System.out.println("경로를 제외한 파일이름 : " + fileName);
		System.out.println("경로를 포함한 파일이름 : " + f.getPath());
		System.out.println("경로를 포함한 파일이름 : " + f.getAbsolutePath());
		System.out.println("경로만 : " + f.getParent());
		System.out.println("파일 구분자 : " + File.separator); // 자주 사용
		// f에 대한 경로(드라이브, 경로, 파일명, 확장자)
		// 문자 추출을 통해서 분리
		String fstr = f.toString();
		System.out.println("-----드라이브-----");
		System.out.println(fstr.substring(0, fstr.indexOf(File.separator)));
		System.out.println("-----경로-----");
		System.out.println(fstr.substring(fstr.indexOf(File.separator)));
		System.out.println("-----파일명-----");
		System.out.println(fstr.substring(fstr.lastIndexOf(File.separator)+1, fstr.lastIndexOf(".")));
		System.out.println("-----확장자-----");
		System.out.println(fstr.substring(fstr.lastIndexOf(".")+1));
		System.out.println("-------------------");
		// 문자열의 추가나 변경등 많은 작업을 할 경우 String => StringBuffer 많이 사용.
		StringBuffer sb = new StringBuffer();
		// append 추가
		sb.append("Hello");
		sb.append(" ");
		sb.append("World~!!");
		
		// insert 사이에 추가
		sb.insert(0, "JAVA ");
		sb.insert(sb.indexOf("H"), "Hi~!");
		// delete 삭제
		sb.delete(0, sb.indexOf("!")+1);
		
		String a = sb.toString();
		System.out.println(a);
		
		String b = "";
		b += "Hello~!";
		b += " ";
		b += "World~!";
		System.out.println(b);
		
		
	}

}
