package TextInheritance01;

public class Student {
	// 멤버변수 작성
	String name;
	String hakbun;
	String telephone;
	String address;
	String department;
	
	// 메소드 작성
	public Student() {};
	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	public void study() {
		System.out.println("공부하다.");
	}
	public void eat() {
		System.out.println("식사하다.");
	}
	public void test() {
		System.out.println("시험보다.");
	}
	public void extra_act() {
		System.out.println("동아리 활동하다.");
	}
	
}
