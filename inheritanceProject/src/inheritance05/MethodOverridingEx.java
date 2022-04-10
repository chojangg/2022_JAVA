package inheritance05;

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); 
	}

	public static void main(String[] args) {
		Line line = new Line(); 	//Line °´Ã¼»ý¼º
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());

	}
}