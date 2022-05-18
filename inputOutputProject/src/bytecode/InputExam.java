package bytecode;

//import java.io.*;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {
 // InputStream is = System.in���� ǥ�� ����
 // is ��ü������ Ű����κ��� �Է� �޴� read() �޼ҵ� ��� ����
 public static void streamTest(InputStream is) {
     try {
         while(true) {
             int i = is.read();  // Ű����κ��� 1���� ���ڸ� �Է�
             if(i == -1) break;  // ctrl + z�� ������ break ���� ����
             char c = (char)i;   // ����ȯ
             System.out.print(c);    // ��·�        
             // �ѱ۵����� ó�� �Ұ�
             }
     }
     catch(IOException e) {
         System.err.println(e);
     }
 }
 public static void main(String[] args) {
     // streamTest() �޼ҵ� ȣ��
     streamTest(System.in);
 }
}
