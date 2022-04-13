package inheritance08;

public class InterfaceEx {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3°ú 5¸¦ ´õÇÏ¸é " + phone.calculate(3, 5));
		phone.schedule();
	}

}
