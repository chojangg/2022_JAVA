package bytecode;

import java.io.IOException;

public class ReadFromSysExam {

	public static void main(String[] args) {
		byte[] b = new byte[1024]; // �迭 ����
		int len = 0;
		try {
			len = System.in.read(b);
			// �迭 b�� �Է��� �����͵��� �����ϴµ� �Է��� ��������
			// ���̰��� �����ؼ� len�� ����
			// ���࿡ �Է��� ���� 'meister'�̸� len�� 7�� ���� �ȴ�.
			System.out.write(b,0,len);
			// �迭 b�� ����Ǿ� �ִ� �����͸� 0��°���� �����Ͽ�
			// len���̸�ŭ ����ض�
		} catch(IOException e) {
			System.out.println("�Է½���");
		}

	}

}
