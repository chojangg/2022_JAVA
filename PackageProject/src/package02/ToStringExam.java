package package02;

public class ToStringExam {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java Programming");
		String str = null;
		
		str = sb1.toString();
		// sb1은 StringBuffer클래스 타입의 문자열인데 String타입으로 
		// 변경해서 str에게 넘겨준다.
		// String str = "java Programming"와 같다.
		System.out.println("str=>"+ str);
		System.out.println("str.toUpperCase=>"+ str.toUpperCase());
		// str이 가리키는 문자열을 대문자로 변경해서 출력
		System.out.println("str=>"+ str);
	}

}
