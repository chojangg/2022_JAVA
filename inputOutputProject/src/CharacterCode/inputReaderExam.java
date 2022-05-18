package CharacterCode;

import java.io.*;

public class inputReaderExam {

	public static void main(String[] args) {
		Reader reader = new InputStreamReader(System.in);
		// reader 객체변수는 read()메소드에 의해 키보드로 부터
		// 데이터를 입력받을수 있는 권한을 받음
		// InputStreamReader reader = new InputStreamReader(System.in);
		try {
			while(true) {
				int i = reader.read(); // 키보드로 부터 입력받음
				if(i == -1) break; // Ctrl + Z(-1)
				char c = (char)i;
				System.out.print(c);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
	}

}
