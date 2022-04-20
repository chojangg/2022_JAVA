package package01;

public class SubstringExam {

	public static void main(String[] args) {
		String strData1 = "I Love You";	//문자열 데이터가 고정
		String strData3;
		strData3 = strData1.substring(7);
		System.out.println("strData3.substring(7) -> " + strData3);
//		strdata1이 가리키는 문자열의 7번째 이후의 문자열 끝까지 반환
//		문자열의 위치는 0부터 출발		
		
		strData3 = strData1.substring(2,5);
//		2번째 문자부터 시작해서 마지막 - 1 (5-1)까지 문자열을 반환한다.
//		2~4부터 문자열
		System.out.println("strData3.substring(2,5) -> " + strData3);
	}

}
