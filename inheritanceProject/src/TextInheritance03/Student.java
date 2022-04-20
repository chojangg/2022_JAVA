package TextInheritance03;

public class Student {
	//멤버 변수
	String name;
	String S_num;
	String phone;
	String address;
	String major;
	
	//생성자
	public Student() {
	}
	public Student(String name, String S_num) {
		this.name = name;
		this.S_num = S_num;
	}
	
	//메소드
	void study() {
		System.out.println("공부하다.");
	}
	
	void eat() {
		System.out.println("식사하다.");
	}
	
	void test() {
		System.out.println("시험 보다.");
	}
	
	void extra_act() {
		System.out.println("동아리 활동하다.");
	}
}
