package inheritance06;

public class GoodCalc extends Calculator{
	@Override
	public int add(int a, int b) {	//반드시 재정의(재정의 하지 않으면 오류 발생)
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {	//반드시 재정의(재정의 하지 않으면 오류 발생)
		return a - b;
	}
	@Override
	public double average(int[] a) {	//반드시 재정의(재정의 하지 않으면 오류 발생)
		double sum = 0;
		for(int i = 0; i < a.length; i++) 
			sum += a[i];
		return sum / a.length;
	}
	public static void main(String [] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {1, 2, 3, 4}));
	}
}
