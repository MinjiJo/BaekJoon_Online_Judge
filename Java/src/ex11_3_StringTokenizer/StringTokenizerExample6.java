package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample6 {
	public static void main(String[] args) {
		String phone = "010-1234-5678";
		
		StringTokenizer str = new StringTokenizer(phone, "-");
		
		System.out.println("*** StringTokenizer : " + phone + " 토큰 분리 ***");
		
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		
		System.out.println("*** String의 split 메소드 이용 : " + phone + " 토큰 분리 ***");
		String[] st = phone.split("-");
		//배열의 갯수가 가변적일 때 length 속성을 이용한다.
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		
		System.out.println("=============== 향상된 for문 ===============");
		
		for(String token : st) {
			System.out.println(token);
		}
	}
}
