package thread02;

public class Thread2Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		DerivedThread d1 = new DerivedThread();	// d1 쓰레드 객체 생성
		DerivedThread d2 = new DerivedThread();	// d2 쓰레드 객체 생성
		
		for(int i=0; i<1000000000; i++) {
//			System.out.println();
		}
		d1.start();	// d1쓰레드 객체에서 run()메소드 실행
		d2.start();	// d2쓰레드 객체에서 run()메소드 실행
		
		System.out.println("프로그램 종료");

	}

}
