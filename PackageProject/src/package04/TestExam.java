package package04;

public class TestExam {
	public static void main(String[] args) {
		// �ֻ���(1~6)�� 10�� ������ 1�� ���� ������ 500���� �ް�,
		// 2�� ���� ������ 1000���� �ް�, 3�� ���� ������ 1500���� �ް�,
		// 4�� ���� ������ 2000���� �ް�, 5�� ���� ������ 2500���� �ް�,
		// 6�� ���� ������ 3000���� ������ ��ü �ݾ���?
		int num, sum = 0;
		for(int i=0; i<10; i++) {
			num = (int) (Math.random() * 6) + 1;
			System.out.println((i+1)+"�� �ݾ� : "+num*500);
			sum+=500*num;
		}
		System.out.println("��ü �ݾ� : "+sum);
	}
}


// ������ Ǯ��
/*public class TestExam {
	public static void main(String[] args) {
		// �ֻ���(1~6)�� 10�� ������
		// 1�� ���� ������ 500���� �ް�,
		// 2�� ���� ������ 1000���� �ް�,
		// 3�� ���� ������ 1500���� �ް�,
		// 4�� ���� ������ 2000���� �ް�,
		// 5�� ���� ������ 2500���� �ް�,
		// 6�� ���� ������ 3000���� ���� �� 
		// ��ü �ݾ��� ���ΰ�?
		int count; // ���ڹ߻��� ������ ����
		int sum=0; // �ݾ��� �հ踦 ������ ����
		
		for(int i=0; i<10; i++) {
			count = (int) (Math.random() * 6) + 1;
			// sum = sum + count*500;
			sum += count*500;
			System.out.println(count + " : " + count*500);
		}
		System.out.println(); // �� �ٲ�
		System.out.println("��ü�ݾ��� : " + sum);
	}
}
*/