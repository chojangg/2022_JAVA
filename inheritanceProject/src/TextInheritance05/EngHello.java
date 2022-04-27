package TextInheritance05;

public class EngHello extends Greeting{
	public String name ="Mr.Hong";
	public void sayHEllo() {
		System.out.println(name + "Nice to meet you");
	}
	public void test() {
		System.out.println(super.name);
		super.sayHello();
	}
	
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHEllo();
		eng.test();
	}

}
