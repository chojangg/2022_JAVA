package FileWriterExam;

import java.io.*;
import java.util.*;

public class sungDataRWExam {
	int length;
	String[] name = new String[10];
	String[] address = new String[10];
	double[] math = new double[10];
	double[] english = new double[10];
	double[] total = new double[10];
	double[] avg = new double[10];

	public void writingData(String fname) throws IOException {
		// String fname = "C:/Temp/writing.txt"
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(new File(fname));
			// fw는 "writing.txt"파일을 가리키는 객체변수이다.
			bw = new BufferedWriter(fw);
			// bw는 fw가 라리키는 파일을 가리키며, 버퍼라는 클래스를 추가하여 사용한다.
			
			for (int j = 0; j < length; j++) {
				bw.write(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] 
						+ "\t" + total[j] + "\t" + avg[j]);
				// bw가 가리키는 파일 "writing.txt"에 출력한다.
				bw.newLine(); // BufferedWriter클래스는 newLine()메소드를 가지고 있다.  
				// newLine()는 줄바꿈
			}
			bw.close(); // 파일을 닫을때는 객체생성의 역순으로 한다. 
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}

	public void readingData(String fname) throws IOException {
		// String fname = "C:/Temp/writed.txt"
		// 배열에 파일으로 부터 읽어들인 데이터를 저장한다.
		try {
			String csvStr = "";
			String tmpStr = "";
			FileReader fr = new FileReader(new File(fname));
			BufferedReader br = new BufferedReader(fr);
			do {
				tmpStr = br.readLine();
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";
				}
			} while (tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			length = parse.countTokens() / 4;
			for (int i = 0; i < length; i++) {
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2.0;
			}
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
}
