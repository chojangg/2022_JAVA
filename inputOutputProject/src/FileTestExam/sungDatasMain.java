package FileTestExam;

import java.io.*;

public class sungDatasMain {
	public static void main(String[] args) {
		sungDatasExam wd = new sungDatasExam();
		// sungDatasExamŬ������ wd ��ü ����
		try{
			wd.readingData("C:/Temp/writed.txt");
			// readingData�޼ҵ带 ȣ��. ���ڰ����� writed.txt����
		} catch(IOException e){
				e.printStackTrace();
			}
		}
}