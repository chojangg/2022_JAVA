package practice;

import java.io.*;

public class ReaderEx {

	public static void main(String[] args) {
		int var=0;
		// System.in => InputStream (1바이트)
		// InputStreamReader 문자 단위
		// F3 코드보기, F4 계층구조보기
		Reader input = new InputStreamReader(System.in);
		System.out.print("입력하세요: ");
		try {
			while(true) { // 무한반복
				var=input.read(); // 1 char 문자, 한글 3바이트=>1글자
				// 문자코드 13 => 엔터
				if(var==13) break; // 탈출조건
				System.out.println(var+"==>"+(char)var);
			}
			var=input.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
