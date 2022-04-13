package inheritance07;

public interface PhoneInterface {
//	자바 7버전
	final int TIMEOUT = 10000;	//상수필드(대문자로 표현)
	void sendCall();	//추상메소드
	void receiveCall();	//추상메소드
	
//	자바 8버전
	default void printLogo() {	//추상메소드가 아닌 일반메소드, default 붙임(버전8 이상)
		System.out.println("** Phone **");
	}
}
