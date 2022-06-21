package exception01;

import java.io.*;

public class FileExam2 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("datar.txt");		
			FileWriter fw = new FileWriter("dataw.txt");
			int c;
			while((c = fr.read()) != -1) {
				fw.write(c);
			}
		}catch(Exception e) {	// 모든 예외를 처리해 준다
			System.out.println(e.toString());
		}
		

	}

}
