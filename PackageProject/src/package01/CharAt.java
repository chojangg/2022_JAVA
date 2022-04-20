package package01;

public class CharAt {

	public static void main(String[] args) {
		String str = "I Love korea";
		
		for(int i=0; i<str.length(); i++)
			System.out.print(str.charAt(i));
		// str이 가리키는 문자열의 위치에 해당하는 1개의 문자를 출력
		System.out.println();

	}

}
