package thread02;

public class DerivedThread extends Thread{
	// DerivedThread�� ThreadŬ������ ����� �޾ƾ� �Ѵ�.
	
	public void run() {
		for(int i=0; i<20; i++)
			System.out.print(i + " ");
	}

}