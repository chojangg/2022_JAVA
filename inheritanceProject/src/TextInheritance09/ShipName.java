package TextInheritance09;

public class ShipName {
	public static void search(Ship s) { //static이 있어서 클래스 메소드이고(클래스 이름으로 접근)
		//search(Ship s) 메소드가 인자값으로 받는 객체 변수 s는 형 변환된 데이터를 받기 때문에
		//s는 업캐스팅 된다.
		if(s instanceof MyShip) {
			MyShip b = (MyShip)s; // 객체변수 s를 가지고 다운 케스팅 할 수 있다.
			System.out.println("MyShip 이름 : "+b.Name());
		}else if(s instanceof YourShip) {
			YourShip b = (YourShip)s; // 객체변수 s를 가지고 다운 케스팅 할 수 있다.
			System.out.println("Yourship 이름 : "+b.Name());
		}
	}
}
