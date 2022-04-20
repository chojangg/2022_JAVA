package TextInheritance03;

public class Leader extends Student {
	boolean boss;
	
	public Leader(String name, String S_num, boolean boss) {
		super(name, S_num);	//Student 클래스에서 실행
//		this.name = name;
//		this.S_num = S_num;
		this.boss = boss;
	}
	
	void isleader() {
		if(boss) {	//boss가 true면 다음 문장
			System.out.println(name + "은 학급회장이다.");
		}
		else {	//boss가 false면 다음 문장
			System.out.println(name + "은 학급회장이 아니다.");
		}
	}
}
