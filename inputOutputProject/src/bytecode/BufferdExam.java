package bytecode;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferdExam {
	public static void main(String args[]) {
		BufferedInputStream bi = new BufferedInputStream(System.in);
		// 키보드로 부터 1바이트를 읽을 수 있고, 버퍼를 사용하겠다.
		// bi객체
		BufferedOutputStream bo = new BufferedOutputStream(System.out);
		// 1바이트를 출력하는 객체인데 버퍼를 사용해서 출력을 하겠다.
		// 버퍼를 사용하는 이유는 데이터 양이 많을 경우에 속도 빨라진다.
		
		int aa;
		
		try {
			while((aa = bi.read()) != -1) { // Ctrl + Z
				bo.write(aa); // bo가 가리키는 임시기억공간에 버퍼에 출력한다.
			}
			bo.flush(); // 버퍼에 출력되어 있는 데이터를 한꺼번에 화면에 출력한다.
		}catch(IOException e) {}
	}
}
