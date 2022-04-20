package package01;

public class ValueofExam {
	public static void main(String args[]) {
		char ch = 'A';	//문자
		String strData1 = "A";	//문자열
		String strDat2;
		strDat2 = String.valueOf(ch);
//		ch가 가지고 있는 데이터를 문자열로 변경
//		static이 붙어있으면 클래스 이름을 쓸 수 있다. (클래스.valueof())
		if(strData1.equals(strDat2))
			System.out.println("같음");
		else
			System.out.println("다름");
	}
}
