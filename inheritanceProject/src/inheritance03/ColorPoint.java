package inheritance03;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y); // super()메서드는 1개만 기술한다
		this.color = color;
		// super(x,y); --ColorPoint생성자의 첫번째 줄에 위치해야 한다
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}

}
