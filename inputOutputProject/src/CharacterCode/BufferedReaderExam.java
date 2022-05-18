package CharacterCode;

import java.io.*;

public class BufferedReaderExam {

	public static void main(String[] args) {
		InputStreamReader bi = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(bi);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String aa = br.readLine();
			// 키보드로 부터 라인단위로 데이터를 읽어서 aa에 저장
			System.out.println(aa);
			br.close();
			bi.close();
		}catch(IOException ie) {}
	}

}
