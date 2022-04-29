package package03;

public class IntegerEqualExam {
	public static void main(String[] args) {
		Integer in1 = new Integer(100); // 객체형
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(200);
		
		int a=100; // 기본형
		int b=100; 
		
		
		System.out.println("in1.equals(in2)==>" + in1.equals(in2));
		System.out.println("in1.equals(in3)==>" + in1.equals(in3));
		
		System.out.println("a==b==>" + (a==b));
	}
}
// Wrapper클래스를 사용하는 이유
// 1. java.util패키지의 클래스들은 객체 데이터만 처리
// 2. ArrayList, Collection 프레임 워크의 구조는 객체타입만 저장(자료구조)
// 3. 멀티쓰레드에서 동기화를 지원하려면 객체가 필요함
