package bytecode;

import java.io.IOException;

public class Echo2Exam {
    public static void main(String[] args) {
        int bt;
        try {
            // ctrl + z키를 동시에 누르면 -1이 리턴
            // while 문장이 false가 되기 때문에 종료
            // 여전히 한글처리 불가
            while((bt = System.in.read()) != -1)
                System.out.print((char)bt);
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
