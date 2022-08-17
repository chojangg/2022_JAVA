package thread01;

public class Thread1Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top d = new Top();	// Top 클래스의 d 쓰레드 객체 생성
		d.start();	// Top클래스에 있는 run()메소드 실행
		System.out.println("프로그램 종료");

	}

}
