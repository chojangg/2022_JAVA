package FileTestExam;

import java.io.*;

public class sungDatasMain {
	public static void main(String[] args) {
		sungDatasExam wd = new sungDatasExam();
		// sungDatasExam클래스의 wd 객체 생성
		try{
			wd.readingData("C:/Temp/writed.txt");
			// readingData메소드를 호출. 인자값으로 writed.txt전달
		} catch(IOException e){
				e.printStackTrace();
			}
		}
}