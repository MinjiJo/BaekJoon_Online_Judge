//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//�Ѱ��� ��ȹ���ڸ� �������� ��ū�� �����մϴ�.
package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
class StringTokenizerExample3 {
	public static void main(String args[]) {
		
		//��ȹ���� - �޸�(,)�� ������(|)
		StringTokenizer stok = new StringTokenizer("���,��|������", ",|");
		
		while (stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}
