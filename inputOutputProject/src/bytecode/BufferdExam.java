package bytecode;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferdExam {
	public static void main(String args[]) {
		BufferedInputStream bi = new BufferedInputStream(System.in);
		// Ű����� ���� 1����Ʈ�� ���� �� �ְ�, ���۸� ����ϰڴ�.
		// bi��ü
		BufferedOutputStream bo = new BufferedOutputStream(System.out);
		// 1����Ʈ�� ����ϴ� ��ü�ε� ���۸� ����ؼ� ����� �ϰڴ�.
		// ���۸� ����ϴ� ������ ������ ���� ���� ��쿡 �ӵ� ��������.
		
		int aa;
		
		try {
			while((aa = bi.read()) != -1) { // Ctrl + Z
				bo.write(aa); // bo�� ����Ű�� �ӽñ������� ���ۿ� ����Ѵ�.
			}
			bo.flush(); // ���ۿ� ��µǾ� �ִ� �����͸� �Ѳ����� ȭ�鿡 ����Ѵ�.
		}catch(IOException e) {}
	}
}
