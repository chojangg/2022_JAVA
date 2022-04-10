package inheritance03;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		x=0; y=0;
	}
	
	public Point(int x, int y) { // x,y는 매개변수
		this.x=x;
		this.y=y;
	}
	
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
	
}
