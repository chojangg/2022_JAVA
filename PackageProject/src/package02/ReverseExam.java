package package02;

public class ReverseExam {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java Programming");
		StringBuffer sb2 = null;
		
		sb2 = sb1.reverse();
		// sb1이 가리키는 문자열을 역 방향으로 변경한다.
		// 따라서 sb1과 sb2는 같은 문자열의 주소를 가리킨다.
		System.out.println("sb2=>" + sb2);
		System.out.println("sb1=>" + sb1);

	}

}
