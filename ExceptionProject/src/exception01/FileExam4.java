package exception01;

public class FileExam4 {
    public static void main(String[] args) {
        String[] irum = new String[3];
        int jumsu = 99;
        int count = 10;
        int avg = 0;

        try {
            // count�� 0�� �� catch (ArithmeticException ae1)�� ����
            avg = jumsu / count;
            for(int i = 0; i <= irum.length; i++) {
                // irum[3] �Ǿ��� �� catch (ArrayIndexOutOfBoundsException ae2)
                System.out.println(irum[i]);
            }
        }catch (ArithmeticException ae1) {
            System.out.println("0���� ������ ���� �߻�");
        }catch (ArrayIndexOutOfBoundsException ae2) {
            System.out.println("�迭�� ���� ��� ���� �߻�");
        }catch (Exception e) {  // ���� 2������ ���ܰ� �ƴ� ��� ����
            System.out.println("���� �߻�");
        }
    }
}
