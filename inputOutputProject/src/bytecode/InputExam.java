package bytecode;

//import java.io.*;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {
 // InputStream is = System.in으로 표현 가능
 // is 객체변수는 키보드로부터 입력 받는 read() 메소드 사용 가능
 public static void streamTest(InputStream is) {
     try {
         while(true) {
             int i = is.read();  // 키보드로부터 1개의 문자를 입력
             if(i == -1) break;  // ctrl + z를 누르면 break 문장 실행
             char c = (char)i;   // 형변환
             System.out.print(c);    // 출력력        
             // 한글데이터 처리 불가
             }
     }
     catch(IOException e) {
         System.err.println(e);
     }
 }
 public static void main(String[] args) {
     // streamTest() 메소드 호출
     streamTest(System.in);
 }
}
