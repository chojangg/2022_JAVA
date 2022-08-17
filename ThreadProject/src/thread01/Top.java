package thread01;

public class Top extends Thread{	// Thread클래스를 상속을 받아야 한다.
	public void run() {
		for(int i=0; i<50; i++)
			System.out.println(i + " \t");
	}

}
