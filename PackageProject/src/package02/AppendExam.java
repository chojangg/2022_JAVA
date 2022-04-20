package package02;

public class AppendExam {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		
		str1 = sb1.append(" Project");
		// sb1이 가리키는 문자열뒤에 " Project"이 추가된다. 따라서 sb1이 가리키는 문자열에 데이터가
		// 추가 되었기 때문에 데이터 병경이 발생했다.
		// 따라서 sb1과 str1은 같은 문자열의 주소를 가리킨다. 출력해보면 같은 결과
		str2 = sb2.append(sb2);
		System.out.println("sb1 = "+sb1);
		System.out.println("sb2 = "+sb2);
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);

	}
}
