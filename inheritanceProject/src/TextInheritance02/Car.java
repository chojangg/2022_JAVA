package TextInheritance02;

public class Car {
//	멤버변수
	String carname;
	String color = "검정색";
	int velocity;	//속도
	
//	멤버 메서드
	void speedUp() {	//속도 증가
		velocity += 5;
	}
	
	void speedDown() {
		velocity -= 5;	//속도 감소
	}
	
	
}
