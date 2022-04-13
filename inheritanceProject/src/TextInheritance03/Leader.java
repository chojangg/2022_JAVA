package TextInheritance03;

public class Leader extends Student{
	boolean boss;
	
	Leader(String name, String hakbun, boolean boss) {
		super(name, hakbun);	//Student 클래스에서 실행
		this.boss = boss;
	}
	
	public void isLeader() {
		if(boss) 	//boss가 ture이면 다음 문장을 실행한다
			System.out.println(name + "은 학급회장이다.");
		else
			System.out.println(name + "은 학급회장이 아니다.");
	}
}
