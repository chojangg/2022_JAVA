package thread01;

public class Top extends Thread{	// ThreadŬ������ ����� �޾ƾ� �Ѵ�.
	public void run() {
		for(int i=0; i<50; i++)
			System.out.println(i + " \t");
	}

}
