package practice;

import java.io.*;

public class ReaderEx {

	public static void main(String[] args) {
		int var=0;
		// System.in => InputStream (1����Ʈ)
		// InputStreamReader ���� ����
		// F3 �ڵ庸��, F4 ������������
		Reader input = new InputStreamReader(System.in);
		System.out.print("�Է��ϼ���: ");
		try {
			while(true) { // ���ѹݺ�
				var=input.read(); // 1 char ����, �ѱ� 3����Ʈ=>1����
				// �����ڵ� 13 => ����
				if(var==13) break; // Ż������
				System.out.println(var+"==>"+(char)var);
			}
			var=input.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
