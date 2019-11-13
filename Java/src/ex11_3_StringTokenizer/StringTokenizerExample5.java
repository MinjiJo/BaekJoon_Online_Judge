package ex11_3_StringTokenizer;

import java.util.*;

class StringTokenizerExample5 {
	public static void main(String args[]) {
		//true : 구획문자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|", true);
		
		System.out.println("상품이름\t상품 수");
		
		while (stok.hasMoreTokens()) {
			String token = stok.nextToken();
			if(token.equals("=")) {
				System.out.print("\t");
			} else if(token.equals("|")) {
				System.out.print("\n");
			} else {
				System.out.print(token);
			}
		}
	}
}
