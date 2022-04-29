package TextInheritance06;

public class Truck extends Car {
	int ton = 5;
	
	void speedUp() { // 재 정의
		velocity += 10;
		System.out.println("속도 " + velocity + " 증가");
	}

}