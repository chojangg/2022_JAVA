package exception01;

public class FileExam3 {
    public static void main(String[] args) {
        String[] irum = new String[3];
        // irum[0], irum[1], irum[2] 3개 생성

        try {
            for(int i = 0; i < irum.length; i++) {
                System.out.println(irum[i]);
                // irum[3] 되었을 때 catch 문장을 실행
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생");
        }
    }
}
