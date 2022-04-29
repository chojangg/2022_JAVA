package package03;

public class parseDataExam {
	public static void main(String[] args) {
		String a="10" , b="20";
		int sum=0;
		float average=0;
		System.out.println("input data : " + a + " " + b);
		int c= Integer.parseInt(a);
		// parseInt(a);는 String형 데이터를 기본 데이터형(정수)으로 
		// 변환하는 메소드이다. a값을 정수형으로 변환후 c에 저장
		int d= Integer.parseInt(b);
		sum = c+d;
		average=sum/2;
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println("평균 = " + average);
	}
}
