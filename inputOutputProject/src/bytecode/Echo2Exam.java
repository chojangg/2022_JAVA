package bytecode;

import java.io.IOException;

public class Echo2Exam {
    public static void main(String[] args) {
        int bt;
        try {
            // ctrl + zŰ�� ���ÿ� ������ -1�� ����
            // while ������ false�� �Ǳ� ������ ����
            // ������ �ѱ�ó�� �Ұ�
            while((bt = System.in.read()) != -1)
                System.out.print((char)bt);
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
