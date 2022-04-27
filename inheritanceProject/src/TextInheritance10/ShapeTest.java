package TextInheritance10;

public class ShapeTest extends ShapeExam{
	//추상 클래스(ShapeExam)를 상속 받았기 때문에 ShapeExam클래스에 있는 모든 추상메소드를
	//모든 추상메소드를 여기(ShapeTest)에서 구현해야 한다.
		@Override
		public double getArea(double r) {
			return 3.14*r*r;
		}
		
		@Override
		public double getCircum(double r) {
			return 3.14*4*2;
		}
	}