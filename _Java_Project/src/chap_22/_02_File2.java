package chap_22;

import java.io.FileInputStream;
import java.io.IOException;

public class _02_File2 {

	public static void main(String[] args) throws IOException{
		// FileInputStream : 바이트 단위의 스트림
		// out.txt를 읽어오기
		byte[] b = new byte[1024]; // KB
		FileInputStream input = new FileInputStream("out.txt");
		input.read(b);
		
		// byte배열을 문자열로 변경하여 출력
		System.out.println(new String(b));
		input.close();
	}

}
