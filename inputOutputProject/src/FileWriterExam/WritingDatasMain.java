package FileWriterExam;

import java.io.*;

public class WritingDatasMain {
	public static void main(String[] args) {
		sungDataRWExam wd = new sungDataRWExam();
		try {
			wd.readingData("C:/Temp/writed.txt");
			wd.writingData("C:/Temp/writing.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
