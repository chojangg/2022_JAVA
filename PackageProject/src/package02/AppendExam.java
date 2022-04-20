package package02;

public class AppendExam {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		
		str1 = sb1.append(" Project");
//		sb1이 가리키는 문자열뒤에 "Project"이 추가, sb1이 가리키는 문자열을 데이터가
//		추가 되었기 때문에 변경이 발생
//		sb1, str1은 같은 문자열 주소 가리킴
		str2 = sb1.append(sb2);
//		변경된 sb1이 가리키는 문자열에 sb2 문자열을 추가한다.
//		str2, str1, sb1은 같은 문자열의 주소값을 가지게 된다.
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println();
	}

}
