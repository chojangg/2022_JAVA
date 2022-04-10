package inheritance04;

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)				//p가 Person 자료형이면 True발생
			System.out.println("Person");	//p가 Student 자료형이면 True발생
		if(p instanceof Student)
			System.out.println("Student");
		if(p instanceof Researcher)
			System.out.println("Researcher");
		if(p instanceof Professor)
			System.out.println("Professor");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("new Student() --> \t"); print(new Student());
		System.out.println("new Student() --> \t"); print(new Researcher());
		System.out.println("new Student() --> \t"); print(new Professor());
	}

}
