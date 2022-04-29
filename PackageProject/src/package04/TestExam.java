package package04;

public class TestExam {
	public static void main(String[] args) {
		// 주사위(1~6)를 10번 던져서 1의 눈이 나오면 500원을 받고,
		// 2의 눈이 나오면 1000원을 받고, 3의 눈이 나오면 1500원을 받고,
		// 4의 눈이 나오면 2000원을 받고, 5의 눈이 나오면 2500원을 받고,
		// 6의 눈이 나오면 3000원을 받을때 전체 금액은?
		int num, sum = 0;
		for(int i=0; i<10; i++) {
			num = (int) (Math.random() * 6) + 1;
			System.out.println((i+1)+"의 금액 : "+num*500);
			sum+=500*num;
		}
		System.out.println("전체 금액 : "+sum);
	}
}


// 선생님 풀의
/*public class TestExam {
	public static void main(String[] args) {
		// 주사위(1~6)를 10번 던져서
		// 1의 눈이 나오면 500원을 받고,
		// 2의 눈이 나오면 1000원을 받고,
		// 3의 눈이 나오면 1500원을 받고,
		// 4의 눈이 나오면 2000원을 받고,
		// 5의 눈이 나오면 2500원을 받고,
		// 6의 눈이 나오면 3000원을 받을 떄 
		// 전체 금액은 얼마인가?
		int count; // 숫자발생을 저장할 변수
		int sum=0; // 금액의 합계를 저장할 변수
		
		for(int i=0; i<10; i++) {
			count = (int) (Math.random() * 6) + 1;
			// sum = sum + count*500;
			sum += count*500;
			System.out.println(count + " : " + count*500);
		}
		System.out.println(); // 줄 바꿈
		System.out.println("전체금액은 : " + sum);
	}
}
*/