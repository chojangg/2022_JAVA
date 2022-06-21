package exception01;

public class FileExam4 {
    public static void main(String[] args) {
        String[] irum = new String[3];
        int jumsu = 99;
        int count = 10;
        int avg = 0;

        try {
            // count가 0일 때 catch (ArithmeticException ae1)이 실행
            avg = jumsu / count;
            for(int i = 0; i <= irum.length; i++) {
                // irum[3] 되었을 때 catch (ArrayIndexOutOfBoundsException ae2)
                System.out.println(irum[i]);
            }
        }catch (ArithmeticException ae1) {
            System.out.println("0으로 나누는 예외 발생");
        }catch (ArrayIndexOutOfBoundsException ae2) {
            System.out.println("배열의 범위 벗어난 예외 발생");
        }catch (Exception e) {  // 위의 2가지의 예외가 아닌 경우 실행
            System.out.println("예외 발생");
        }
    }
}
