//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� �����մϴ�.
package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

class StringTokenizerExample1_2 {
	public static void main(String args[]) {

		System.out.println("=======================");
		// StringTokenizerExample1_1 ���� �ذ�
		StringTokenizer stok2 = new StringTokenizer("��� �� ������");
		while (stok2.hasMoreTokens()) { // ��ū�� �ִ� ���� �ݺ��ض�
			String str = stok2.nextToken();// ���ڿ��κ��� ��ū�� ����
			System.out.println(str);
		}
		
		System.out.println("===== \\t	=====");
	}
}
