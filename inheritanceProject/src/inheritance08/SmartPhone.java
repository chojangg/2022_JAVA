package inheritance08;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	// MobielPhoneInteface의 추상 메소드 구현
		@Override
			public void sendCall() {
			System.out.println("따르릉따르릉");
			}
		
		@Override
			public void receiveCall() {
				System.out.println("전화가 왔어요");
			}
		@Override
		public void sendSMS() {
			System.out.println("문자가 갑니다.");
		}
		@Override
			public void receiveSMS() {
				System.out.println("문자 왔어요");	
			}
		@Override
			public void play() {
				System.out.println("음악 연주합니다.");
				
			}
		@Override
			public void stop() {
			System.out.println("음악 중단합니다.");
				
			}
//		추가로 작성한 메소드
		public void schedule() {
			System.out.println("일정 관리 합니다.");
		}
		
//		Mp3 Interface의 추상메소드 구현
	}
