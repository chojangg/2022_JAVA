package inheritance05;

public class Circle extends Shape{
	@Override	//재정의 메소드, 어노테이션
	public void draw() {
		System.out.println("Circle");
		super.draw();
	}
}
