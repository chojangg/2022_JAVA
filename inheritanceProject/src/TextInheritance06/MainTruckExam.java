package TextInheritance06;

public class MainTruckExam {

	public static void main(String[] args) {
		Truck mytruck = new Truck();
		//mytruck은 Truck 클래스를 가리키는 객체변수
		
		mytruck.speedUp();
		//Truck 클래스에 있는 speedUp()메소드 호출
		
		mytruck.speedDown();
		//Car 클래스에 있는 메소드 호출
	}

}
