package ex11_1_String;

public class StringExample9_2 {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";
		int len = message.length();
		
		/* 1. 배열크기는 배열이름.length로 구합니다.
		   예) arr.length
		   2. 문자열 갯수는 String.length()로 구합니다.
		   예) message.length();
		 */

		System.out.println("총 글자수 = " + message.length());
		System.out.println("===공백의 index 위치 찾기 : charAt()===");
		// message 중에서 ' '을 찾음
		for (int i = 0; i < len; i++) {
			if (message.charAt(i) == ' ') {
				System.out.println("index = " + i);
			}
		}

		System.out.println("===공백의 index 위치 찾기 : substring()===");
		for (int i = 0; i < len; i++) {
			if (message.substring(i, i + 1).equals(" ")) {
				System.out.println("index = " + i);
			}
		}

		System.out.println("===공백의 index 위치 찾기 : indexOf()===");
		int index;
		for(int i = 0; ; i = index+1) {
			index = message.indexOf(' ', i);
			if(index==-1)
				break;
			System.out.println("index = " + index);
		}
	}
}
