package FileTestExam;

import java.io.*;
import java.util.*;

public class sungDatasExam {
	public void readingData(String fname) throws IOException {
		// String fname = "C:/Temp/writed.txt"
		try {
			// File ff = new File(fname);
			// FileReader fr = new FileReader(ff);
			
			FileReader fr = new FileReader(new File(fname));
			// new File(fname)는 임시객체 
			// fr은 writed.txt파일을 가리키는 파일 객체변수
			BufferedReader br = new BufferedReader(fr);
			// 버퍼클래스를 추가한 객체변수는 br이다
			// 버퍼클래스를 사용하는 이유는 속도 증가
			String csvStr = "";
			String tmpStr = "";
			do {
				tmpStr = br.readLine(); // readLine()의 리턴값은 String이다.
				// br이 가리키는 파일의 1줄을 읽어서 tmpStr에 저장
				// tmpStr은 null이 아님
				// 읽을 데이터가 없으면 tmpStr은 null이 된다
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";
					// csvStr = "Kim	용산구	100	100"+"\t"+ "Lee 	구로구	90	90"
					// + "Choi	강남구	100	100" + "\t" + "Hong	강서구	90	90" + "\t"
				}
			} while (tmpStr != null); // true면 do문 반복처리 
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			// csvStr에 저장되어 있는 문자열에서 "\t"를 기준으로 토큰(조각)을 생성
			int length = parse.countTokens() / 4;// length=4
			// parse.countTokens()값은 16이다. 즉 "\t"를 구분자로 하여 
			// 토큰(문자열 조각)이 16개가 생성된 것이다. 
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			// 각각의 배열의 공간이 4개가 만들어진다.
			
			for (int i = 0; i < length; i++) {
				name[i] = parse.nextToken();
				// parse는 첫번째 토큰을 가리킨다. 첫번째 문자열을 읽어서
				// name[i]에 저장한다. 저장한 후에는 nextToken()메소드 의해서
				// parse는 다음 토큰을 가리키게 된다.
				address[i] = parse.nextToken();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();
				// Double래퍼클래스의 valueOf()메소드는 parse가 가리키는 문자열을 
				// 객체타입의 실수형으로 변환한다. doubleValue()메소드는 객체타입의
				// 실수값을 기본형 타입으로 변환후에 math[i]에 저장한다.
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2.0;
			}
			for (int j = 0; j < length; j++) {
				System.out.println(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" 
						+ english[j] + "\t" + total[j] + "\t" + avg[j]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
}
