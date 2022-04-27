package TextInheritance10;

public class ShapeMainTest {

	public static void main(String[] args) {
		ShapeTest s = new ShapeTest();
		System.out.println("반지름이 12.34인 원의 면적 "+s.getArea(12.34));
		System.out.println("반지름이 12.34인 원의 면적 "+s.getCircum(12.34));

	}

}
