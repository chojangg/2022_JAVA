package CharacterCode;

import java.io.*;

public class inputReaderExam {

	public static void main(String[] args) {
		Reader reader = new InputStreamReader(System.in);
		// reader ��ü������ read()�޼ҵ忡 ���� Ű����� ����
		// �����͸� �Է¹����� �ִ� ������ ����
		// InputStreamReader reader = new InputStreamReader(System.in);
		try {
			while(true) {
				int i = reader.read(); // Ű����� ���� �Է¹���
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
