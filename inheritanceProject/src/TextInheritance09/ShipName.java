package TextInheritance09;

public class ShipName {
	public static void search(Ship s) { //static�� �־ Ŭ���� �޼ҵ��̰�(Ŭ���� �̸����� ����)
		//search(Ship s) �޼ҵ尡 ���ڰ����� �޴� ��ü ���� s�� �� ��ȯ�� �����͸� �ޱ� ������
		//s�� ��ĳ���� �ȴ�.
		if(s instanceof MyShip) {
			MyShip b = (MyShip)s; // ��ü���� s�� ������ �ٿ� �ɽ��� �� �� �ִ�.
			System.out.println("MyShip �̸� : "+b.Name());
		}else if(s instanceof YourShip) {
			YourShip b = (YourShip)s; // ��ü���� s�� ������ �ٿ� �ɽ��� �� �� �ִ�.
			System.out.println("Yourship �̸� : "+b.Name());
		}
	}
}