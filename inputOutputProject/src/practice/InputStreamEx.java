package practice;

import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {
		int a=0;
		// ����ó�� �ʼ� �׸�: �����
		try {
			System.out.print("�Է��ϼ���: ");
			// InputStream 1����Ʈ ���� �Է�
			a=System.in.read(); // 1����Ʈ ����
			while(a!=13) { // �����ڵ� 13 => ����Ű
				System.out.println(a+"==>"+(char)a);
				a=System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
