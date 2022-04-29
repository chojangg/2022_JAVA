package TextInheritance11;

public class SoundExam {
	public static void main(String[] args) {
		Sound radio = new Radio(); // UpCasting과 유사함
		// radio객체변수는 Radio클래스에서 재 정의된 메소드에 접근
		Sound tv = new TV(); // UpCasting과 유사함
		// tv객체변수는 TV클래스에서 재 정의된 메소드에 접근
		radio.SoundUp(5);
		tv.SoundUp(5);
	}
}
