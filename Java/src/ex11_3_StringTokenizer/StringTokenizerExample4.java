package ex11_3_StringTokenizer;

import java.util.*;

class StringTokenizerExample4 {
	public static void main(String args[]) {
		//true : ��ȹ���ڵ� ��ū���� �����ϵ��� ����� ����
		StringTokenizer stok = new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
		
		while (stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}
