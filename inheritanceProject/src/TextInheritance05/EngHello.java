package TextInheritance05;

public class EngHello extends Greeting {
	public String name = "Mr.Hong";
	
	public void salHello() {
		System.out.println(name + " Nice to meet you");
	}
	
	public void test() {
		System.out.print(super.name); // super.name�� �θ�Ŭ������ name�� ���
		super.salHello(); // �θ�Ŭ������ �ִ� salHello()�޼ҵ带 ȣ��
	}
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.salHello();
		eng.test();

	}

}
