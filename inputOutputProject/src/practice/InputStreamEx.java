package practice;

import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {
		int a=0;
		// 예외처리 필수 항목: 입출력
		try {
			System.out.print("입력하세요: ");
			// InputStream 1바이트 단위 입력
			a=System.in.read(); // 1바이트 읽음
			while(a!=13) { // 문자코드 13 => 엔터키
				System.out.println(a+"==>"+(char)a);
				a=System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
